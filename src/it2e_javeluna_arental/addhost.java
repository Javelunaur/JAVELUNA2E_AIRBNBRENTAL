package it2e_javeluna_arental;

import java.util.Scanner;

public class addhost {
   Scanner n = new Scanner (System.in);
    public void addhost(){
        config conf = new config();
         System.out.println("Enter Host ID: ");
         int hid=n.nextInt();
         System.out.println("Enter Property Type: ");
         String type=n.next();
         System.out.print("Enter Location: ");
         String loc=n.next();
         System.out.print("Enter its Availability: ");
         String avail=n.next();
         System.out.print("Enter Phone Number: ");
         double phone=n.nextDouble();
         
         String sql = "INSERT INTO host (HostID, Property, Location, Availability, Phone) VALUES (?, ?, ?, ?, ?)";
         
         conf.addRecord(sql, hid, type, loc, avail, phone); 
}}
