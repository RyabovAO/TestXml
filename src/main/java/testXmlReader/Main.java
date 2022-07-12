package testXmlReader;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        testTeg("staff", 0);
        testAtr("page");
    }

    public static void testAtr(String name) throws ParserConfigurationException, IOException, SAXException {
        String s = "";
        XmlReader xmlReader = new XmlReader();
        s = xmlReader.getXmlAttribute(name);
        System.out.println(s);
    }

    public static void testTeg(String name, int item) throws ParserConfigurationException, IOException, SAXException {
        String s = "";
        XmlReader xmlReader = new XmlReader();
        s = xmlReader.getXmlValue(name, item);
        System.out.println(s);
    }

}
