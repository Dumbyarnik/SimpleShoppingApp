package suchen.bl;

//import java.math.BigDecimal;
import java.text.DecimalFormat; // Rundungsprobleme mit Operation..

public class Geld {
    private DecimalFormat geldFormat;
    private String geldFormatStr;

    public Geld(){
        // geldFormat = (DecimalFormat)DecimalFormat.getCurrencyInstance(Locale.GERMANY);
        geldFormat = new DecimalFormat("0.00 'EUR'");
        geldFormatStr = geldFormat.format(10);
       // geldFormat.setParseBigDecimal(true);   
    }

    public Geld(double newGeldFormat){
        geldFormat = new DecimalFormat("0.00 'EUR'");
        geldFormatStr = geldFormat.format(newGeldFormat);
    }
    public Geld(DecimalFormat _newGeldFormat){
        //geldFormat = new DecimalFormat("0.00 'EUR'");
        geldFormatStr = geldFormat.format(_newGeldFormat);
    }

	public DecimalFormat getGeldFormat() {
		return geldFormat;
	}

	public void setGeldFormat(double newGeldFormat) {	
        geldFormatStr = this.geldFormat.format(newGeldFormat);

    }

    @Override
    public String toString() {
        return "Geld [geldFormat=" + geldFormatStr + "]";
    };
}
