import java.util.*;

public class Test {

    public void pruebavector(){
        VectorHeap<Integer> pruebaVector=new VectorHeap<Integer>();
        pruebaVector.percolateUp(5);
        pruebaVector.add(5);
        pruebaVector.pushDownRoot(5);
    }
}
