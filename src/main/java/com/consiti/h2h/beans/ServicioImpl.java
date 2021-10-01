package com.consiti.h2h.beans;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.consiti.h2h.beans.ConsultaDetalleLote.TRANSACTIONS;
import com.consiti.h2h.beans.ConsultaDetalleLote.TRANSACTIONS.TRANSACTION;
import com.consiti.h2h.beans.consultaLotesCliente.BATCHES;
import com.consiti.h2h.beans.consultaLotesCliente.BATCHES.BATCH;
import java.math.BigInteger;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.xml.ws.Holder;

/**
 *
 * @author carlo
 */
@Stateless
@WebService(endpointInterface = "com.consiti.h2h.beans.ServicioWS")
public class ServicioImpl implements ServicioWS {

    @Override
    public void ConsultaDetalleLote(String CUSTOMER_ID, String QUERY_TYPE, String QUERY_VALUE, Holder<ConsultaDetalleLote> consultaDetalleLote) {

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

        consulta.setApplicationdate(Date.from(Instant.now()));
        consulta.setBANKBATCHID(BigInteger.ONE);
        consulta.setBATCHTYPE("example");
        consulta.setCUSTOMERID(CUSTOMER_ID);
        consulta.setNUMBEROFTRANSACTIONS(BigInteger.valueOf(10));
        consulta.setSTATUS("activo");
        consulta.setTOTALAMOUNT(BigInteger.valueOf(10));
        consulta.setUploaddate(Date.from(Instant.now()));
        consulta.setTRANSACTIONS(transactions);
        consultaDetalleLote.value = consulta;
    }

    @Override
    public void pagosMasivos(PagosMasivos pagosMasivos, Holder<pagosMasivosResponse> pagos) {
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

    @Override
    public void consultaLotesCliente(Holder<ArrayList> Authentication, Holder<ArrayList> Region, Holder<String> successIndicator, BigInteger CUSTOMER_ID, Date BEGIN_DATE, Date END_DATE, Holder<com.consiti.h2h.beans.consultaLotesCliente> consultaLotesCliente) {

        successIndicator.value = "Success";
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

}
