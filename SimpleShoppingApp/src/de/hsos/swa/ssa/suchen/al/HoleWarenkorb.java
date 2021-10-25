package suchen.al;

import suchen.acl.WarenkorbFuerSuche;

public interface HoleWarenkorb {
    public WarenkorbFuerSuche holeWarenkorb();
    public WarenkorbFuerSuche holeWarenkorb(long warenkorbnummer);
}
