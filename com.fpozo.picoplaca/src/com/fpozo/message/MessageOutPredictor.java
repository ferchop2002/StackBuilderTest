/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpozo.message;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FernandoPozo
 */
public class MessageOutPredictor {

    private Boolean response;
    private List<String> errors = new ArrayList<>();
    
    /**
     * @return the response
     */
    public Boolean getResponse() {
        return response;
    }

    /**
     * @param response the response to set
     */
    public void setResponse(Boolean response) {
        this.response = response;
    }

    /**
     * @return the errors
     */
    public List<String> getErrors() {
        return errors;
    }

    /**
     * @param errors the errors to set
     */
    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
    
    
    
    
}
