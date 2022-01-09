package labs_examples.datastructures.hashmap.labs;

public class Entry2<K,V> {
    private K key;
    private V value;
    // it means this is a LinkedList
    Entry2 next = null;

    Entry2(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
