import java.util.Scanner;

import KatalogVerwalten.VerwaltungsControl;
import ui.view.MenueControl;


public class App {
    public static void main(String[] args) throws Exception {

        while(true){
            Scanner keyboard = new Scanner(System.in);

            MenueControl menueControl = new MenueControl();
            VerwaltungsControl verwaltungsControl = new VerwaltungsControl();

            System.out.println("\n");
            System.out.println("Drücken sie 0 um das Programm zu beenden");
            System.out.println("Drücken sie 1 für Simple Shopping");
            System.out.println("Drücken sie 2 für Datenbankverwaltung");

            int input = keyboard.nextInt();
            
            switch(input){
                case(0):
                    keyboard.close();
                    return;
                case(1):
                    menueControl.run();
                    break;
                case(2): 
                    verwaltungsControl.run();
                    break;
            };
            //keyboard.close();
        }  
    }
}
