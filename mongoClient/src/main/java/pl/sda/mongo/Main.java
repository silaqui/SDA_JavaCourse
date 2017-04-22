package pl.sda.mongo;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;

import java.util.List;

/**
 * Created by Miki on 08.03.2017.
 */
public class Main {

    public static void main(String[] args) {
        PostsDAO dao = new PostsDAO();
        Post post = new Post("Ziomek","Fajne klapki");

//        dao.intesr(post);


//        List<DBObject> result = dao.searchById(new ObjectId("58c0507f1917401e580b6bd4"));
//
//        for(DBObject postFromDB:result) {
//            System.out.println(postFromDB.toString());
//        }

//        dao.remove(new ObjectId("58c04dc319174007e835f2de"));

        dao.updateById(new Post("ByłoMiki","AJestZiki"),new ObjectId("58c04dc319174007e835f2de"));

        System.out.println();
    }
}
