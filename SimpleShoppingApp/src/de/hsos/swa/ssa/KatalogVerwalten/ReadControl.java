/*
    Menu for showing one product
*/

package katalogVerwalten;

import java.util.ArrayList;
import java.util.Scanner;
import datenbank.DataBase;
import suchen.bl.Ware;

public class ReadControl {
    Scanner keyboard;
    DataBase db;

    ArrayList<Ware> suchErgebnis;

    ReadView readView;

    public ReadControl(DataBase db_){
        db = db_;
        suchErgebnis = new ArrayList<>();
        keyboard = new Scanner(System.in);

        readView = new ReadView();
    }

    public ArrayList<Ware> run(){

        readView.menueAnzeigen();

        String input = keyboard.nextLine();
        
        try {
                long numInput = Long.parseLong(input);
                if (numInput == 0) {
                    return this.getSuchergebniss();
                }
                suchErgebnis = db.selectWareNummer(numInput);
            }
            catch (NumberFormatException e) { 
                suchErgebnis = db.selectWarenName(input); 
            }
        readView.suchergebnissAnzeigen(this.getSuchergebniss());
        return this.suchErgebnis;
    }

    private ArrayList<Ware> getSuchergebniss() {
        return suchErgebnis;
    }
}
