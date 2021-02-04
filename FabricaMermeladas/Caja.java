package FabricaMermeladas;
//Son las cajas que vienen de los camiones
public class Caja {
    private String fruta;
    private int peso;

    public Caja(String fruta, int peso){
        this.fruta=fruta;
        this.peso=peso;
    }

    public String getFruta(){
        return fruta;
    }

    public int getPeso(){
        return peso;
    }
}
