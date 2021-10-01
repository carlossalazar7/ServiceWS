//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:18:07 PM CST 
//


package com.consiti.h2h.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Authentication"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Region"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SourceBank" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="DestinationBank" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "authentication",
    "region"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "Authentication", required = true)
    protected Header.Authentication authentication;
    @XmlElement(name = "Region", required = true)
    protected Header.Region region;

    /**
     * Obtiene el valor de la propiedad authentication.
     * 
     * @return
     *     possible object is
     *     {@link Header.Authentication }
     *     
     */
    public Header.Authentication getAuthentication() {
        return authentication;
    }

    /**
     * Define el valor de la propiedad authentication.
     * 
     * @param value
     *     allowed object is
     *     {@link Header.Authentication }
     *     
     */
    public void setAuthentication(Header.Authentication value) {
        this.authentication = value;
    }

    /**
     * Obtiene el valor de la propiedad region.
     * 
     * @return
     *     possible object is
     *     {@link Header.Region }
     *     
     */
    public Header.Region getRegion() {
        return region;
    }

    /**
     * Define el valor de la propiedad region.
     * 
     * @param value
     *     allowed object is
     *     {@link Header.Region }
     *     
     */
    public void setRegion(Header.Region value) {
        this.region = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "userName",
        "password"
    })
    public static class Authentication {

        @XmlElement(name = "UserName", required = true)
        protected String userName;
        @XmlElement(name = "Password", required = true)
        protected String password;

        /**
         * Obtiene el valor de la propiedad userName.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserName() {
            return userName;
        }

        /**
         * Define el valor de la propiedad userName.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserName(String value) {
            this.userName = value;
        }

        /**
         * Obtiene el valor de la propiedad password.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * Define el valor de la propiedad password.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SourceBank" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="DestinationBank" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        "sourceBank",
        "destinationBank"
    })
    public static class Region {

        @XmlElement(name = "SourceBank", required = true)
        protected String sourceBank;
        @XmlElement(name = "DestinationBank", required = true)
        protected String destinationBank;

        /**
         * Obtiene el valor de la propiedad sourceBank.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSourceBank() {
            return sourceBank;
        }

        /**
         * Define el valor de la propiedad sourceBank.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSourceBank(String value) {
            this.sourceBank = value;
        }

        /**
         * Obtiene el valor de la propiedad destinationBank.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationBank() {
            return destinationBank;
        }

        /**
         * Define el valor de la propiedad destinationBank.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationBank(String value) {
            this.destinationBank = value;
        }

    }

}
