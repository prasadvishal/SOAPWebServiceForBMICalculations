/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mindfire.webservices;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Vishal Prasad
 */
@WebService(serviceName = "BmiCalculatorWS")
public class BmiCalculatorWS {


    /**
     * @param takes Height in mtrs and Weights in kgs
     * @return BMI level 
     * Web service operation which calculates BMI and returns it
     */
    @WebMethod(operationName = "calculateBMI")
    public double calculateBMI(@WebParam(name = "height") double height, @WebParam(name = "weight") double weight) {
        
        double bmi = (weight/(height*height));
        return bmi;
    }
}
