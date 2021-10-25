package KatalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;

public class DeleteControl {

DataBase db;
Scanner keyboard = new Scanner(System.in);

    public DeleteControl(DataBase db) {
        this.db = db;
    }
    
    public void run(){
        while(keyboard.hasNext() && !keyboard.hasNextInt()) {
            keyboard.nextLine();
        }
        int warenNummer=keyboard.nextInt();
        keyboard.nextLine();
        db.delete(Integer.toString(warenNummer));
    }

    
}
