package mundopc;

import facu.mundopc.*;


public class MundoPC {
    public static void main(String[] args) {
        //Creo una computadora
        Raton raton = new Raton("cable", "Noga");
        Teclado teclado = new Teclado("cable","Noga");
        Monitor monitor = new Monitor("Sentey", 24.0d) ;
        Computadora computadora = new Computadora("Primera compu" , monitor , teclado , raton);
        
        //Creo Segunda computadora
        Raton raton2 = new Raton("Bluetooth", "Noga");
        Teclado teclado2 = new Teclado("Bluetooth","Noga");
        Monitor monitor2 = new Monitor("Asus", 27.0d) ;
        Computadora computadora2 = new Computadora("Segunda compu" , monitor2 , teclado2 , raton2);
        
        //Creo una orden
        Orden orden = new Orden();
        orden.agregarComputadora(computadora);
        orden.agregarComputadora(computadora2);
        
        //Imprimo la orden generada
        orden.mostrarOrden();
    }
}
