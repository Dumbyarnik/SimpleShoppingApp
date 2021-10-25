package suchen.al;

import suchen.acl.WareDTO;
import suchen.acl.WarenkorbStaender;
import suchen.acl.WarenkorbStaenderAdapter;
import suchen.bl.Ware;
import tools.Warenkorb;

public class WarenkorbVerwalten {
    private static WarenkorbStaender staender;
    private WarenKonverter warenKonverter = new WarenKonverter();

    public WarenkorbVerwalten() {
        if (staender == null) {
           staender = new WarenkorbStaenderAdapter();
        }
    }

    public Warenkorb holeWarenkorb() {
        return staender.holeWarenkorb();
    }

    public Warenkorb holeWarenkorb(long warenkorbnummer) {
        return staender.holeWarenkorb(warenkorbnummer);
    }

    public boolean wareHinzufuegen(Ware ware, Warenkorb warenkorb) {
        WareDTO dto = warenKonverter.wareToDto(ware);
        
        if (dto == null) {
            return false;
        }

        warenkorb.wareHinzufuegen(dto);
        return true;
    }





    
}
