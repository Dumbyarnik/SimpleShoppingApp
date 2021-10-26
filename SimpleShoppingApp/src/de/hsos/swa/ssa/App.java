import java.util.Scanner;

import KatalogVerwalten.VerwaltungsView;
import ui.view.MenueControl;


public class App {
    public static void main(String[] args) throws Exception {

      Scanner keyboard = new Scanner(System.in);

      MenueControl menueControl = new MenueControl();
      VerwaltungsView v = new VerwaltungsView();

      System.out.println("\n");
      System.out.println("Drücken sie 0 für Simple Shopping");
      System.out.println("Drücken sie 1 für Datenbankverwaltung");

      int input = keyboard.nextInt();
      
      switch(input){
            case(0):
              menueControl.run();
              break;
            case(1): 
              v.run();
              break;
      };
      keyboard.close();
    }
}
