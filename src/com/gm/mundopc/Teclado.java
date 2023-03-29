
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private int contadorTeclados;
    
    public Teclado(String tipoEntrada, String nombre){
        super(tipoEntrada,nombre);
        this.idTeclado = ++this.contadorTeclados;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{idTeclado=").append(idTeclado);
        sb.append(", contadorTeclados=").append(contadorTeclados);
        sb.append('}');
        return sb.toString();
    }
    
}
