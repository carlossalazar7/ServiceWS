package com.consiti.h2h.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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
        // add 5 element in ArrayList
        list.add("SUCCESS");
        list.add("ERROR");

        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }

    public Date getFormatDate() {
        try {
            LocalDateTime ldt = LocalDateTime.now();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH).format(ldt));
            return date;
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
