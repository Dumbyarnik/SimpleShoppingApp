package KatalogVerwalten;

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
   
    public CreateControl(DataBase db_){
         db = db_;
         keyboard = new Scanner(System.in);
    }

    public void run(){
         String args[] = new String[7];
         args[1] = this.WarenName;
         args[2] = this.WarenBeschreibung;
         args[3] = this.WarenTyp;
         args[4] = Double.toString(this.WarenPreis);
         args[6] = this.WarenRepo;

         db.insert(args);
    }

	public void setWarenBeschreibung() {
        WarenBeschreibung=keyboard.nextLine();
	}

    public void setWarenname() {
      WarenName= keyboard.nextLine();
    }

	public void setWarenTyp() {
          WarenTyp =keyboard.nextLine();
	}

    public void setWarenPreis() {
        while(keyboard.hasNext() && !keyboard.hasNextDouble()) {
            keyboard.nextLine();
        }
        WarenPreis = keyboard.nextDouble();
        keyboard.nextLine();
    }

}
