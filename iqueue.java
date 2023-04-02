/*
Profesor: Douglas Leonel Barrios
Auxiliares: Fernanda Esquivel y Francisco Castillo
INTEGRANTES: 
José Santiago Pereira Alvarado, 22318
Nancy Gabriela Mazariegos Molina, 22513
27/01/2023
Hoja de Trabajo 8
Curso: Algoritmos y Estructuras de datos
Sección: 20
*/
public interface iqueue <E extends Comparable<E>> {
    public E getFirst();
    public E remove();
    public void add(E value);
}

