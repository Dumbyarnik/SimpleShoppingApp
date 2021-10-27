/*
    Menu for updating one product
*/

package katalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;

public class UpdateControl {
    Scanner keyboard;
    int WarenNummer;
    String WarenName;
    String WarenBeschreibung;
    String WarenTyp;
    double WarenPreis;
    String WarenRepo = "1";
    DataBase db;

    UpdateView updateView;
   
    public UpdateControl(DataBase db_){
        db = db_;
        keyboard = new Scanner(System.in);
        updateView = new UpdateView();
    }

    public void run(){

        System.out.println("Bitte zu aendernde WarenNummer eingeben:");
        this.setWarenNummer();

        System.out.println("Bitte Warenname eingeben:");
        this.setWarenname();

        System.out.println("Bitte Beschreibung eingeben:");
        this.setWarenBeschreibung();

        System.out.println("Bitte Warentyp eingeben:");
        this.setWarenTyp();

        System.out.println("Bitte Preis eingeben:");
        this.setWarenPreis();

        String args[] = new String[7];
        args[0] = Integer.toString(this.WarenNummer);
        args[1] = this.WarenName;
        args[2] = this.WarenBeschreibung;
        args[3] = this.WarenTyp;
        args[4] = Double.toString(this.WarenPreis);
        args[6] = this.WarenRepo;

        db.update(args);
    }

    private void setWarenNummer() {
        while(keyboard.hasNext() && !keyboard.hasNextInt()) {
            keyboard.nextLine();
        }
        WarenNummer=keyboard.nextInt();
        keyboard.nextLine();
	}

	private void setWarenBeschreibung() {
        WarenBeschreibung = keyboard.nextLine();
	}

    private void setWarenname() {
        WarenName = keyboard.nextLine();
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
