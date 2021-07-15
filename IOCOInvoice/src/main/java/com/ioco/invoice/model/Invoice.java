package com.ioco.invoice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by user on 7/15/2021.
 */
@Entity
@Data
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    private String client;
    private long vatRate;
    private Date invoiceDate;
    @OneToOne( cascade = CascadeType.ALL)
    private LineItem lineItem;


    public Invoice(){

    }

    public Invoice(String client, long vatRate, Date invoiceDate,LineItem lineItem) {
        this.client = client;
        this.vatRate = vatRate;
        this.invoiceDate = invoiceDate;
        this.lineItem = lineItem;
    }




}
