//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:48:57 PM CST 
//
package com.consiti.h2h.beans;

import java.math.BigInteger;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para anonymous complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GLOBAL_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CUSTOMER_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="BATCHES"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BATCH"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BANK_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                             &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "globalid",
    "customerid",
    "BEGIN_DATE",
    "END_DATE",
    "batches"
})
@XmlRootElement(name = "consultaLotesCliente")
public class consultaLotesCliente {

    @XmlElement(name = "GLOBAL_ID", required = true)
    protected BigInteger globalid;
    @XmlElement(name = "CUSTOMER_ID", required = true)
    protected BigInteger customerid;
    @XmlElement(name = "BEGIN_DATE", required = true)
    private Date BEGIN_DATE;
    @XmlElement(name = "END_DATE", required = true)
    private Date END_DATE;
    @XmlElement(name = "BATCHES", required = true)
    protected consultaLotesCliente.BATCHES batches;
    

    /**
     * Obtiene el valor de la propiedad globalid.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getGLOBALID() {
        return globalid;
    }

    /**
     * Define el valor de la propiedad globalid.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setGLOBALID(BigInteger value) {
        this.globalid = value;
    }

    /**
     * Obtiene el valor de la propiedad customerid.
     *
     * @return possible object is {@link BigInteger }
     *
     */
    public BigInteger getCUSTOMERID() {
        return customerid;
    }

    /**
     * Define el valor de la propiedad customerid.
     *
     * @param value allowed object is {@link BigInteger }
     *
     */
    public void setCUSTOMERID(BigInteger value) {
        this.customerid = value;
    }

    /**
     * Obtiene el valor de la propiedad batches.
     *
     * @return possible object is {@link PagosMasivosResponse.BATCHES }
     *
     */
    public consultaLotesCliente.BATCHES getBATCHES() {
        return batches;
    }

    /**
     * Define el valor de la propiedad batches.
     *
     * @param value allowed object is {@link PagosMasivosResponse.BATCHES }
     *
     */
    public void setBATCHES(consultaLotesCliente.BATCHES value) {
        this.batches = value;
    }

    /**
     * <p>
     * Clase Java para anonymous complex type.
     *
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera
     * que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="BATCH"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BANK_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                   &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "batch"
    })
    public static class BATCHES {

        @XmlElement(name = "BATCH", required = true)
        protected consultaLotesCliente.BATCHES.BATCH batch;

        /**
         * Obtiene el valor de la propiedad batch.
         *
         * @return possible object is
         *     {@link PagosMasivosResponse.BATCHES.BATCH }
         *
         */
        public consultaLotesCliente.BATCHES.BATCH getBATCH() {
            return batch;
        }

        /**
         * Define el valor de la propiedad batch.
         *
         * @param value allowed object is
         *     {@link PagosMasivosResponse.BATCHES.BATCH }
         *
         */
        public void setBATCH(consultaLotesCliente.BATCHES.BATCH value) {
            this.batch = value;
        }

        /**
         * <p>
         * Clase Java para anonymous complex type.
         *
         * <p>
         * El siguiente fragmento de esquema especifica el contenido que se
         * espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="BANK_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="CUSTOMER_BATCH_ID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *         &lt;element name="STATUS" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bankbatchid",
            "customerbatchid",
            "TYPE",
            "UPLOAD_DATE",
            "APLICATION_DATE",
            "NUMBER_OF_TRANSACTIONS",
            "NUMBER_OF_TRANSACTIONS_SUCCESS",
            "NUMBER_OF_TRANSACTIONS_ERROR",
            "TOTAL_AMOUNT",
            "TOTAL_AMOUNT_ERROR",
            "STATUS"
        })
        public static class BATCH {

            @XmlElement(name = "BANK_BATCH_ID", required = true)
            protected BigInteger bankbatchid;
            @XmlElement(name = "CUSTOMER_BATCH_ID", required = true)
            protected BigInteger customerbatchid;
            @XmlElement(name = "TYPE", required = true)
            private BigInteger TYPE;
            @XmlElement(name = "UPLOAD_DATE", required = true)
            private Date UPLOAD_DATE;
            @XmlElement(name = "APLICATION_DATE", required = true)
            private Date APLICATION_DATE;
            @XmlElement(name = "NUMBER_OF_TRANSACTIONS", required = true)
            private BigInteger NUMBER_OF_TRANSACTIONS;
            @XmlElement(name = "NUMBER_OF_TRANSACTIONS_SUCCESS", required = true)
            private BigInteger NUMBER_OF_TRANSACTIONS_SUCCESS;
            @XmlElement(name = "NUMBER_OF_TRANSACTIONS_ERROR", required = true)
            private BigInteger NUMBER_OF_TRANSACTIONS_ERROR;
            @XmlElement(name = "TOTAL_AMOUNT", required = true)
            private Double TOTAL_AMOUNT;
            @XmlElement(name = "TOTAL_AMOUNT_ERROR", required = true)
            private Double TOTAL_AMOUNT_ERROR;
            @XmlElement(name = "STATUS", required = true)
            private String STATUS;

            /**
             * Obtiene el valor de la propiedad bankbatchid.
             *
             * @return possible object is {@link BigInteger }
             *
             */
            public BigInteger getBANKBATCHID() {
                return bankbatchid;
            }

