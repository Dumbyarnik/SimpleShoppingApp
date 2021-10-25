package suchen.ui.view;

import java.util.ArrayList;
import java.util.Scanner;
import suchen.al.PruefeWare;
import suchen.bl.Produktinformation;
import suchen.bl.Ware;


public class PruefControl {
    Scanner keyboard;
    PruefeWare pruefService;
    ArrayList<Produktinformation> produktinfos;

    public PruefControl(PruefeWare pruefWare_){
         keyboard = new Scanner(System.in);
         produktinfos = new ArrayList<>();
         pruefService = pruefWare_;
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
   public boolean run(ArrayList<Ware> data){
    boolean finish = false;

    while(keyboard.hasNext() && !keyboard.hasNextInt()) {
          keyboard.nextLine();
     }
     int input = keyboard.nextInt();
     keyboard.nextLine();

    if (input == 0) {
         finish = true;
    }
    else if (input > 0 && input <= data.size()) {
              finish = false;
              produktinfos = new ArrayList<>();
              produktinfos = pruefService.holeDetailinformation(data.get(input - 1));
         }
    return finish;
    }

    public ArrayList<Produktinformation> getProduktinfos() {
         return produktinfos;
    }
}
