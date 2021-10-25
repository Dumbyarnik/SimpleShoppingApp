package suchen.ui.view;

import java.util.Scanner;
import suchen.al.EinkaeuferIn;
import suchen.al.HoleWarenkorb;
import java.util.ArrayList;
import suchen.bl.Ware;

public class SuchenStartControl {
    SuchView suchView;
    PruefView pruefView;
    AuswahlView auswahlView;
    Scanner keyboard;
    
    HoleWarenkorb warenkorbService;
    ArrayList<Ware> data = new ArrayList<>();

    public SuchenStartControl(EinkaeuferIn einkaeuferIn){
        warenkorbService = einkaeuferIn;
        einkaeuferIn.holeWarenkorb();
        suchView = new SuchView(einkaeuferIn);
        pruefView = new PruefView(einkaeuferIn);
        auswahlView = new AuswahlView(einkaeuferIn);
        keyboard = new Scanner(System.in);
    }

    /*
    *   Gibt View den Zustand des Controllers zurück: true => Finish 
    */
    public boolean run(){
        boolean finish = false;
        int input = keyboard.nextInt();
    
        switch(input) {
            case(0):
                finish = true;
                break;
            case(1):
                data = suchView.run();
                break;
            case(2):
                if (hasSuchdaten()) {
                    pruefView.run(data);
                } 
                break;
            case(3):
                if (hasSuchdaten()) {
                    auswahlView.run(data);
                }
                break;
        }
        return finish;
    }

    public boolean hasSuchdaten() {
        return data.size() > 0;
    }
}
   

