/*
Profesor: Douglas Leonel Barrios
Auxiliares: Fernanda Esquivel y Francisco Castillo
INTEGRANTES: 
José Santiago Pereira Alvarado, 22318
Nancy Gabriela Mazariegos Molina, 22513
Hoja de Trabajo 8
Curso: Algoritmos y Estructuras de datos
Sección: 20
*/
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        lector r = new lector();
        r.lectorar();
        VectorHeap<ChichicasteLinux> cp = new VectorHeap<ChichicasteLinux>();
        ArrayList<ChichicasteLinux> lp = r.getPR();

        for (ChichicasteLinux chichicasteLinux : lp){
            cp.add(chichicasteLinux);
        }
        System.out.println("Bienvenido al programa");
        String x = String.format("%-28s %-10s %-10s %-10s\n", " ", "Usuario", "Nice", "Prioridad");
        System.out.println(x);

        while(!cp.isEmpty()){
            ChichicasteLinux chichicasteLinux = cp.remove();
            String ordenamiento = String.format(chichicasteLinux.getNproceso(),chichicasteLinux.getNusuario(),chichicasteLinux.getNice(),chichicasteLinux.getPrioridad());
            System.out.println(ordenamiento);
        }
    }

    
}
