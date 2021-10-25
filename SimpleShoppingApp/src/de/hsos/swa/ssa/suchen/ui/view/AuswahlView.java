package suchen.ui.view;

import java.util.ArrayList;
import suchen.al.EinkaeuferIn;
import suchen.bl.Ware;

public class AuswahlView {
    AuswahlControl control;
    
    public AuswahlView(EinkaeuferIn einkaeuferIn) {
        control = new AuswahlControl(einkaeuferIn);
    }
    
    public void run(ArrayList<Ware> data){
        do
        {   
            System.out.println("Druecken sie 0 um zurück zu gehen");
            System.out.println("Waehle die jeweilige Nummer um Ware zum Warenkorb hinzuzufuegen:");
            warenAnzeigen(data);
        } while(!control.run(data));
    }

    private void warenAnzeigen(ArrayList<Ware> data) {
        for (int i=0; i<data.size(); i++ ) {
            Ware ware = data.get(i);
            System.out.println("(" + (i+1) + ") " + ware.getName());
        }
    }
}
