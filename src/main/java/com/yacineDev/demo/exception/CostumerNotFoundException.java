package com.yacineDev.demo.exception;

import com.yacineDev.demo.module.Costumer;

public class CostumerNotFoundException extends RuntimeException{
    public CostumerNotFoundException(String message) {
        super(message);
    }
}
