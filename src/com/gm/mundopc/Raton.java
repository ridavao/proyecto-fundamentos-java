
package com.gm.mundopc;

public class Raton extends DispositivoEntrada{
    private int idRaton;
    private int contadorRatones;
    
    public Raton(String tipoEntrada,String marca ){
        super(tipoEntrada,marca);
        this.idRaton = ++this.contadorRatones;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{idRaton=").append(idRaton);
        sb.append(", ").append(super.toString());
        sb.append(", contadorRatones=").append(contadorRatones);
        sb.append('}');
        return sb.toString();
    }
    
    
}
