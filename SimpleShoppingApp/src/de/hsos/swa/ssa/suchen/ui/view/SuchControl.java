package suchen.ui.view;

import java.util.Scanner;
import suchen.al.SucheWare;


import java.util.ArrayList;

import suchen.bl.Ware;

public class SuchControl {
    Scanner keyboard = new Scanner(System.in);
    SucheWare suchService;
    ArrayList<Ware> suchErgebniss;

    public SuchControl(SucheWare suchWare_){
         suchService = suchWare_;
         suchErgebniss = new ArrayList<>();
    }

    /*
    *   Gibt View den Zustand des Controllers Zurück: true => Finish 
    */
    public boolean run(){
        String input = keyboard.nextLine();
        
        try {
            long numInput = Long.parseLong(input);
            
            if (numInput == 0) {
                return true;
            }

            suchErgebniss = suchService.sucheWare(numInput);
         }
         catch (NumberFormatException e)
         {
            suchErgebniss = suchService.sucheWare(input);
         }
        return true;
    }

    public ArrayList<Ware> getSuchergebniss() {
        return suchErgebniss;
    }
}
