package suchen.al;

import suchen.acl.WareDTO;
import suchen.bl.Ware;

public class WarenKonverter {

    public WarenKonverter(){
        System.out.println("WarenKonverter");
    }
    public WareDTO wareToDto (Ware ware){
        if (ware == null) {
            return null;
        }
        return new WareDTO(ware.getWarennummer(), ware.getName(), ware.getPreis(), ware.getBeschreibung() );
    }
}

