package edu.training;

import  training.wsdl.CalculatorService;
import training.wsdl.Calculator;
/**
 * This class represent the user which will request services where the server that include the web service
 * Will response and return a result to this user to represent SOAP communication model using JAX-WS
 */


public class User {

    // Initialize two constant numbers to use them inside calculator methods
    public static final double FIRSTNUMBER = 15;
    public static final double SECONDNUMBER = 17.3;

    public static void main(String[] args) {

        // Create reference for Calculator service which is produced by WSDL file
       CalculatorService calculatorService = new CalculatorService();
        // Define port to access the published object operations
        Calculator calcPort = calculatorService.getCalculatorPort();

        // Display addition result done by sending numbers to web service using JAX-WS
        System.out.println(FIRSTNUMBER +"+"+ SECONDNUMBER +"="+calcPort.add(FIRSTNUMBER,SECONDNUMBER));

        // Display subtraction result done by sending numbers to web service using JAX-WS
        System.out.println(FIRSTNUMBER +"-"+ SECONDNUMBER +"="+calcPort.sub(FIRSTNUMBER,SECONDNUMBER));

        // Display multiplication result done by sending numbers to web service using JAX-WS
        System.out.println(FIRSTNUMBER +"*"+ SECONDNUMBER +"="+calcPort.mul(FIRSTNUMBER,SECONDNUMBER));

        // Display division result done by sending numbers to web service using JAX-WS
        System.out.println(FIRSTNUMBER +"/"+ SECONDNUMBER +"="+calcPort.div(FIRSTNUMBER,SECONDNUMBER));

    }
}

