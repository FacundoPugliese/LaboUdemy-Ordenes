package facu.mundopc;

public class Computadora {

    public int idComputadora;
    private static int contadorComputadoras;
    public String nombre;
    public Monitor monitor;
    public Teclado teclado;
    public Raton raton;

    Computadora() {
        idComputadora = ++contadorComputadoras;
    }

    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora +  ",\n\t nombre=" + nombre  + ",\n\t monitor=" + monitor  + ",\n\t teclado=" + teclado  + ", \n\t raton=" + raton + '}';
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

}
