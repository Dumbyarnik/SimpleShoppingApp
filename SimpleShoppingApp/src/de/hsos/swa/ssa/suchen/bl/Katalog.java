/*
    Interface for searching through the database
*/
package suchen.bl;

import java.util.ArrayList;

public interface Katalog {
   public void legeSuchalgorihtmusFest(SuchAlgorithmus algo);
   public ArrayList<Ware> suchen(String warenname);
   public ArrayList<Ware> suchen(long warenNummer);
   public ArrayList<Produktinformation> gebeProduktinformation(Ware ware);

}

