/*
    Menu for creating a new product
*/

package katalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;

public class CreateControl {
    Scanner keyboard;
    String WarenName;
    String WarenBeschreibung;
    String WarenTyp;
    double WarenPreis;
    String WarenRepo = "1";
    
    DataBase db;

    CreateView createView;
   
    public CreateControl(DataBase db_){
        db = db_;
        keyboard = new Scanner(System.in);
    }

    public void run(){
        System.out.println("Bitte Warenname eingaben:");
        this.setWarenname();

        System.out.println("Bitte Beschreibung eingeben:");
        this.setWarenBeschreibung();

        System.out.println("Bitte Warentyp eingeben:");
        this.setWarenTyp();
        
        System.out.println("Bitte Preis eingeben:");
        this.setWarenPreis();

        String args[] = new String[7];
        args[1] = this.WarenName;
        args[2] = this.WarenBeschreibung;
        args[3] = this.WarenTyp;
        args[4] = Double.toString(this.WarenPreis);
        args[6] = this.WarenRepo;

        db.insert(args);
    }

    private void setWarenname() {
        System.out.println("this is the line - " + keyboard.nextLine());
        WarenName = keyboard.nextLine();
    }

	private void setWarenBeschreibung() {
        WarenBeschreibung = keyboard.nextLine();
	}

	private void setWarenTyp() {
        WarenTyp = keyboard.nextLine();
	}

    private void setWarenPreis() {
        while(keyboard.hasNext() && !keyboard.hasNextDouble()) {
            keyboard.nextLine();
        }
        WarenPreis = keyboard.nextDouble();
        keyboard.nextLine();
    }

}
