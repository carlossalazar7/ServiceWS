package com.consiti.h2h.beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlo
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "PAGING",
    "INITIAL_RECORD",
    "RECORD_COUNT"
})
@XmlRootElement(name = "paging_info")
public class PagingInfo {

    @XmlElement(name = "PAGING", required = true)
    private String PAGING;
    @XmlElement(name = "CUSTOMER_ID", required = true)
    private BigInteger CUSTOMER_ID;
    @XmlElement(name = "RECORD_COUNT", required = true)
    private BigInteger RECORD_COUNT;

    public String getPAGING() {
        return PAGING;
    }

    public void setPAGING(String PAGING) {
        this.PAGING = PAGING;
    }

    public BigInteger getCUSTOMER_ID() {
        return CUSTOMER_ID;
    }

    public void setCUSTOMER_ID(BigInteger CUSTOMER_ID) {
        this.CUSTOMER_ID = CUSTOMER_ID;
    }

    public BigInteger getRECORD_COUNT() {
        return RECORD_COUNT;
    }

    public void setRECORD_COUNT(BigInteger RECORD_COUNT) {
        this.RECORD_COUNT = RECORD_COUNT;
    }

}
