package suchen.ui.view;

import java.util.Scanner;
import suchen.al.EinkaeuferIn;
import suchen.al.HoleWarenkorb;
import java.util.ArrayList;
import suchen.bl.Ware;

public class SuchenStartControl {

    SuchControl suchControl;
    PruefControl pruefControl;

    SuchView suchView;
    AuswahlView auswahlView;
    Scanner keyboard;
    SuchenStartView suchenStartView;
    
    
    EinkaeuferIn einkaeuferIn;
    HoleWarenkorb warenkorbService;
    ArrayList<Ware> data = new ArrayList<>();

    public SuchenStartControl()
    {
        this.einkaeuferIn = new EinkaeuferIn();
        this.warenkorbService = einkaeuferIn;
        this.einkaeuferIn.holeWarenkorb();

        this.suchControl = new SuchControl(einkaeuferIn);
        this.pruefControl = new PruefControl(einkaeuferIn);

        this.suchenStartView = new SuchenStartView();
        auswahlView = new AuswahlView(einkaeuferIn);
        keyboard = new Scanner(System.in);
    }

    /*
    *   Gibt View den Zustand des Controllers zurück: true => Finish 
    */
    public void run(){
        boolean finish = false;
        int input; 

        while (!finish){

            // showing the menu 
            suchenStartView.run(this.hasSuchdaten());
        
            input = keyboard.nextInt();

            switch(input) {
                case(0):
                    finish = true;
                    break;
                case(1):
                    data = suchControl.run();
                    break;
                case(2):
                    if (hasSuchdaten()) {
                        pruefControl.run(data);
                    } 
                    break;
                case(3):
                    if (hasSuchdaten()) {
                        auswahlView.run(data);
                    }
                    break;
            }

        }
        //return finish;
    }

    public boolean hasSuchdaten() {
        return data.size() > 0;
    }
}
   

