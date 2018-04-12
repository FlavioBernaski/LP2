package Main;

import java.text.DecimalFormat;

/**
 *
 * @author Guto Bernaski
 */
public class Total {
    private int quantSalada;
    private int quantEgg;
    private int quantFrango;
    private int quantTudo;
    private int quantNerd;

    DecimalFormat df = new DecimalFormat("###,##0.00");
    public int getQuantSalada() {
        return quantSalada;
    }

    public void setQuantSalada(int quantSalada) {
        this.quantSalada = quantSalada;
    }

    public int getQuantEgg() {
        return quantEgg;
    }

    public void setQuantEgg(int quantEgg) {
        this.quantEgg = quantEgg;
    }

    public int getQuantFrango() {
        return quantFrango;
    }

    public void setQuantFrango(int quantFrango) {
        this.quantFrango = quantFrango;
    }

    public int getQuantTudo() {
        return quantTudo;
    }

    public void setQuantTudo(int quantTudo) {
        this.quantTudo = quantTudo;
    }

    public int getQuantNerd() {
        return quantNerd;
    }

    public void setQuantNerd(int quantNerd) {
        this.quantNerd = quantNerd;
    }
    
    public String getSubtotalSalada(){
        return df.format(quantSalada*12);
    }
    
    public String getSubtotalEgg(){
        return df.format(quantEgg*9);
    }
    
    public String getSubtotalFrango(){
        return df.format(quantFrango*11);
    }
    
    public String getSubtotalTudo(){
        return df.format(quantTudo*17);
    }
    
    public String getSubtotalNerd(){
        return df.format(quantNerd*15.22);
    }
    
    public String getResultado(){
        double total = quantSalada*12+quantEgg*9+quantFrango*11+quantTudo*17+quantNerd*15.22;
        return df.format(total);
    }
}
