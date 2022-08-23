package edu.training.demarshalling;



import edu.training.TraineesData.TraineesSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * The aim of this class is to convert XML file to java using JAXB with the xmlRoot POJO
 */


public class XmlToJava {

    public static void main(String[] args) {

        try {

            // Create a file to store the converted java to xml result
            File xmlFile = new File("src\\main\\resources\\index.html");

            // Define JAXB with TraineesSet instance that's annotated as XML root element
            JAXBContext jaxbContext = JAXBContext.newInstance(TraineesSet.class);
            // Call Unmarshaller interface that represent the response message in SOAP communication model
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            // Display xml file contents as java in the console using DisplayXmlElements method
            DisplayXmlElements((TraineesSet) unmarshaller.unmarshal(xmlFile));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * DisplayXmlElements used to print the converted xml to the console using stream
     *
     * @param traineesSet represent the unmarshalling result
     */
    public static void DisplayXmlElements(TraineesSet traineesSet) {

        traineesSet.getTraineesList().stream().forEach((traineeObject) -> {
            System.out.println(traineeObject);
        });
    }

}
