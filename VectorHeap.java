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
/**
 * En esta clase se implementará la interfaz "iqueue" que nos indica
 *  la cola en base a la prioridad que se le implementa por medio de Vector
 */

public class VectorHeap <E extends Comparable<E>> implements iqueue<E>{
    /**
     * Aquí se uso de la clase implementada a partir del libro de Java Structures
     */
    protected Vector<E> data;
    /**
     * En "data" se alamcenarán los datos de heap y se contruye un priority queue vacío
     */
    public VectorHeap(){
        data = new Vector<E>();
        /**
         * Se crea un nuevo priority queue a apartir de un Vector con elementos desordenados
         */
    }
    public VectorHeap(Vector<E> v){
        int i;
        data= new Vector<E>(v.size());
        for(i=0;i<v.size();i++){
            add(v.get(i));
        }
    }
        /**
         * Nos retornará el índice del nodo padre en la posición i
         * @param i
         * @return
         */
    protected static int parent(int i){
        return (i-1)/2;
    }
    /**
     * Aquí se retorna el índice de su hijo izq. del nodo en posición i
     * @param i
     * @return
     */
    protected static int left(int i){
        return 2*i+1;
    }
    /**
     * Aquí se retorna el índice de su hijo derecho del nodo en posición i
     * @param i
     * @return
     */
    protected static int right(int i){
        return 2*i+2;
    }
    /**
     * Moverá el nodo de posición a la posición "leaf" hacia arriba dentro 
     * del heap hasta la posición que sea adecuada
     * @param leaf
     */

    protected void percolateUp(int leaf){
        int parent = parent(leaf);
        E value = data.get(leaf);
        while(leaf > 0 &&(value.compareTo(data.get(parent))<0)){
            data.set(leaf, data.get(parent));
            leaf = parent;
            parent= parent(leaf);
        }
        data.set(leaf, value);
    }
    /**
     * Esta función agrega el elemento al heap
     */
    public void add(E value){
        data.add(value);
        percolateUp(data.size()-1);
    }
    /**
     * Moverá el nodo a la pasición root hacia abajo dentro del heap
     * hasta la posición que sea adecuada
     * @param root
     */
    protected void pushDownRoot(int root)
	
	{
		int heapSize = data.size();
		E value = data.get(root);
		while (root < heapSize) {
			int childpos = left(root);
			if (childpos < heapSize)
			{
				if ((right(root) < heapSize) &&
				((data.get(childpos+1)).compareTo
				(data.get(childpos)) < 0))
				{
					childpos++;
				}
			
			if ((data.get(childpos)).compareTo
				(value) < 0)
			{
				data.set(root,data.get(childpos));
				root = childpos; 
			} else { 
				data.set(root,value);
				return;
			}
			} else { 
				data.set(root,value);
				return;
			}
		}
	}
    /**
     * Devuelve el primer elemento del VectorHeap pero sin eliminarlo
     */
    public E getFirst(){
        E first = null; 
		
		if((data.size()) > 0){
			first = data.get(0);
			return first;
		}
		
		return first;
    }
    /**
     * Elimina y retorna el valor más pequeño de la cola de prioridad
     */
    public E remove (){
        E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if (data.size() > 1) pushDownRoot(0);
		return minVal;
    }
    /**
     * Indica si está vacío o no
     */
    public boolean isEmpty() {
        return data.isEmpty();
    }
   
}
