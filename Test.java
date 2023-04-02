import java.util.*;

public class Test {

    public void pruebavector(){
        VectorHeap<Integer> pruebaVector=new VectorHeap<Integer>();
        pruebaVector.percolateUp(30);
        pruebaVector.add(10);
        pruebaVector.pushDownRoot(40);
    }
}
