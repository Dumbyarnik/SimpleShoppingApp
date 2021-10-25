package KatalogVerwalten;

import java.util.Scanner;
import datenbank.DataBase;
import datenbank.Verbindung;

public class VerwaltungsControl {
    CreateView ctlView;
    UpdateView updView;
    ReadView rdView;
    DeleteView delView;
    Scanner scanner;
    DataBase db;

    VerwaltungsControl() {
        db = new Verbindung();
        db.keepconnected();
        this.ctlView = new CreateView(db);
        this.updView = new UpdateView(db);
        this.rdView = new ReadView(db);
        this.delView = new DeleteView(db);
        this.scanner = new Scanner(System.in);
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
    public boolean run() {
        boolean finish = false;
        int input = scanner.nextInt();

        switch(input){
            case(0):
                finish = true;
                break;
            case(1): //Create
                ctlView.run();
                break;
            case(2): //Read
            rdView.run();
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
        return finish;  
    }
}
   

