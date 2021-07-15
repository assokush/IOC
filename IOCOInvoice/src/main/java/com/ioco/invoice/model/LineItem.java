package com.ioco.invoice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by user on 7/15/2021.
 */
@Data
@Entity
public class LineItem {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;

    private BigDecimal unitPrice;
    private long quatity;
    private String description;


    public LineItem() {
    }

    public LineItem(BigDecimal unitPrice, long quatity, String description) {
        this.unitPrice = unitPrice;
        this.quatity = quatity;
        this.description = description;
    }
}
