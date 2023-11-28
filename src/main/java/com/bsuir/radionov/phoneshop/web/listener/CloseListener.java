package com.bsuir.radionov.phoneshop.web.listener;

import com.bsuir.radionov.phoneshop.model.utils.ConnectionPool;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

import java.sql.SQLException;

/**
 * Listener, that provide closing all connection after context destroy
 * @author radionov
 * @version 1.0
 */
public class CloseListener implements ServletContextListener {
    /**
     * Closing all connection after context destroy
     * @param sce servlet context event
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            ConnectionPool.getInstance().closeAllConnections();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
