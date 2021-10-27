/*
    First menu in Verwaltung
*/

package katalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;
import datenbank.Verbindung;

public class VerwaltungsControl {
    VerwaltungsView verwaltungsView;

    ReadControl readControl;
    CreateControl createControl;
    UpdateControl updateControl;
    DeleteControl deleteControl;
    AlleWarenControl alleWarenControl;

    Scanner scanner;
    DataBase db;

    public VerwaltungsControl() {
        db = new Verbindung();
        db.keepconnected();

        this.verwaltungsView = new VerwaltungsView();

        this.readControl = new ReadControl(db);
        this.createControl = new CreateControl(db);
        this.updateControl = new UpdateControl(db);
        this.deleteControl = new DeleteControl(db);
        alleWarenControl = new AlleWarenControl(db);

        this.scanner = new Scanner(System.in);
    }

    
    public void run() {
        int input;

        while(true){
            verwaltungsView.run();
            input = scanner.nextInt();

            switch(input){
                case(0):
                    return;
                case(1): // Create
                    createControl.run();
                    break;
                case(2): // Read
                    readControl.run();
                    break;
                case(3): // Update
                    updateControl.run();
                    break;
                case(4): // Delete
                    deleteControl.run();
                    break;
                case(5): // Commit
                    db.commit();
                    break;
                case(6): // alle Waren sehen
                    alleWarenControl.run();
                    break;
            }
        } 
    }
}
   

