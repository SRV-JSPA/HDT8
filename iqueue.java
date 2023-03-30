public interface iqueue <E extends Comparable<E>> {
    public E getFirst();

    public E remove();
    
    public void add(E value);
}
