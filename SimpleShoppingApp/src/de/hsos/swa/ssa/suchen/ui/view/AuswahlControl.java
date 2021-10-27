/*
    Menu for putting a product in Warenkorb
*/

package suchen.ui.view;

import java.util.ArrayList;
import java.util.Scanner;
import suchen.al.WaehleWare;
import suchen.bl.Ware;

public class AuswahlControl {
    Scanner keyboard;
    WaehleWare hinzufuegenService;
    AuswahlView auswahlView;
   
    public AuswahlControl(WaehleWare service){
        hinzufuegenService = service;
        keyboard = new Scanner(System.in);
        this.auswahlView = new AuswahlView();
    }

    
    public void run(ArrayList<Ware> data){
        auswahlView.run(data);
        int input = keyboard.nextInt();

        if (input == 0) { return; }
        else if (input > 0 && input <= data.size()) {
            hinzufuegenService.wareZuWarenkorbHinzufuegen(data.get(input - 1));
        }
    }
}
