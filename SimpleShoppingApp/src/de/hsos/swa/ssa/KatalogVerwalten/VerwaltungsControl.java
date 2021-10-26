package KatalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;
import datenbank.Verbindung;

public class VerwaltungsControl {
    VerwaltungsView verwaltungsView;

    ReadControl readControl;
    CreateControl createControl;

    UpdateView updView;
    DeleteView delView;
    Scanner scanner;
    DataBase db;

    public VerwaltungsControl() {
        db = new Verbindung();
        db.keepconnected();

        this.verwaltungsView = new VerwaltungsView();

        this.readControl = new ReadControl(db);
        this.createControl = new CreateControl(db);

        this.updView = new UpdateView(db);
        this.delView = new DeleteView(db);
        this.scanner = new Scanner(System.in);
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
    public void run() {
        int input;

        while(true){
            verwaltungsView.run();
            input = scanner.nextInt();

            switch(input){
                case(0):
                    return;
                case(1): //Create
                    createControl.run();
                    break;
                case(2): //Read
                    readControl.run();
                    break;
                case(3): //Update
                    updView.run();
                    break;
                case(4): //Delete
                    delView.run();
                    break;
                case(5): //commit
                    db.commit();
                    break;
            }
        } 
    }
}
   

