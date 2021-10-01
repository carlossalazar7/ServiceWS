//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v2.3.5 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2021.09.28 a las 03:40:08 PM CST 
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
 *         &lt;element name="successIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "successIndicator"
})
@XmlRootElement(name = "ResponseHeader")
public class ResponseHeader {

    @XmlElement(required = true)
    protected String successIndicator;

    /**
     * Obtiene el valor de la propiedad successIndicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuccessIndicator() {
        return successIndicator;
    }

    /**
     * Define el valor de la propiedad successIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuccessIndicator(String value) {
        this.successIndicator = value;
    }

}
