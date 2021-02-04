package FabricaMermeladas;
//El contenedor es en donde se van a 'guardar' las fruta despues de clasificarse
//Tipo : Pila
public class Contenedor {
    private Caja pila[];
    private int tope;

    public Contenedor(int capacidad){
        pila = new Caja[capacidad];
        tope = -1;
    }

    public boolean isEmpty(){
        return tope == -1;
    }

    public void push(Caja i){
        if(tope+1 < pila.length){
            pila[++tope] = i;
        }
    }

    public Caja pop(){
        if(isEmpty()){
            return null;
        }return
            pila[tope--];
    }
}
