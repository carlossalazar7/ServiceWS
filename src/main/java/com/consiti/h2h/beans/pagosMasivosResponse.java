//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:48:57 PM CST 
//
package com.consiti.h2h.beans;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "globalid",
    "customerid",
    "batches"
})
@XmlRootElement(name = "pagosMasivosResponse")
public class pagosMasivosResponse {

    @XmlElement(name = "GLOBAL_ID", required = true)
    protected BigInteger globalid;
    @XmlElement(name = "CUSTOMER_ID", required = true)
    protected BigInteger customerid;
    @XmlElement(name = "BATCHES", required = true)
    protected pagosMasivosResponse.BATCHES batches;

    public BigInteger getGLOBALID() {
        return globalid;
    }

    public void setGLOBALID(BigInteger value) {
        this.globalid = value;
    }

    public BigInteger getCUSTOMERID() {
        return customerid;
    }

    public void setCUSTOMERID(BigInteger value) {
        this.customerid = value;
    }

    public pagosMasivosResponse.BATCHES getBATCHES() {
        return batches;
    }

    public void setBATCHES(pagosMasivosResponse.BATCHES value) {
        this.batches = value;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "batch"
    })
    public static class BATCHES {

        @XmlElement(name = "BATCH", required = true)
        protected pagosMasivosResponse.BATCHES.BATCH batch;

        public pagosMasivosResponse.BATCHES.BATCH getBATCH() {
            return batch;
        }

        public void setBATCH(pagosMasivosResponse.BATCHES.BATCH value) {
            this.batch = value;
        }

      
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bankbatchid",
            "customerbatchid",
            "status"
        })
        public static class BATCH {

            @XmlElement(name = "BANK_BATCH_ID", required = true)
            protected BigInteger bankbatchid;
            @XmlElement(name = "CUSTOMER_BATCH_ID", required = true)
            protected BigInteger customerbatchid;
            @XmlElement(name = "STATUS", required = true)
            protected String status;

            public BigInteger getBANKBATCHID() {
                return bankbatchid;
            }

            public void setBANKBATCHID(BigInteger value) {
                this.bankbatchid = value;
            }

            public BigInteger getCUSTOMERBATCHID() {
                return customerbatchid;
            }

            public void setCUSTOMERBATCHID(BigInteger value) {
                this.customerbatchid = value;
            }

            public String getSTATUS() {
                return status;
            }

            public void setSTATUS(String value) {
                this.status = value;
            }
        }
    }
}
