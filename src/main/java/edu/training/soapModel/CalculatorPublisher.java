package edu.training.soapModel;

import javax.xml.ws.Endpoint;

/**
 * This class used to generate a wsdl file from the java code by publish a specified URL
 * Where to get the wsdl file and xsd file after run the code:
 * wsdl: http://localhost:8080/calculator?wsdl
 * xsd: http://localhost:8080/calculator?xsd=1
 * where xsd URL is the schemaLocation attribute for xsd tag inside the wsdl
 * (wsimport -p task15.wsdl -keep http://localhost:8080/calculator?wsdl) command used
 * to generate java from wsdl in user module
 */


public class CalculatorPublisher {
    // Define URL to publish web service on it
    private static final String URL = "http://localhost:8080/calculator";

    public static void main(String[] args) {

        System.out.println("service published at:" + URL);
        // crete and publish end point for calculator object to the specified URL
        Endpoint.publish(URL, new Calculator());
    }
}
