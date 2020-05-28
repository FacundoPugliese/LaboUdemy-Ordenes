package facu.mundopc;

public class Orden {

    int idOrden;
    Computadora[] computadoras;
    static int contadorOrdenes;
    int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.computadoras = new Computadora[MAX_COMPUTADORAS];
        idOrden = ++contadorOrdenes;
    }

    public void agregarComputadora(Computadora compu) {
        if (contadorComputadoras < MAX_COMPUTADORAS) {
            computadoras[contadorComputadoras] = compu;
            contadorComputadoras++;
        } else {
            System.out.println("Se supero el limite de computadoras por orden.");
        }

    }

    public void mostrarOrden() {
        System.out.println("Numero de orden: "+ idOrden);
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println("Computadora N°" + (i + 1));
            System.out.println(computadoras[i]);
            System.out.println();
        }
    }

}
