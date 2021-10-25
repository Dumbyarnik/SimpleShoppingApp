package KatalogVerwalten;

import datenbank.DataBase;

public class DeleteView {
    DataBase db;
    DeleteControl control=new DeleteControl(db);
    
    public DeleteView(DataBase db) {
        control = new DeleteControl(db);
    }
    
    public void run() {   
        System.out.println("Druecken sie 0 um zurück zu gehen");
       
        System.out.println("Bitte Warennummer eingeben:");
        control.run(); 
    }

    
}
