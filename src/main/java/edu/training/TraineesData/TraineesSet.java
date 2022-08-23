package edu.training.TraineesData;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * The aim of this class is to create traineesSet tag which will be a container tag for the trainees
 */


@XmlRootElement                 // Define TraineesSet as XmlRootElement
public class TraineesSet {

    private List<Trainees> traineesList;    // Define a list to store trainees information

    /**
     * Define No argument default constructor
     */


    public TraineesSet() {
    }

    /**
     * Define Getter and Setter method to traineesList
     */


    public List<Trainees> getTraineesList() {
        return traineesList;
    }

    public void setTraineesList(List<Trainees> traineesList) {
        this.traineesList = traineesList;
    }
}
