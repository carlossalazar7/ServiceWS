/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consiti.h2h.app;

import com.consiti.h2h.beans.ServicioImpl;
import javax.xml.ws.Endpoint;

/**
 *
 * @author carlo
 */
public class ServerApp {

    protected ServerApp() {
        System.out.println("Starting Server");
        try {
            Object implementor = new ServicioImpl();
            String address = "http://192.168.130.204:9000/ServiceWS";
            Endpoint.publish(address, implementor);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void main(String args[]) {
        try {
            new ServerApp();
            System.out.println("Server ready...");

            //time life 30min
            Thread.sleep(30 * 60 * 1000);
            System.out.println("Server exiting");
            System.exit(0);

        } catch (InterruptedException e) {
            System.out.println("ERROR, " + e.getMessage());
        }
    }
}
