package com.bsuir.radionov.phoneshop.model.dao;

import com.bsuir.radionov.phoneshop.model.exceptions.DaoException;

/**
 * @author radionov
 * @version 1.0
 */
public interface StockDao {
    /**
     * Find available stock of phone
     *
     * @param phoneId id of phone
     * @return available stock
     * @throws DaoException throws when there is some errors during dao method execution
     */
    Integer availableStock(Long phoneId) throws DaoException;

    /**
     * Update reserve of phones in database
     *
     * @param phoneId  - phone to update
     * @param quantity - quantity to add in reserve field
     * @throws DaoException throws when there is some errors during dao method execution
     */
    void reserve(Long phoneId, int quantity) throws DaoException;
}
