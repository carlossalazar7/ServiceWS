package com.consiti.h2h.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.ws.Holder;

/**
 *
 * @author carlo
 */
@WebService()
public interface ServicioWS {

    @WebMethod
    public void consultaLotesCliente(
            @WebParam(name ="Authentication", header = true, mode = WebParam.Mode.IN) Header.Authentication Authentication,
            @WebParam(name ="Region", header = true, mode = WebParam.Mode.IN) Header.Region Region,
            @WebParam(name ="successIndicator", header = true, mode = WebParam.Mode.OUT) Holder<String> successIndicator,
            @WebParam(name = "CUSTOMER_ID", mode = WebParam.Mode.IN) BigInteger CUSTOMER_ID,
            @WebParam(name = "BEGIN_DATE", mode = WebParam.Mode.IN) Date BEGIN_DATE,
            @WebParam(name = "END_DATE", mode = WebParam.Mode.IN) Date END_DATE,
            @WebParam(name = "consultaLotesCliente", mode = WebParam.Mode.OUT) Holder<consultaLotesCliente> consultaLotesCliente
    );

    public void ConsultaDetalleLote(
            @WebParam(name ="Authentication", header = true, mode = WebParam.Mode.IN) Header.Authentication Authentication,
            @WebParam(name ="Region", header = true, mode = WebParam.Mode.IN) Header.Region Region,
            @WebParam(name ="successIndicator", header = true, mode = WebParam.Mode.OUT) Holder<String> successIndicator,
            @WebParam(name = "CUSTOMER_ID", mode = WebParam.Mode.IN) String CUSTOMER_ID,
            @WebParam(name = "QUERY_TYPE", mode = WebParam.Mode.IN) String QUERY_TYPE,
            @WebParam(name = "QUERY_VALUE", mode = WebParam.Mode.IN) String QUERY_VALUE,
            @WebParam(name = "ConsultaDetalleLote", mode = WebParam.Mode.OUT) Holder<ConsultaDetalleLote> consultaDetalleLote
    );

    public void pagosMasivos(
            @WebParam(name ="Authentication", header = true, mode = WebParam.Mode.IN) Header.Authentication Authentication,
            @WebParam(name ="Region", header = true, mode = WebParam.Mode.IN) Header.Region Region,
            @WebParam(name ="successIndicator", header = true, mode = WebParam.Mode.OUT) Holder<String> successIndicator,
            @WebParam(name = "pagos", mode = WebParam.Mode.IN) PagosMasivos pagosMasivos,
            @WebParam(name = "PagosMasivos", mode = WebParam.Mode.OUT) Holder<pagosMasivosResponse> pagos
    );
}
