
package com.gm.mundopc;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private int contadorComputadoras;
    
    public Computadora(){
        this.idComputadora = ++this.contadorComputadoras;
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
//        this.monitor = new Monitor("4K", this.contadorComputadoras);
//        this.teclado = new Teclado("USB", "Teclado Dragon");
//        this.raton = new Raton("USB", "Mouse Gamer");
        
    }

    public int getIdComputadora() {
        return this.idComputadora;
    }

    public void setIdComputadora(int idComputadora) {
        this.idComputadora = idComputadora;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return this.monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return this.teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return this.raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public int getContadorComputadoras() {
        return this.contadorComputadoras;
    }

    public void setContadorComputadoras(int contadorComputadoras) {
        this.contadorComputadoras = contadorComputadoras;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora{idComputadora=").append(idComputadora);
        sb.append(", nombre=").append(nombre);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append(", contadorComputadoras=").append(contadorComputadoras);
        sb.append('}');
        return sb.toString();
    }
    
}
