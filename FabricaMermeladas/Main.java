package FabricaMermeladas;
//Hecho por Alan Alberto Gómez Gómez
//203429
public class Main {
    public static void main(String[] args) throws Exception {
        Bodega bodega = new Bodega(100);

        Contenedor cFresa = new Contenedor(30);
        Contenedor cManzana = new Contenedor(30);
        Contenedor cMembrillo = new Contenedor(30);

        //FASE 1 - Los camiones dejan las cajas y estas entran a la cola de la bodega.
        //Camion 1
        //System.out.println("==EJEMPLO DE COMO LLEGARIAN LAS CAJAS==\n");
        //System.out.println("Contenido del camión 1:");

        //System.out.println("Caja de Manzana    12 kg");
            bodega.enqueue(new Caja("Manzana",12));
        //System.out.println("Caja de Membrillo  20 kg");
            bodega.enqueue(new Caja("Membrillo",20));
        //System.out.println("Caja de Fresa      10 kg");
            bodega.enqueue(new Caja("Fresa",10));
        //System.out.println("Caja de Membrillo  18 kg");
            bodega.enqueue(new Caja("Membrillo",18));
        //System.out.println("Caja de Manzana    19 kg");
            bodega.enqueue(new Caja("Manzana",19));
        //System.out.println("Caja de Manzana    15 kg");
            bodega.enqueue(new Caja("Manzana",15));
        //System.out.println("Caja de Fresa      12 kg");
            bodega.enqueue(new Caja("Fresa",12));
        //System.out.println("Caja de Manzana    18 kg");
            bodega.enqueue(new Caja("Manzana",18));

        //System.out.println("Contenido del camión 2:");

        //System.out.println("Caja de Fresa      16 kg");
            bodega.enqueue(new Caja("Fresa",16));
        //System.out.println("Caja de Manzana    17 kg");
            bodega.enqueue(new Caja("Manzana",17));
        //System.out.println("Caja de Membrillo  10 kg");
            bodega.enqueue(new Caja("Membrillo",10));
        //System.out.println("Caja de Fresa      14 kg");
            bodega.enqueue(new Caja("Fresa",14));
        //System.out.println("Caja de Membrillo  13 kg");
            bodega.enqueue(new Caja("Membrillo",13));
        //System.out.println("Caja de Manzana    12 kg");
            bodega.enqueue(new Caja("Manzana",12));
        //System.out.println("Caja de Membrillo  14 kg");
            bodega.enqueue(new Caja("Membrillo",14));
        //System.out.println("Caja de Fresa      19 kg");
            bodega.enqueue(new Caja("Fresa",19));

        //System.out.println("Contenido del camión 3:");

        //System.out.println("Caja de Membrillo  16 kg");
            bodega.enqueue(new Caja("Membrillo",16));
        //System.out.println("Caja de Manzana    12 kg");
            bodega.enqueue(new Caja("Manzana",12));
        //System.out.println("Caja de Fresa      13 kg");
            bodega.enqueue(new Caja("Fresa",13));
        //System.out.println("Caja de Fresa      18 kg");
            bodega.enqueue(new Caja("Fresa",18));
        //System.out.println("Caja de Manzana    15 kg");
            bodega.enqueue(new Caja("Manzana",15));
        //System.out.println("Caja de Membrillo  16 kg");
            bodega.enqueue(new Caja("Membrillo",16));
        //System.out.println("Caja de Fresa      14 kg");
            bodega.enqueue(new Caja("Fresa",14));
        //System.out.println("Caja de Manzana    18 kg");
            bodega.enqueue(new Caja("Manzana",18));

        //FASE 2 - Las cajas se sacan de la cola y se clasifican dependiendo el tipo de fruta.
        System.out.println("Acomodando...");
        while(!bodega.isEmpty()){
            Caja cajasFrutas = bodega.dequeue();
            if(cajasFrutas.getFruta()=="Manzana"){
                cManzana.push(cajasFrutas);
            }
            if(cajasFrutas.getFruta()=="Fresa"){
                cFresa.push(cajasFrutas);
            }
            if(cajasFrutas.getFruta()=="Membrillo"){
                cMembrillo.push(cajasFrutas);
            }
        }
        //FASE 3
        System.out.println("Los contenedores quedaron así:");
        System.out.println("\nContenedor de manzana.");
        int i=1;
        while(!cManzana.isEmpty()){
            //int i=1;
            Caja cajasFrutas = cManzana.pop();
            System.out.println("Caja " + i + " de " + cajasFrutas.getFruta() + " con peso de " + cajasFrutas.getPeso() + " kg.");            
            i++;
        }
        i=1;
        System.out.println("\nContenedor de fresa.");
        while(!cFresa.isEmpty()){
            //int i=1;
            Caja cajasFrutas = cFresa.pop();
            System.out.println("Caja " + i + " de " + cajasFrutas.getFruta() + " con peso de " + cajasFrutas.getPeso() + " kg.");            
            i++;
        }
        i=1;
        System.out.println("\nContenedor de membrillo.");
        while(!cMembrillo.isEmpty()){
            //int i=1;
            Caja cajasFrutas = cMembrillo.pop();
            System.out.println("Caja " + i + " de " + cajasFrutas.getFruta() + " con peso de " + cajasFrutas.getPeso() + " kg.");            
            i++;
        }
    }
}
