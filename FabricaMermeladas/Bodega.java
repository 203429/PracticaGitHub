package FabricaMermeladas;
//La bodega se encarga de ordenar las cajas de fruta
//Tipo : Cola
public class Bodega {
    public static final int DEFAULT_SIZE=100;
    private Caja data[];
    private int index;

    public Bodega(){
        data = new Caja [DEFAULT_SIZE];
    }
    public Bodega(int s){
        data = new Caja [s];
    }

    public boolean isEmpty(){
        return index==0;
    }

    public void enqueue(Caja obj) throws Exception{
        if(index == DEFAULT_SIZE){
            throw new Exception("Cola llena");
        }
        this.data[index]=obj;
        this.index++;
    }

    public Caja dequeue() throws Exception{
        if(isEmpty()) throw new Exception("Cola vacia");
            Caja obj=this.data[0];
        for(int i=0; i<this.index-1; i++){
            data[i]=data[i+1];
        }
        this.index--;
        return obj;
    }
}
