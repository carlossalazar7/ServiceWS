package com.consiti.h2h.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author carlo
 */
public class Utils {

    public String getRandomStatus() {
        // create a list of Integer type
        List<String> list = new ArrayList<>();
        // add 2 element in ArrayList
        list.add("SUCCESS");
        list.add("ERROR");

        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public Date mostrarFecha() {
        try {
            SimpleDateFormat parseador = new SimpleDateFormat("yyyy-MM-dd");
            return parseador.parse(new Date().toString());
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public Date getFormatDate() {
        try {
            LocalDate ldt = LocalDate.now();
            return new SimpleDateFormat("yyyy-MM-dd").parse(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(ldt));
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Date formatDate(Date date) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormate = simpleDateFormat.parse(date.toString());
            return dateFormate;
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
