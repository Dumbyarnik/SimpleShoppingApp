package ui.view;

import java.util.Scanner;
import suchen.ui.view.*;
public class MenueControl {
    Scanner scanner;
    SuchenStartControl suchenStartControl;
    MenueView menueView;

    public MenueControl() {
        this.menueView = new MenueView();
        this.suchenStartControl = new SuchenStartControl(); 
        this.scanner = new Scanner(System.in);
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
    public void run() {
        boolean finish = false;
        int input;

        menueView.run();

        input = scanner.nextInt();

        while(!finish){
            switch(input){
                case(0):
                    finish = true;
                    break;
                case(1):
                    //suchenStartView.run();
                    suchenStartControl.run();
                    break;
                case(2):
                    // Warenkorb
                    System.out.println("Warenkorbfunktion momentan nicht Verfuegbar");
                    break;
                case(3):
                    // Bezahlen
                    System.out.println("Bezahlfunktion momentan nicht Verfuegbar");
                    break;
            }
        } 
    }
}
   

