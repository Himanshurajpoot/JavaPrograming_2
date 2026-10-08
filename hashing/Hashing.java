import java.util.*;

public class Hashing {
    // static class HashMap<K, V> { // generics
    //     private class Node {
    //         K key;
    //         V value;

    //         public Node(K key, V value) {
    //             this.key = key;
    //             this.value = value;
    //         }

    //     }

    //     private int n; // n - nodes
    //     private int N; // N - buckets
    //     private LinkedList<Node> buckets[]; // N = buckets.length

    //     public HashMap() {
    //         this.N = 4;
    //         this.buckets = new LinkedList[N];
    //         for (int i = 0; i < buckets.length; i++) {
    //             this.buckets[i] = new LinkedList<>();
    //         }
    //     }

    //     private void rehash() {
    //         LinkedList<Node> oldBucket[] = buckets;
    //         N = N * 2;
    //         buckets = new LinkedList[N];
    //         for (int i = 0; i < N; i++) {
    //             buckets[i] = new LinkedList<>();
    //         }
    //         n = 0;
    //         for (int i = 0; i < oldBucket.length; i++) {
    //             LinkedList<Node> ll = oldBucket[i];
    //             for (int j = 0; j < ll.size(); j++) {
    //                 Node node = ll.get(j);
    //                 put(node.key, node.value);
    //             }
    //         }
    //     }

    //     private int hashFunction(K key) {
    //         int bi = key.hashCode();
    //         return Math.abs(bi) % N;

    //     }

    //     private int searchInLL(K key, int bi) {
    //         LinkedList<Node> ll = buckets[bi];
    //         for (int i = 0; i < ll.size(); i++) {
    //             if (ll.get(i).key.equals(key)) {
    //                 return i; // di
    //             }
    //         }

    //         return -1;
    //     }

    //     public void put(K key, V value) {
    //         int bi = hashFunction(key);
    //         int di = searchInLL(key, bi);
    //         if (di == -1) { // key doesn't exist
    //             buckets[bi].add(new Node(key, value));
    //             n++;
    //         } else { // key exist
    //             Node node = buckets[bi].get(di);
    //             node.value = value;
    //         }

    //         double lemda = (double) n / N;
    //         if (lemda > 2.0) {
    //             rehash(); // rehashing
    //         }
    //     }

    //     public V get(K key) {
    //         int bi = hashFunction(key);
    //         int di = searchInLL(key, bi);
    //         if (di == -1) { // key doesn't exist
    //             return null;
    //         } else { // key exist
    //             Node node = buckets[bi].get(di);
    //             return node.value;
    //         }

    //     }

    //     public boolean containsKey(K key) {
    //         int bi = hashFunction(key);
    //         int di = searchInLL(key, bi);
    //         if (di == -1) { // key doesn't exist
    //             return false;
    //         } else { // key exist
    //             return true;
    //         }
    //     }

    //     public V remove(K key) {
    //         int bi = hashFunction(key);
    //         int di = searchInLL(key, bi);
    //         if (di == -1) { // key doesn't exist
    //             return null;
    //         } else { // key exist
    //             Node node = buckets[bi].remove(di);
    //             n--;
    //             return node.value;
    //         }
    //     }

    //     public boolean isEmpty() {
    //         return n == 0;
    //     }

    //     public ArrayList<K> kaySet() {
    //         ArrayList<K> keys = new ArrayList<>();
    //         for (int i = 0; i < buckets.length; i++) {// bi
    //             LinkedList<Node> ll = buckets[i];
    //             for (int j = 0; j < ll.size(); j++) {// di
    //                 Node node = ll.get(j);
    //                 keys.add(node.key);
    //             }
    //         }

    //         return keys;
    //     }

    // }




    
    // public static void main(String arges[]) {
    //     HashMap<String, Integer> map = new HashMap<>();
    //     map.put("kanpur", 202);
    //     map.put("lucknow", 20);
    //     map.put("jhansi", 22);

    //     ArrayList<String> keys = map.kaySet();
    //     for (int i = 0; i < keys.size(); i++) {
    //         System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
    //     }
    // }



    // find Itenary

    public static  String getStart(HashMap<String,String> map){
       HashMap<String, String> revMap = new  HashMap<>();
       for(String key:map.keySet()){
           revMap.put(map.get(key), key);
       }

       for(String key:map.keySet()){
        if(!revMap.containsKey(key)){
            return key;
        }
       }
       return null;
    }

    public  static  void main(String arges[]){
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bangaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");

        String start = getStart(map);

        while (map.containsKey(start)) {
            System.out.print(start+ "->");
            start = map.get(start);
        }
        System.out.println(start);

    }

}
