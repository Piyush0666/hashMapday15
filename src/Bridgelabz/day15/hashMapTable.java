package Bridgelabz.day15;
import java.util.ArrayList;

class HashMapTable<K, V> {
    HNode<K, V> head;
    HNode<K, V> tail;
    private final int numOfBuckets;
    ArrayList<HNode<K, V>> myBucketArray;

    public HashMapTable() {
        this.numOfBuckets = 20;    //20 is assigned a little more than the numbers of total words
        this.myBucketArray = new ArrayList<>();
        for (int i = 0; i < numOfBuckets; i++)
            this.myBucketArray.add(null);
    }

    public void add(K key, V value) {
        HNode<K, V> myNode = (HNode<K, V>) searchNode(key);
        int index = this.getBucketIndex(key);
        HNode<K, V> myNode = this.myBucketArray.get(index);
        if (myNode == null) {
            myNode = new HNode<>(key, value);
            this.myBucketArray.set(index, myNode);
        }
        myNode = (HNode<K, V>) searchNode(key);
        if (myNode == null) {
            myNode = new HNode<>(key, value);
            this.append(myNode);
            @ @ -15, 7 + 32, 7 @@public void add (K key, V value){
            }
        }

        //Append the value in the linked list
        //Append the value in the hashtable
        public void append (HNode myNode){
            if (this.head == null)
                this.head = myNode;
            @ @ -27, 7 + 44, 7 @@public void append (HNode myNode){
            }
        }

        //Searching for the word in the linked list
        //Searching for the word in the hashtable
        public HNode<K, V> searchNode (K data){
            HNode<K, V> currentNode = head;
            int position = 0;
            @ @ -41, 19 + 58, 46 @@public void append (HNode myNode){
                return currentNode;
            }

            //Searching for the word and get the value from the linked list
            //Searching for the word and get the value from the hashtable
            public V get (K word){
                int index = this.getBucketIndex(word);
                if (this.myBucketArray.get(index) == null)
                    return null;
                HNode<K, V> myMapNode = searchNode(word);
                return (myMapNode == null) ? null : myMapNode.getValue();
            }

            //Print the linked list
            //hashcode to find the index
            private int getBucketIndex (K word){
                int hashCode = Math.abs(word.hashCode());
                System.out.println(hashCode);
                int index = hashCode % numOfBuckets;
                System.out.println(index);
                return index;
            }

            //Remove "avoidable" from hashtable
            public void remove (K word){
                HNode<K, V> currentNode = head;
                HNode<K, V> previousNode = null;
                while (currentNode != null && currentNode.getKey().equals(word)) {
                    head = currentNode.getNext();
                    return;
                }
                while (currentNode != null && !(currentNode.getKey().equals(word))) {
                    previousNode = currentNode;
                    currentNode = currentNode.getNext();
                }
                if (currentNode != null) {
                    previousNode.next = currentNode.next;
                }
                if (currentNode == null)
                    System.out.println("Word not found!");
            }

            //Print the hashtable
            @Override
            public String toString() {
                return "MyLinkedListNodes{" + head + "}";
            }

            public void printNodes() {
                System.out.println("My nodes: " + head);
            }
        }
    }
}