package it2e_javeluna_arental;

import java.util.Scanner;

public class addguest {
    Scanner n = new Scanner (System.in);
    public void addguest(){
        config conf = new config();
//         System.out.println("Enter Guest ID: ");
//         int gid=n.nextInt();
         System.out.println("First Name: ");
         String fn=n.next();
         System.out.print("Surname: ");
         String sn=n.next();
         System.out.print("Email: ");
         String email=n.next();
         System.out.print("Phone Number: ");
         double phone=n.nextDouble();
         
         String sql = "INSERT INTO guest (GuestID, First Name, Surname, Email, Phone) VALUES (?, ?, ?, ?, ?)";
         
         conf.addRecord(sql, fn, sn, email, phone); 
}
    public void viewguest() {
        config conf = new config();
        String votersQuery = "SELECT * FROM Guest";
        String[] votersHeaders = {"ID", "First Name", "Surename", "Email", "Phone Contact"};
        String[] votersColumns = {"GuestID", "First Name", "Surename", "Email", "Phone"};
     
        conf.viewRecords(votersQuery, votersHeaders, votersColumns);
    }
    
    public void updateguest() {     
        Scanner n = new Scanner (System.in);
        config conf = new config();
        System.out.print("Enter Guest ID to Update: ");         
        int id = n.nextInt();
        
           String osql = "Select GuestID FROM Guest WHERE GuestID = ?";
        while(conf.getSingleValue(osql, id) == 0){
            System.out.print("Such guest does not exist, Select Again: ");
            id = n.nextInt(); 
        }
        System.out.println(" [1] Name\n [2] Email\n [3] Phone Contact");
        System.out.print("What do you wish to edit?: ");
        int ed=n.nextInt();
           switch(ed){
               case 1: System.out.print("First Name: ");
                       String newfname = n.next();
                       System.out.print("Surename: ");
                       String newsname = n.next();
                    String sqlname = "UPDATE Guest SET First Name = ?, Surename = ?";
                    conf.updateRecord(sqlname, newfname, newsname);
                    break;
               case 2: System.out.print("Email: ");
                       String newemail = n.next();
                    String sqlemail = "UPDATE Host SET Location = ?"; 
                    conf.updateRecord(sqlemail, newemail);
                    break;
               case 3: System.out.print("Phone Contact: ");
                       String newphonee = n.next();
                    String sqlphonee = "UPDATE Host SET Availability = ?";
                    conf.updateRecord(sqlphonee, newphonee);
                    break;
           }
   
  }
    
    public void deleteguest(){
        Scanner in = new Scanner (System.in);
        config conf = new config();
        System.out.print("Enter Guest ID to Delete: ");
        int id = in.nextInt();
        
        String csql = "Select GuestID FROM Guest WHERE GuestID = ?";
        while(conf.getSingleValue(csql, id) == 0){
            System.out.print("Such Guest does not exist, Select Again: ");
            id = in.nextInt(); 
        }
       
        String sqlDelete = "DELETE FROM Guest WHERE GuestID = ?";
        conf.deleteRecord(sqlDelete, id);
    }
}
