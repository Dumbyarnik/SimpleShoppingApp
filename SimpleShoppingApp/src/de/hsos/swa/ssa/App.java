import java.util.Scanner;

import KatalogVerwalten.VerwaltungsView;
import ui.view.SimpleShoppingAppView;


public class App {
    public static void main(String[] args) throws Exception {


      Scanner keyboard = new Scanner(System.in);
  
      SimpleShoppingAppView s= new SimpleShoppingAppView();
      VerwaltungsView v=new VerwaltungsView();
      System.out.println("Drücken sie 0 für Simple Shopping");
      System.out.println("Drücken sie 1 für Datenbankverwaltung");
      int input = keyboard.nextInt();
      
      switch(input){
            case(0):
              s.run();
                break;
            case(1): 
            v.run();
                break;
      };
      keyboard.close();
    }
}
