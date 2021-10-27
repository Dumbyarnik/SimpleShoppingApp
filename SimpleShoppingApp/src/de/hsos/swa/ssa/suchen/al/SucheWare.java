/*
    Interface for searching the product
*/

package suchen.al;

import java.util.ArrayList;
import suchen.bl.Ware;

public interface SucheWare {
    public ArrayList<Ware> sucheWare(String warenname);
    public ArrayList<Ware> sucheWare(long warennummer);
}
