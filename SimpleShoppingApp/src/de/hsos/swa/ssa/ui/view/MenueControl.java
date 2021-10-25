package ui.view;

import java.util.Scanner;
import suchen.ui.view.*;
public class MenueControl {
    SuchenStartView suchenStartView;
    Scanner scanner;

    MenueControl() {
        this.suchenStartView = new SuchenStartView();
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
            case(1):
                suchenStartView.run();
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
        return finish;  
    }
}
   

