package fr.ubordeaux.ao;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.NamedNodeMap;
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
            System.exit(1);
        }
        return null;
    }
    public static List<Node> findSVGInDocument(Document document){
        try {
            Document document = ReadXmlFile("./test.svg");
            NodeList svgListDOM = document.getElementsByTagName("svg");
            
            SVGList = new ArrayList<>();

            for (int i = 0; i < svgListDOM.getLength(); i++) {
                Node svgDOM = svgListDOM.item(i);
                SVGList.add(svgDOM)
            }
            return SVGList;
    }

    public static void main(String[] args) {
        //if(args.length > 0) {
            // Document document = ReadXmlFile(args[0]);
            try {
                Document document = ReadXmlFile("./test.svg");
                List<Node> SVGList = findSVGInDocument(document);
                NodeList svgListDOM = document.getElementsByTagName("svg");

                for (int i = 0; i < svgListDOM.getLength(); i++) {
                    Node svgDOM = svgListDOM.item(i);
                    NamedNodeMap attributes = svgDOM.getAttributes();
                    if (attributes != null) {
                        int length = attributes.getLength();
                        Map<String, String> namespaceMap = new HashMap<String, String>(length);
                        for (int j = 0; j < length; j++) {
                            Node attr = attributes.item(j);
                            String prefix = attr.getPrefix();
                            System.out.println(attr);
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}