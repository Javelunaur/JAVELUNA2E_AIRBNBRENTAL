package it2e_javeluna_arental;

import java.util.*;

public class IT2E_JAVELUNA_ARENTAL {
    public static void main(String[] args) {
       int ch, act;
         Scanner n = new Scanner (System.in);
//        System.out.println("[1] Host");
//        System.out.println("[2] Guest");
//        System.out.println("[3] Transaction History");
//        System.out.print("Choose an entity: ");
//        ch=n.nextInt();
         System.out.println("|  [1] Create  \n|  [2] Remove \n|  [3] Update \n|  [4] Delete \n|  [5] Exit \n|");
                System.out.print(" >> Enter action: ");
                act=n.nextInt();
                
        switch(act){
            case 1: addhost addh = new addhost();
                    addh.addhost();
                break;
            case 2: addguest addg = new addguest();
                    addg.addguest();
                break;
        }
            
    }
    
}


