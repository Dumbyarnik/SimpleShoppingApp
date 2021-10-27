/*
    Service as Anti-Corruption layer
    that keeps all the data intact
*/

package suchen.al;

import suchen.acl.WareDTO;
import suchen.bl.Ware;

public class WarenKonverter {

    // converting function
    public WareDTO wareToDto (Ware ware){
        if (ware == null) {
            return null;
        }
        return new WareDTO(ware.getWarennummer(), ware.getName(), ware.getPreis(), ware.getBeschreibung() );
    }
}

