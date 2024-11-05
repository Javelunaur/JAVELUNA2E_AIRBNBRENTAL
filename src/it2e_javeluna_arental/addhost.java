package it2e_javeluna_arental;

import java.util.Scanner;

public class addhost {
   Scanner n = new Scanner (System.in);
    public void addhost(){
        config conf = new config();
         System.out.print("Enter Host ID: ");
         int hid=n.nextInt();
         System.out.print("Enter Property Type: ");
         String type=n.next();
         System.out.print("Enter Location: ");
         String loc=n.next();
         System.out.print("Enter its Availability: ");
         String avail=n.next();
         System.out.print("Enter Phone Number: ");
         double phone=n.nextDouble();
         
         String sql = "INSERT INTO host (HostID, Property, Location, Availability, Phone) VALUES (?, ?, ?, ?, ?)";
         
         conf.addRecord(sql, hid, type, loc, avail, phone); 
}

    public void viewhost() {
        config conf = new config();
        String votersQuery = "SELECT * FROM Host";
        String[] votersHeaders = {"ID", "Property", "Location", "Availability", "Phone Contact"};
        String[] votersColumns = {"HostID", "Property", "Location", "Availability", "Phone"};
     
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
    public void updatehost() {     
        Scanner n = new Scanner (System.in);
        config conf = new config();
        System.out.print("Enter Host ID to Update: ");         
        int id = n.nextInt();
        
           String osql = "Select HostID FROM Host WHERE HostID = ?";
        while(conf.getSingleValue(osql, id) == 0){
            System.out.print("Such Host does not exist, Select Again: ");
            id = n.nextInt(); 
        }
        System.out.println(" [1] Property type\n [2] Location\n [3] Availability\n [4] Phone Contact");
        System.out.print("What do you wish to edit?: ");
        int ed=n.nextInt();
           switch(ed){
               case 1: System.out.print("Property type: ");
                       String newprop = n.next();
                    String sqlprop = "UPDATE Host SET Property = ?";
                    conf.updateRecord(sqlprop, newprop);
                    break;
               case 2: System.out.print("Location: ");
                       String newloc = n.next();
                    String sqlloc = "UPDATE Host SET Location = ?"; 
                    conf.updateRecord(sqlloc, newloc);
                    break;
               case 3: System.out.print("Room Availability: ");
                       String newavail = n.next();
                    String sqlavail = "UPDATE Host SET Availability = ?";
                    conf.updateRecord(sqlavail, newavail);
                    break;
               case 4: System.out.print("Phone Contact: ");
                       String newphone = n.next();
                    String sqlphone = "UPDATE Host SET Phone = ?";
                    conf.updateRecord(sqlphone, newphone);
                    break;
                    
           }
   
  }
    
    public void deletehost(){
        Scanner in = new Scanner (System.in);
        config conf = new config();
        System.out.print("Enter Host ID to Delete: ");
        int id = in.nextInt();
        
        String csql = "Select HostID FROM Host WHERE HostID = ?";
        while(conf.getSingleValue(csql, id) == 0){
            System.out.print("Such Host does not exist, Select Again: ");
            id = in.nextInt(); 
        }
       
        String sqlDelete = "DELETE FROM Host WHERE HostID = ?";
        conf.deleteRecord(sqlDelete, id);
    }
}
