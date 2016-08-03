package com.others;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import static java.lang.System.out;

public class ReadXMLFile {

    public static void main(String argv[]) {
        String file = null;
        if (argv != null && argv.length > 0) {
            file = argv[0];
        } else {
            file = "/Users/Optiplex/IdeaProjects/ConfigFiles/Monet/agendaConfig/agenda.config";
        }
        validXMLFile(file);
    }

    public static void validXMLFile(String file) {

        try {
            out.println("Validando archivo:" + file);
            File fXmlFile = new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            doc.getDocumentElement().normalize();
        } catch (Exception e) {
            out.println("Error al validar archivo:" + file);
            e.printStackTrace();
        }
    }
}
