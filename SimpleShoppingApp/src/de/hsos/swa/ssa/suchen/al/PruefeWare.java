/*
    Interface for getting the informations
*/

package suchen.al;

import java.util.ArrayList;
import suchen.bl.Produktinformation;
import suchen.bl.Ware;


public interface PruefeWare {
    public ArrayList<Produktinformation> holeDetailinformation(Ware ware);
}
