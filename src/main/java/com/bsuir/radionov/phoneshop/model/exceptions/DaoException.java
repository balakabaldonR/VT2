package com.bsuir.radionov.phoneshop.model.exceptions;

/**
 * @author radionov
 * @version 1.0
 * Exception in layer of DAO
 */
public class DaoException extends Exception {
    /**
     * Place message of exception
     *
     * @param message message of exception
     */
    public DaoException(String message) {
        super(message);
    }
}
