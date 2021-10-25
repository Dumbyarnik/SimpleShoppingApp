package KatalogVerwalten;

import java.util.ArrayList;
import java.util.Scanner;

import datenbank.DataBase;
import suchen.bl.Ware;

public class ReadControl {
    Scanner keyboard = new Scanner(System.in);
    DataBase db;
    ArrayList<Ware> suchErgebnis;

    public ReadControl(DataBase db_){
         db = db_;
         suchErgebnis = new ArrayList<>();
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
    public boolean run(){
        String input = keyboard.nextLine();
        
        try {
            long numInput = Long.parseLong(input);
            
            if (numInput == 0) {
                return true;
            }

            suchErgebnis = db.selectWareNummer(numInput);
         }
         catch (NumberFormatException e)
         {
            suchErgebnis = db.selectWarenName(input);
         }
        return true;
    }

    public ArrayList<Ware> getSuchergebniss() {
        return suchErgebnis;
    }
}
