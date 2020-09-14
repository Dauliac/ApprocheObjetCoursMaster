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

    public static void main(String[] args) {      
        if(args.length > 0) {
            try {
                File file = new File(args[0]);
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(new Main().getGreeting());
    }
}
