package edu.training.soapModel;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Calculator class represent firstNumberweb service which is used to do simple mathematical operations
 * the numbers will pass by firstNumberuser using JAX-WS SOAP
 * where the chosen web method will return the result value to the user
 */


@WebService
public class Calculator {

    /**
     * Method to add two numbers
     * @param firstNumber  represent the first number
     * @param secondNumber represent the first number
     * @return represent the summation of the two numbers
     */


    @WebMethod
    public double add(double firstNumber, double secondNumber) {
        return firstNumber+ secondNumber;
    }

    /**
     * Method to subtract two numbers
     * @param firstNumber  represent the first number
     * @param secondNumber represent the first number
     * @return represent the subtraction of the two numbers
     */


    @WebMethod
    public double sub(double firstNumber, double secondNumber) {
        return firstNumber- secondNumber;
    }

    /**
     * Method to multiply two numbers
     * @param firstNumber  represent the first number
     * @param secondNumber represent the first number
     * @return represent the multiplication of the two numbers
     */


    @WebMethod
    public double mul(double firstNumber, double secondNumber) {
        return firstNumber* secondNumber;
    }

    /**
     * Method to divide two numbers
     * @param firstNumber  represent the first number
     * @param secondNumber represent the first number
     * @return represent the division of the two numbers
     */


    @WebMethod
    public double div(double firstNumber, double secondNumber) {
        // Define exception to prevent division by zero
        if (secondNumber == 0)
            throw new ArithmeticException();

        return firstNumber/ secondNumber;
    }
}
