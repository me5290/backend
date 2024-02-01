package day23;

public class MapValue <K,V> {
    private K key;
    private V value;

    public MapValue(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "MapValue{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
