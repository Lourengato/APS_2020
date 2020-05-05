/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaifome;

/*
 * @author vitor
 */
public class Pedido {
    private int xTudo;
    private int xFrango;
    private int xVegan;
    private int superBacon;
    private int xAVC;
    private int artesanalGourmet;
    private double valorTotal;
    private String obs;

    public void setArtesanalGourmet(int artesanalGourmet) {
        this.artesanalGourmet = artesanalGourmet;
    }

    public void setSuperBacon(int superBacon) {
        this.superBacon = superBacon;
    }

    public void setxAVC(int xAVC) {
        this.xAVC = xAVC;
    }

    public void setxFrango(int xFrango) {
        this.xFrango = xFrango;
    }

    public void setxTudo(int xTudo) {
        this.xTudo = xTudo;
    }

    public void setxVegan(int xVegan) {
        this.xVegan = xVegan;
    }
    
    public void calcularValor(){
        this.valorTotal = (xTudo * 1) + (xFrango * 1) + (xAVC * 1) + (xVegan * 1)
                          + (artesanalGourmet * 1) + (superBacon * 1);
    }
}
