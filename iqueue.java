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
public interface iqueue <E extends Comparable<E>> {
    /**
     * Obtiene/retorna el primer valor (valor mínimo de la priority queue) sin eliminarlo
     * @return
     */
    public E getFirst();
    /**
     * Elimina el primer valor (valor mínimo de la priority queue) sin eliminarlo
     * @return
     */
    public E remove();
    /**
     * Agrega un valor a la priority queue
     * @param value
     */
    public void add(E value);

    public boolean isEmpty();
}

