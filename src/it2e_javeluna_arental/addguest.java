package it2e_javeluna_arental;

import java.util.Scanner;

public class addguest {
    Scanner n = new Scanner (System.in);
    public void addguest(){
        config conf = new config();
         System.out.println("Enter Guest ID: ");
         int gid=n.nextInt();
         System.out.println("First Name: ");
         String fn=n.next();
         System.out.print("Surname: ");
         String sn=n.next();
         System.out.print("Email: ");
         String email=n.next();
         System.out.print("Phone Number: ");
         double phone=n.nextDouble();
         
         String sql = "INSERT INTO guest (GuestID, First Name, Surname, Email, Phone) VALUES (?, ?, ?, ?, ?)";
         
         conf.addRecord(sql, gid, fn, sn, email, phone); 
}
}
