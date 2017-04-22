package application.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by Miki on 13.03.2017.
 */
public class XmlFactory<T> {

    private Class<T> type;

    public XmlFactory(Class<T> type) {
        this.type = type;
    }

    public T XmlToObject(String xml) {
        T object = null;

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(type);
            XMLInputFactory xif = XMLInputFactory.newInstance();
            StringReader stringReader = new StringReader(xml);
            XMLStreamReader xrs = xif.createXMLStreamReader(stringReader);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            object = (T) unmarshaller.unmarshal(xrs);
            return object;

        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

        return object;
    }

    public String objcetToXml(T object) {
        String result = "objcetToXml ERROR";

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(type);
            Marshaller m = jaxbContext.createMarshaller();
            StringWriter stringWriter = new StringWriter();
            m.marshal(object,stringWriter);
            result = stringWriter.toString();
            return result;

        } catch (JAXBException e) {
            e.printStackTrace();
        }


        return result;
    }
}






























