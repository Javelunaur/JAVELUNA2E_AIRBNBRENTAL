package it2e_javeluna_arental;

import java.util.*;

public class IT2E_JAVELUNA_ARENTAL {
   
    public static void main(String[] args) {
        menu();
    }
    
        public static void menu(){
        Scanner n = new Scanner (System.in);
         boolean exit = true;
      
      do{
        System.out.println("[1] Host");
        System.out.println("[2] Guest");
        System.out.println("[3] Transaction Report");
        System.out.println("[4] Exit Program");
        System.out.print(">> Choose an entity: ");
        int ch = n.nextInt();
       
        addhost addh = new addhost();
        switch(ch){
            case 1: host();           
                break;
            case 2: guest();
                break;
                
                
            case 4: System.out.println("Confirm? y/n: ");
                String con = n.next();
              if (con.equalsIgnoreCase("y")){
                exit = false;
              }
              break;
        }
        } while (exit);
        }
       public static void host(){
        addhost addh = new addhost();
        Scanner n = new Scanner (System.in);
        System.out.println("[1] Add");
        System.out.println("[2] View");
        System.out.println("[3] Edit");
        System.out.println("[4] Remove");
        System.out.println("[5] Back");
        System.out.print(">> Choose an action: ");
        int act =n.nextInt();
           switch(act){
              case 1: addh.addhost();
                      addh.viewhost();
                      break;
              case 2: addh.viewhost();
                      break;
              case 3: addh.viewhost();
                      addh.updatehost();
                      break;
              case 4: addh.viewhost();
                      addh.deletehost();
                      break;
              case 5: menu();
           }
       }
       public static void guest(){
        addguest addg = new addguest();
        Scanner n = new Scanner (System.in);
        System.out.println("[1] Add");
        System.out.println("[2] View");
        System.out.println("[3] Edit");
        System.out.println("[4] Remove");
        System.out.println("[5] Back");
        System.out.print(">> Choose an action: ");
        int act =n.nextInt();
           switch(act){
              case 1: addg.addguest();
                      addg.viewguest();
                      break;
              case 2: addg.viewguest();
                      break;
              case 3: addg.viewguest();
                      addg.updateguest();
                      break;
              case 4: addg.viewguest();
                      addg.deleteguest();
                      break;
              case 5: menu();
           }
       }
     
    public static void trans(){
       transaction tran = new transaction();
       Scanner n = new Scanner(System.in);
        System.out.println("");
        System.out.println("[1] Add");
        System.out.println("[2] View");
        System.out.println("[3] Edit");
        System.out.println("[4] Remove");
        System.out.println("[5] Back");
        System.out.print(">> Choose an action: ");
        int act =n.nextInt();
           switch(act){
              case 1: addg.addguest();
                      addg.viewguest();
                      break;
              case 2: addg.viewguest();
                      break;
              case 3: addg.viewguest();
                      addg.updateguest();
                      break;
              case 4: addg.viewguest();
                      addg.deleteguest();
                      break;
              case 5: menu();
           }
    }
    }
    

