package com.consiti.h2h.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.consiti.h2h.beans.ConsultaDetalleLote.TRANSACTIONS;
import com.consiti.h2h.beans.ConsultaDetalleLote.TRANSACTIONS.TRANSACTION;
import com.consiti.h2h.beans.Header.Authentication;
import com.consiti.h2h.beans.Header.Region;
import com.consiti.h2h.beans.consultaLotesCliente.BATCHES;
import com.consiti.h2h.beans.consultaLotesCliente.BATCHES.BATCH;
import com.consiti.h2h.utils.Utils;
import java.math.BigInteger;
import java.util.*;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.Holder;

/**
 *
 * @author carlo
 */
@Stateless
@WebService(serviceName = "ServiceWS", endpointInterface = "com.consiti.h2h.beans.ServicioWS")
public class ServicioImpl implements ServicioWS {

    //utils methods
    Utils use = new Utils();

    @Override
    public void consultaLotesCliente(Authentication Authentication, Region Region, Holder<String> successIndicator, Holder<String> transactionId, Holder<String> messageId, BigInteger CUSTOMER_ID, Date BEGIN_DATE, Date END_DATE, Holder<com.consiti.h2h.beans.consultaLotesCliente> consultaLotesCliente) {

        System.out.println(BEGIN_DATE.toString());
        transactionId.value = "1";
        messageId.value = "message prueba";
        successIndicator.value = use.getRandomStatus();
        Header header = new Header();
        Authentication aut = new Header.Authentication();
        aut.setPassword("123");
        aut.setUserName("Prueba123");

        Region reg = new Region();
        reg.setSourceBank("HN01");

        header.setAuthentication(aut);
        header.setRegion(reg);

        consultaLotesCliente consulta = new consultaLotesCliente();
        BATCHES batches = new BATCHES();
        BATCH batch = new BATCH();

        batch.setSTATUS("activo");
        batch.setCUSTOMERBATCHID(CUSTOMER_ID);
        batch.setBANKBATCHID(BigInteger.valueOf(1234567));
        batch.setTYPE(BigInteger.valueOf(8935));
        batch.setUPLOAD_DATE(END_DATE);
        batch.setAPLICATION_DATE(END_DATE);
        batch.setNUMBER_OF_TRANSACTIONS(BigInteger.valueOf(20));
        batch.setNUMBER_OF_TRANSACTIONS_SUCCESS(BigInteger.valueOf(20));
        batch.setNUMBER_OF_TRANSACTIONS_SUCCESS(BigInteger.valueOf(0));
        batch.setTOTAL_AMOUNT(500.00);
        batch.setTOTAL_AMOUNT_ERROR(0.00);

        batches.setBATCH(batch);

        consulta.setGLOBALID(BigInteger.valueOf(1234567));
        consulta.setCUSTOMERID(CUSTOMER_ID);
        consulta.setBATCHES(batches);
        consulta.setBEGIN_DATE(BEGIN_DATE);
        consulta.setEND_DATE(END_DATE);

        consultaLotesCliente.value = consulta;
    }

    @Override
    public void ConsultaDetalleLote(Authentication Authentication, Region Region, Holder<String> successIndicator, Holder<String> transactionId, Holder<String> messageId, String CUSTOMER_ID, String QUERY_TYPE, String QUERY_VALUE, Holder<com.consiti.h2h.beans.ConsultaDetalleLote> consultaDetalleLote) {

        //--------------------------
        transactionId.value = "1";
        messageId.value = "message prueba";
        successIndicator.value = use.getRandomStatus();
        Header header = new Header();
        Authentication aut = new Header.Authentication();
        aut.setPassword("123");
        aut.setUserName("Prueba123");

        Region reg = new Region();
        reg.setSourceBank("HN01");

        header.setAuthentication(aut);
        header.setRegion(reg);

        ConsultaDetalleLote consulta = new ConsultaDetalleLote();
        TRANSACTIONS transactions = new TRANSACTIONS();
        TRANSACTION transaction = new TRANSACTION();

        transaction.setAMOUNT(BigInteger.valueOf(150));
        transaction.setCREDITACCOUNT("0651-2545-2151-65652");
        transaction.setDEBITACCOUNT("2532-5285-5452-5451");
        transaction.setDOCUMENTNUMBER("example");
        transaction.setERRORCODE(BigInteger.valueOf(20));
        transaction.setERRORMESSAGE("database error");
        transaction.setID(BigInteger.valueOf(65485));
        transaction.setSTATUS("success");
        transaction.setTXNREFERENCE("EXAM213132");

        transactions.setTRANSACTION(transaction);

        consulta.setApplicationdate(use.getFormatDate());
        consulta.setBANKBATCHID(BigInteger.ONE);
        consulta.setBATCHTYPE("example");
        consulta.setCUSTOMERID(CUSTOMER_ID);
        consulta.setNUMBEROFTRANSACTIONS(BigInteger.valueOf(10));
        consulta.setSTATUS("activo");
        consulta.setTOTALAMOUNT(BigInteger.valueOf(10));
        consulta.setUploaddate(use.getFormatDate());
        consulta.setTRANSACTIONS(transactions);
        consultaDetalleLote.value = consulta;
    }

    @Override
    public void pagosMasivos(Authentication Authentication, Region Region, Holder<String> successIndicator, Holder<String> transactionId, Holder<String> messageId, PagosMasivos pagosMasivos, Holder<pagosMasivosResponse> pagos) {

        transactionId.value = "1";
        messageId.value = "message prueba";
        successIndicator.value = use.getRandomStatus();
        Header header = new Header();
        Authentication aut = new Header.Authentication();
        aut.setPassword("123");
        aut.setUserName("Prueba123");

        Region reg = new Region();
        reg.setSourceBank("HN01");

        header.setAuthentication(aut);
        header.setRegion(reg);

        pagosMasivosResponse pagosM = new pagosMasivosResponse();
        pagosMasivosResponse.BATCHES batches = new pagosMasivosResponse.BATCHES();
        pagosMasivosResponse.BATCHES.BATCH batch = new pagosMasivosResponse.BATCHES.BATCH();

        batch.setBANKBATCHID(BigInteger.valueOf(1221765));
        batch.setCUSTOMERBATCHID(BigInteger.valueOf(2017080848));
        batch.setSTATUS("SUCCESS");

        batches.setBATCH(batch);

        pagosM.setGLOBALID(BigInteger.valueOf(3465421));
        pagosM.setCUSTOMERID(BigInteger.valueOf(84561));
        pagosM.setBATCHES(batches);
        pagos.value = pagosM;
    }
}