            /**
             * Define el valor de la propiedad bankbatchid.
             *
             * @param value allowed object is {@link BigInteger }
             *
             */
            public void setBANKBATCHID(BigInteger value) {
                this.bankbatchid = value;
            }

            /**
             * Obtiene el valor de la propiedad customerbatchid.
             *
             * @return possible object is {@link BigInteger }
             *
             */
            public BigInteger getCUSTOMERBATCHID() {
                return customerbatchid;
            }

            /**
             * Define el valor de la propiedad customerbatchid.
             *
             * @param value allowed object is {@link BigInteger }
             *
             */
            public void setCUSTOMERBATCHID(BigInteger value) {
                this.customerbatchid = value;
            }

            public BigInteger getTYPE() {
                return TYPE;
            }

            public void setTYPE(BigInteger TYPE) {
                this.TYPE = TYPE;
            }

            public Date getUPLOAD_DATE() {
                return UPLOAD_DATE;
            }

            public void setUPLOAD_DATE(Date UPLOAD_DATE) {
                this.UPLOAD_DATE = UPLOAD_DATE;
            }

            public Date getAPLICATION_DATE() {
                return APLICATION_DATE;
            }

            public void setAPLICATION_DATE(Date APLICATION_DATE) {
                this.APLICATION_DATE = APLICATION_DATE;
            }

            public BigInteger getNUMBER_OF_TRANSACTIONS() {
                return NUMBER_OF_TRANSACTIONS;
            }

            public void setNUMBER_OF_TRANSACTIONS(BigInteger NUMBER_OF_TRANSACTIONS) {
                this.NUMBER_OF_TRANSACTIONS = NUMBER_OF_TRANSACTIONS;
            }

            public Double getTOTAL_AMOUNT() {
                return TOTAL_AMOUNT;
            }

            public void setTOTAL_AMOUNT(Double TOTAL_AMOUNT) {
                this.TOTAL_AMOUNT = TOTAL_AMOUNT;
            }

            public Double getTOTAL_AMOUNT_ERROR() {
                return TOTAL_AMOUNT_ERROR;
            }

            public void setTOTAL_AMOUNT_ERROR(Double TOTAL_AMOUNT_ERROR) {
                this.TOTAL_AMOUNT_ERROR = TOTAL_AMOUNT_ERROR;
            }

            public BigInteger getNUMBER_OF_TRANSACTIONS_SUCCESS() {
                return NUMBER_OF_TRANSACTIONS_SUCCESS;
            }

            public BigInteger getNUMBER_OF_TRANSACTIONS_ERROR() {
                return NUMBER_OF_TRANSACTIONS_ERROR;
            }

            public String getSTATUS() {
                return STATUS;
            }

            public void setSTATUS(String STATUS) {
                this.STATUS= STATUS;
            }

            public void setNUMBER_OF_TRANSACTIONS_SUCCESS(BigInteger NUMBER_OF_TRANSACTIONS_SUCCESS) {
                this.NUMBER_OF_TRANSACTIONS_SUCCESS = NUMBER_OF_TRANSACTIONS_SUCCESS;
            }

            public void setNUMBER_OF_TRANSACTIONS_ERROR(BigInteger NUMBER_OF_TRANSACTIONS_ERROR) {
                this.NUMBER_OF_TRANSACTIONS_ERROR = NUMBER_OF_TRANSACTIONS_ERROR;
            }

        }

    }

    public Date getBEGIN_DATE() {
        return BEGIN_DATE;
    }

    public void setBEGIN_DATE(Date BEGIN_DATE) {
        this.BEGIN_DATE = BEGIN_DATE;
    }

    public Date getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(Date END_DATE) {
        this.END_DATE = END_DATE;
    }

}
