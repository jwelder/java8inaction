/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13.DateandTime;

import java.time.LocalDate;

/**
 *
 * @author James Elder
 */
public class DateExamples {
    
    public static void main(String args[]){
        System.out.println("Testing Date Examples In Java 8");
        LocalDate date = LocalDate.now(); //LocalDate.of(2014, 9, 26);
        System.out.println(date);
        System.out.println(date.getYear()); // returns int
        System.out.println(date.getMonth()); // return Month
        System.out.println(date.getDayOfMonth()); // returns int
        System.out.println(date.getDayOfWeek()); // returns DayOfWeek
        System.out.println(date.lengthOfMonth()); // returns int
        System.out.println(date.isLeapYear()); // returns boolean
        
        
    }
    
}
