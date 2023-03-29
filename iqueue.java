public interface iqueue <E extends Comparable<E>> {
    public E getFirst();
    public E remove();
    public void agregar(E v);
}
