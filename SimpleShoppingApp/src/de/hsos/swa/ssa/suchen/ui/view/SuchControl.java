package suchen.ui.view;

import java.util.Scanner;
import suchen.al.SucheWare;
import java.util.ArrayList;
import suchen.bl.Ware;

public class SuchControl {
    Scanner keyboard = new Scanner(System.in);
    SucheWare suchService;
    ArrayList<Ware> suchErgebniss;
    SuchView suchView;

    public SuchControl(SucheWare suchWare_){
        suchService = suchWare_;
        suchErgebniss = new ArrayList<>();      
        suchView = new SuchView();
    }

    
    public ArrayList<Ware> run(){
        
        suchView.menueAnzeigen();

        String input = keyboard.nextLine();
    
        try {
            long numInput = Long.parseLong(input);
            if (numInput == 0) {
                if (suchErgebniss == null)
                    System.out.println("es ist echt null!");
                return this.getSuchergebniss();
            }
            suchErgebniss = suchService.sucheWare(numInput);
        }
        catch (NumberFormatException e) {
            suchErgebniss = suchService.sucheWare(input);
        }

        suchView.suchergebnissAnzeigen(this.getSuchergebniss());

        return this.getSuchergebniss();
    }

    public ArrayList<Ware> getSuchergebniss() {
        return suchErgebniss;
    }
}
