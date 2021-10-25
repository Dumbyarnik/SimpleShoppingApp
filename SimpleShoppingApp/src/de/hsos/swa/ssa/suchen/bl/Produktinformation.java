package suchen.bl;

import java.util.Objects;

public final class Produktinformation {
    private final int id;
    private final String  bezeichnung;
    private int ware_nr;

    public Produktinformation(int _id, String  _neueBezeichnung, int _ware_nr){
        Objects.requireNonNull(_id, "should be not null");
        Objects.requireNonNull(_neueBezeichnung, "should be not null");
        this.id = _id;
        this.bezeichnung = _neueBezeichnung;
        this.ware_nr = _ware_nr;
    }

    @Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
        Produktinformation other = (Produktinformation) obj;
		return bezeichnung.equals(other.bezeichnung);
    }

    public int getId() {
        return id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getWare_nr() {
        return ware_nr;
    }

    public void setWare_nr(int ware_nr) {
        this.ware_nr = ware_nr;
    }

    @Override
    public String toString() {
        return "Produktinformation [bezeichnung=" + bezeichnung + ", id=" + id + ", ware_nr=" + ware_nr + "]";
    }

    
}
