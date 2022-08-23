package edu.training.marshalling;


import edu.training.TraineesData.Trainees;
import edu.training.TraineesData.TraineesSet;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * JavaToXml class responsible for convert java object to XML using JAXB
 * the xml output expected to have a list of trainees data
 * Xml output inside a file called index.html inside the resource package
 */


public class JavaToXml {

    public static void main(String[] args) {

        try {

            // Define object reference to TraineesSet class to store trainees' info.
            TraineesSet traineesSet = new TraineesSet();

            // Create a file to store the converted java to xml result
            File xmlFile = new File("src\\main\\resources\\index.html");

            // Define JAXB with TraineesSet instance that's annotated as XML root element
            JAXBContext jaxbContext = JAXBContext.newInstance(TraineesSet.class);


            // pass the trainees list to TraineesSet list
            traineesSet.setTraineesList(initializeTraineesList());
            // Define Marshaller where it's responsible for sending data in SOAP communication model
            Marshaller marshaller = jaxbContext.createMarshaller();
            // send xml data to xmlFile
            marshaller.marshal(traineesSet,xmlFile);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Define a list which will initialized by trainees information
     * @return list of trainees data
     */


    public static List<Trainees> initializeTraineesList(){
        // Define a List which will include the trainees' info. to pass it to TraineesSet List.
        List<Trainees> traineesList = new ArrayList<>();

        // Add trainees data to the list
        traineesList.add(new Trainees("Abdulghaffar Abed","BZU","Backend",3.21));
        traineesList.add(new Trainees("Ahmad Ayman","BZU","Frontend",2.81));
        traineesList.add(new Trainees("Saeed","Al-najah","Backend",2.99));

        return  traineesList;
    }

}