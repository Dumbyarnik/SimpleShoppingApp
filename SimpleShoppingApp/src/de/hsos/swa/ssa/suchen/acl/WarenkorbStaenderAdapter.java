/*
    Class for managing the shopping carts
*/

package suchen.acl;

import java.util.ArrayList;
import tools.Warenkorb;

public class WarenkorbStaenderAdapter implements WarenkorbStaender {
    private ArrayList<Warenkorb> WarenkorbListe = new ArrayList<>();
    static private long warenkorbAnzahl = 0;

    @Override
    public Warenkorb holeWarenkorb() {
        Warenkorb tp = new Warenkorb(warenkorbAnzahl);
        warenkorbAnzahl++;
        WarenkorbListe.add(tp);

        return tp;
    }

    @Override
    public Warenkorb holeWarenkorb(long warenkorbnummer) {
        for (Warenkorb w: WarenkorbListe) {
            if (w.gebeWarenkorbnummer() == warenkorbnummer) {
                return w;
            }
        }
        return holeWarenkorb();
    }
    
}
