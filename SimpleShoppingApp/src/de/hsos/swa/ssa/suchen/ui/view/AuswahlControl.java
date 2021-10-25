package suchen.ui.view;

import java.util.ArrayList;
import java.util.Scanner;

import suchen.al.WaehleWare;
import suchen.bl.Ware;

public class AuswahlControl {
    Scanner keyboard;
    WaehleWare hinzufuegenService;
   
    public AuswahlControl(WaehleWare service){
         hinzufuegenService = service;
         keyboard = new Scanner(System.in);
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
    public boolean run(ArrayList<Ware> data){
         boolean finish = true;
         int input = keyboard.nextInt();

         if (input == 0) {
              finish = true;
         }
         else if (input > 0 && input <= data.size()) {
                   hinzufuegenService.wareZuWarenkorbHinzufuegen(data.get(input - 1));
              }
         return finish;
    }
}
