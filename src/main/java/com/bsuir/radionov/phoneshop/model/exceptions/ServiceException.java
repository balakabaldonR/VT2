package com.bsuir.radionov.phoneshop.model.exceptions;

/**
 * @author radionov
 * @version 1.0
 * Exception in layer of services
 */
public class ServiceException extends Exception {
    /**
     * Place message of exception
     *
     * @param message message of exception
     */
    public ServiceException(String message) {
        super(message);
    }
}
