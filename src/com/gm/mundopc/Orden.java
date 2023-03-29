
package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras[];
    private int contadorOrdenes;
    private int contadorComputadoras;
    private int  maxComputadoras;
    
    public Orden(){
        this.idOrden = ++this.contadorOrdenes;
        this.maxComputadoras = 5;
        this.computadoras = new Computadora[this.maxComputadoras];
        
    }
    
    public void agregarComputadora(Computadora computadora){
        if (this.contadorComputadoras < computadoras.length){
            this.computadoras[this.contadorComputadoras] = computadora;
            this.contadorComputadoras++;
        }
        else{
            System.out.println("Error se supero el numero maximo de ordenadores: " + this.maxComputadoras);
        }
        
    }
    
    public void mostrarOrden(){
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadoras: " + this.computadoras[i]);
        }
    }
}
