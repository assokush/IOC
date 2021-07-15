package com.ioco.invoice.exception;

/**
 * Created by user on 7/15/2021.
 */
public class InvoiceNotFoundException extends RuntimeException {

    public InvoiceNotFoundException(String userName) {
        super("user with User Name "+userName+"not found");
    }
}