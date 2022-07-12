package testXmlReader;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XmlReader {



    public String getXmlValue(String name, int ind) throws ParserConfigurationException, IOException, SAXException {
        String s ="";
        File file = new File("test.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbFactory.newDocumentBuilder();
        Document doc = db.parse(file);
        return s = doc.getElementsByTagName(name).item(ind).getTextContent();
    }

    public String getXmlAttribute(String name) throws ParserConfigurationException, IOException, SAXException {
        String s ="";
        File file = new File("ConfigData.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbFactory.newDocumentBuilder();
        Document doc = db.parse(file);
        NodeList nList = (NodeList) doc.getElementsByTagName(name);
        Node node = nList.item(1);
        Element element = (Element) node;
        return s = element.getAttribute("value");
    }

}
