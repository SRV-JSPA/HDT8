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
import java.util.*;

public class Test {

    public void pruebavector(){
        VectorHeap<Integer> pruebaVector=new VectorHeap<Integer>();
        pruebaVector.percolateUp(5);
        pruebaVector.add(5);
        pruebaVector.pushDownRoot(5);
    }
}
