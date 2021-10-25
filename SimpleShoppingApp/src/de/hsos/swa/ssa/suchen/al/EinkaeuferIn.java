package suchen.al;

import suchen.acl.*;
import suchen.bl.*;
import tools.Warenkorb;

import java.util.ArrayList;
public class EinkaeuferIn implements HoleWarenkorb, PruefeWare, SucheWare, WaehleWare {

  private WarenkorbVerwalten warenkorbVerwaltung = new WarenkorbVerwalten();
  private WarenSuchenUndPruefen suchPruefService = new WarenSuchenUndPruefen();
  private Warenkorb warenkorb;

  @Override
  public boolean wareZuWarenkorbHinzufuegen(Ware ware) {
    if (warenkorb != null) {
      warenkorbVerwaltung.wareHinzufuegen(ware, warenkorb);
      return true;
    }
    return false;
  }

  @Override
  public ArrayList<Ware> sucheWare(String warenname) {
    return suchPruefService.suchenPruefen(warenname);
  }

  @Override
  public ArrayList<Ware> sucheWare(long warennummer) {
    return suchPruefService.suchenPruefen(warennummer);
  }

  @Override
  public ArrayList<Produktinformation> holeDetailinformation(Ware ware) {
    return suchPruefService.sucheProduktInfo(ware);
  }

  @Override
  public WarenkorbFuerSuche holeWarenkorb() {
    warenkorb = warenkorbVerwaltung.holeWarenkorb();
    return warenkorb;
  }

  @Override
  public WarenkorbFuerSuche holeWarenkorb(long warenkorbnummer) {
    warenkorb = warenkorbVerwaltung.holeWarenkorb(warenkorbnummer);
    return warenkorb;
  }


}
