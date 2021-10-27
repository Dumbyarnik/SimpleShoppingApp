package suchen.ui.view;

import java.util.ArrayList;
import suchen.bl.Produktinformation;
import suchen.bl.Ware;

public class PruefView {

    public PruefView(){
    }

    public void menueAnzeigen(ArrayList<Ware> data) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Druecken sie 0 um zurück zu gehen");
        System.out.println("Waehle die jeweilige Nummer um Detail informationen anzuzeigen:");
        warenAnzeigen(data);
    }

    private void warenAnzeigen(ArrayList<Ware> data) {
        for (int i=0; i<data.size(); i++ ) {
            Ware ware = data.get(i);
            System.out.println("(" + (i+1) + ") " + ware.getName());
        }
    }

    public void produktinfosAnzeigen(ArrayList<Produktinformation> infos) {
        for(Produktinformation info: infos) {
            System.out.println(info);
        }
        infos.clear();
    }
}
