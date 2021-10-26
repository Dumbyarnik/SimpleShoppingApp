package KatalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;

public class DeleteControl {

    DataBase db;
    Scanner keyboard;
    DeleteView deleteView;

    public DeleteControl(DataBase db) {
        this.db = db;
        this.keyboard = new Scanner(System.in);
        deleteView = new DeleteView();
    }
    
    public void run(){
        deleteView.menueAnzeigen();

        while(keyboard.hasNext() && !keyboard.hasNextInt()) {
            keyboard.nextLine();
        }
        int warenNummer = keyboard.nextInt();
        keyboard.nextLine();

        db.delete(Integer.toString(warenNummer));
    }

    
}
