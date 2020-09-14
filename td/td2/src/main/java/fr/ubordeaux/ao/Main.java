package fr.ubordeaux.ao;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;


public class Main {
    public String getGreeting() {
        return "Hello world.";
    }
    public static Document ReadXmlFile(String filePath) {
        try {
            File file = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            return doc;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.exit(1);
        }        
        return null;
    }

    public static void main(String[] args) {    
        if(args.length > 0) {
            Document document = ReadXmlFile(args[0]);
        }
        System.out.println(new Main().getGreeting());
    }
}
