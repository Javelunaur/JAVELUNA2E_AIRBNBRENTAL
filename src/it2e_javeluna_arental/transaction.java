package it2e_javeluna_arental;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class transaction {
    config conf = new config();
    
    public void add(){
        addguest addg = new addguest();
        addhost addh = new addhost();
        addg.viewguest();
        System.out.println("Enter Guest ID: ");
        System.out.println("\n");
        addh.viewhost();
        System.out.println("Enter Host ID: ");
        
        
    }
    public void transguest(){
        LocalDate currdate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = currdate.format(format); 
    }  
    
    public void view() {
        String votersQuery = "SELECT * FROM gspec";
        String[] votersHeaders = {"ID", "Name", "Email", "Phone Contact", "Delivery Service"};
        String[] votersColumns = {"c_id", "c_name", "c_email", "c_phone", "c_delservice"};
     
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
}
//TransacID
//GuestID INT,
//    HostID INT,
//    Date DATETIME,
//    Status VARCHAR(50)