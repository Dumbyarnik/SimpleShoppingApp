package suchen.acl;

public class WareDTO {
  
    public long nummer;
    public String name;
    public double preis;
    public String beschreibung;

    public WareDTO(long nummer, String name, double preis, String beschreibung) {
        this.nummer = nummer;
        this.name = name;
        this.preis = preis;
        this.beschreibung = beschreibung;
    }

}
