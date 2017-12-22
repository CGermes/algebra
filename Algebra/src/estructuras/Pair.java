package estructuras;

public class Pair<K, V> {

    private final K element0;
    private final V element1;

    public Pair(K element0, V element1) {
        this.element0 = element0;
        this.element1 = element1;
    }

    public K get0() {
        return element0;
    }

    public V get1() {
        return element1;
    }

}