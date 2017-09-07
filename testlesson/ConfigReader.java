package testlesson;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;

public class ConfigReader {

    private String directory;
    private String extension;

    public ConfigReader() {

    }

    private ConfigReader(String directory, String extension){
        this.directory = directory;
        this.extension = extension;
    }

    public static ConfigReader create(String xmlConfig) throws Exception{
        File xmlFile = new File(xmlConfig);
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(xmlFile);

        NodeList nodeList = doc.getElementsByTagName("configuration");
        String extension = null;
        String directory = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if ("directory".equals(node.getNodeName())){
                directory = node.getTextContent();
                System.out.println(directory);
            } else if ("extension".equals(node.getNodeName())) {
                extension = node.getTextContent();
                System.out.println(directory);
            }
        }
        return new ConfigReader(directory,extension);
    }

    public String getDirectory(){
        return directory;
    }
    public String getExtension(){
        return extension;
    }
}
