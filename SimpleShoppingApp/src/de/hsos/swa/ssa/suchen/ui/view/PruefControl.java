/*
    Menu for seeing the informations of a product
*/

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

    PruefView pruefView;

    public PruefControl(PruefeWare pruefWare_){
         keyboard = new Scanner(System.in);
         produktinfos = new ArrayList<>();
         pruefService = pruefWare_;
         pruefView = new PruefView();
    }

    //
    public void run(ArrayList<Ware> data){

        pruefView.menueAnzeigen(data);

        while(keyboard.hasNext() && !keyboard.hasNextInt()) {
                keyboard.nextLine();
            }
        int input = keyboard.nextInt();
        keyboard.nextLine();
        
        if (input == 0) { return; }
        else if (input > 0 && input <= data.size()) {
                produktinfos = new ArrayList<>();
                produktinfos = pruefService.holeDetailinformation(data.get(input - 1));

                pruefView.produktinfosAnzeigen(this.getProduktinfos());
            }
    }

    public ArrayList<Produktinformation> getProduktinfos() {
        return produktinfos;
    }
}
