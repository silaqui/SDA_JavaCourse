import workers.AbstractEmployee;
import workers.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Miki on 18.02.2017.
 */
public class Application {
    public static void main(String[] args) {

        List<AbstractEmployee> employeeList = new ArrayList<>();
        employeeList.add(new AbstractEmployee("Miki", "Woz", 4000, "JAVA"));
        employeeList.add(new AbstractEmployee("Marysia", "Woz", 4000, "JAVA"));
        employeeList.add(new AbstractEmployee("Michal", "Woz", 3000, "HR"));
        employeeList.add(new AbstractEmployee("Martynka", "Woz", 6000, "PM"));
        employeeList.add(new AbstractEmployee("Andrzej", "Woz", 5000, "Director"));
        employeeList.add(new AbstractEmployee("Krystyna", "Woz", 6000, "Director"));

        employeeList.stream()
                .filter(e -> e.getDepartment().equals("JAVA"))
                .forEach(e -> System.out.println(e.toString()));
        System.out.println();

        employeeList.stream()
                .filter(e -> e.getFirstName().endsWith("a"))
                .forEach(e -> System.out.println(e.toString()));
        System.out.println();

        employeeList.stream()
                .filter(e -> e.getSalary() > 3000)
                .forEach(e -> System.out.println(e.toString()));
        System.out.println();

        employeeList.stream()
                .filter(e -> e.getDepartment().equals("JAVA"))
                .filter(e -> e.getSalary() > 3000)
                .forEach(e -> System.out.println(e.toString()));


        List<AbstractEmployee> javaEmployeeList = employeeList.stream()
                .filter(e -> e.getDepartment().equals("JAVA"))
                .collect(Collectors.toList());

        System.out.println("Java employee:");
        javaEmployeeList.stream()
                .forEach(e -> System.out.println(e.toString()));

        System.out.println("Woz last name");
        employeeList.stream()
                .filter(e -> e.getLastName().equals("Woz"))
                .forEach(e -> System.out.println(e.toString()));

        System.out.println("Woz last name - starts with");
        employeeList.stream()
                .filter(e -> e.getLastName().startsWith("Woz"))
                .forEach(e -> System.out.println(e.toString()));

        System.out.println("Dzilimy liste na mape ludzi gdzie klucza to ich imie a vartosci to abstract emploty");
        Map<String, AbstractEmployee> map = employeeList.stream()
                .collect(Collectors.toMap((e -> e.getFirstName()), e -> e));
        map.forEach((k, v) -> System.out.println(k + ":" + v));

        //9. zwracamy lsite employee szukanej po imie + " " nazwisko
        System.out.println("Wyswietl Miki Woz");
        employeeList.stream()
                .filter(e -> (e.getFirstName() + " " + e.getLastName()).equals("Miki Woz"))
                .forEach(e -> System.out.println(e.toString()));


        //10. sortowanie po sallary
        System.out.println("sortowanie po pensji");
        employeeList.sort((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);
        employeeList.forEach(e -> System.out.println(e.getFirstName() + " " + e.getSalary()));
        //11. wyseietl employee ktory zaraba najwiecej
        System.out.println("zarabia najwiecej");
        AbstractEmployee richestEmployee = employeeList.stream()
                .max((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1)
                .get();
        System.out.println(richestEmployee);
        //12. wyseietl employee ktory zaraba najmniej
        System.out.println("zarabia majmniej");
        AbstractEmployee poorestEmployee = employeeList.stream()
                .max((e1, e2) -> e1.getSalary() < e2.getSalary() ? 1 : -1)
                .get();
        System.out.println(poorestEmployee);


        Map<String, List<AbstractEmployee>> stringListMap = listToMap(employeeList);
        List<AbstractEmployee> tmpList = new ArrayList<>();
        stringListMap.entrySet()
                .stream()
                .forEach(e ->
                {
                    List<AbstractEmployee> value = e.getValue();
                    value.stream()
                            .filter(e1 -> e1.getSalary() > 3000)
                            .forEach(e1 -> tmpList.add(e1));

                });
        System.out.println(tmpList);
    }

    public static Map<String, List<AbstractEmployee>> listToMap(List<AbstractEmployee> employees) {
        Map<String, List<AbstractEmployee>> map = new HashMap<>();
        for (AbstractEmployee employee : employees)
        {
            if (map.containsKey(employee.getDepartment()))
            {
                List<AbstractEmployee> listOfEmployee = map.get(employee.getDepartment());
                listOfEmployee.add(employee);
            } else
            {
                ArrayList<AbstractEmployee> listOfEmployees = new ArrayList<>();
                listOfEmployees.add(employee);
                map.put(employee.getDepartment(), listOfEmployees);
            }
        }
        return map;
    }

}














