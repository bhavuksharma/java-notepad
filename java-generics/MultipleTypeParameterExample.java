class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue(){
        return value;
    }
}

public class MultipleTypeParameterExample {
    public static void main(String[] args){
        Pair<String, Integer> pair = new Pair("apple", 1);
        System.out.println("key: " + pair.getKey());
        System.out.println("value: " + pair.getValue());
    }
}
