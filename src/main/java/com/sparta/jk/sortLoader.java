package com.sparta.jk;

import com.sparta.jk.controller.SortManager;
import com.sparta.jk.exceptions.OutOfBoundsException;
import com.sparta.jk.loggers.CustomFileHandler;
import com.sparta.jk.loggers.CustomLoggerConfiguration;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sortLoader {
    private static final Logger logger = Logger.getLogger("sort-logger");
    public static void main(String[] args) {
        CustomLoggerConfiguration.getCustomLoggerConfiguration(logger);
        logger.log(Level.INFO, "Starting...");
        SortManager.start();

    }
}
