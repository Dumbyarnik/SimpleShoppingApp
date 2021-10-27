/*
    Menu for seeing all the product
*/

package katalogVerwalten;

import java.util.ArrayList;

import datenbank.DataBase;
import suchen.bl.Ware;

public class AlleWarenControl {
    DataBase db;

    public AlleWarenControl(DataBase db) {
        this.db = db;
    }
    
    public void run(){
        System.out.println("Alle Waren sind:");
        ArrayList<Ware> tmp = db.selectWaren();

        for (Ware ware : tmp){
            System.out.println("Nummer: " + ware.getWarennummer());
            System.out.println("Name: " + ware.getName());
            System.out.println("Preis: " + ware.getPreis() + "\n");
        }
    }
}
