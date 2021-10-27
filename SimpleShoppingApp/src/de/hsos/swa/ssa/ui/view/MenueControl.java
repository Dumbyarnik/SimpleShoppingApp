/*
    Menu for shopping main menu one product
*/

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

    public void run() {

        int input;

        while(true){

            menueView.run();
            input = scanner.nextInt();

            switch(input){
                case(0):
                    return;
                case(1):
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
   

