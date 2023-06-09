
package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("USB", "Teclado Dragon");
        Raton raton1 = new Raton("USB", "Mouse Gamer");
        Monitor monitor1 = new Monitor("HP", 14.00);
        Computadora computadora1 = new Computadora("Gamer",monitor1, teclado1, raton1);
        
        Teclado tecladoGamer = new Teclado("USB", "Teclado Gamer");
        Raton raton2 = new Raton("USB", "Mouse HP");
        Monitor monitorGamer = new Monitor("MSI", 33.00);
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, teclado1, raton2);
        
        Orden orden1 = new Orden();
        System.out.println("orden1 " + orden1);
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
    }
}
