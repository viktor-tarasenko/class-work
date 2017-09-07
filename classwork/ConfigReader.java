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
        Node configuration = nodeList.item(0);
        String directory = null;
        String extension = null;
        for (int i = 0; i < configuration.getChildNodes().getLength(); i++) {
            Node node = configuration.getChildNodes().item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE && "directory".equals(node.getNodeName())){
                directory = node.getTextContent();
                System.out.println(directory);
            }
            else if (node.getNodeType() == Node.ELEMENT_NODE && "extension".equals(node.getNodeName())) {
                extension = node.getTextContent();
                System.out.println(extension);
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
