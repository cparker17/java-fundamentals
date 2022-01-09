package labs_examples.datastructures.hashmap.labs;

public class CustomHashMap2<K, V> {

    // create the underlying Entry array with the initial size of 10
    private Entry2<K, V>[] table2 = new Entry2[10];

    // track the current number of elements in the hashmap
    private int numValues = 0;
    private int numElements2 = 0;

    private int hash2(K key2) {
        // get the hashCode for the key and mod that hashCode by the length of the array
        int index2 = Math.abs(key2.hashCode() % table2.length);
        // the result will be the index where we can find and/or place entries
        return index2;
    }

    public void put2(K key2, V value2) {
        // call the hash() method to get the index to place the element
        int index2 = hash2(key2);

        // create the Entry object containing the key and value that we will store in the underlying array
        Entry2<K,V> entry2 = new Entry2(key2, value2);
        // no element at the given index, means no collision
        // go ahead and simply add the value to the array
        if (table2[index2] == null) {
            table2[index2] = entry2;
            numValues++;
            numElements2++;
        }
        // otherwise, there was a collision
        // we need iterate through the linked list at that index
        else {
            // get the first Entry (in the linked list) at the given index
            Entry2<K, V> p = table2[index2];

            // traverse the linked list
            while (p.next != null) {
                p.next = p.next.next;
                numValues++;
            }

            // after we exit the while loop above, we'll be at the end of the linked list
            // this is where we can add the new Entry
            table2[index2] = entry2;
            numValues++;
        }

        // check for resize
        if (numValues > table2.length / 2) {
            // the resize method will create a bigger underlying array and
            // add all values in the existing array to the new, larger array
            resize2();
        }
    }

    private void resize2() {
        // make a copy of the existing table and call it "old"
        Entry2<K, V>[] old2 = table2;
        // create a new Entry[] that is twice the size of the old one
        table2 = new Entry2[old2.length * 3];

        // iterate over the length of the old array
        for (int i = 0; i < old2.length; i++) {
            try {
                // get the Entry at the index of "i" from the "old" table
                Entry2 entry2 = old2[i];
                // call the put() method passing the key and value to add this element to the new table
                put2((K) entry2.getKey(), (V) entry2.getValue());

                // check to see if this entry is actually the start of a linked list
                while (entry2.next != null) {
                    // if it is, traverse to the next node
                    entry2 = entry2.next;
                    // and call the put() method to add this element
                    put2((K) entry2.getKey(), (V) entry2.getValue());
                    // loop
                }
            } catch (Exception e) {
                // do nothing - this is just to handle empty indexes
            }
        }
    }

    //returns true if the underlying array contains the parameter key
    public boolean containsKey(K key2) {
        int index2 = hash2(key2);

        // nothing at key - return null
        if (table2[index2] == null) {
            System.out.println("Element does not exist");
            return false;
        }

        return true;
    }


    //clear the hash map by instantiating a new underlying array
    public void clear() {
        table2 = new Entry2[10];
    }

    public void remove2(K key2) {

        // ensure key exists by calling the get() method
        if (get2(key2) == null) {
            System.out.println("Element does not exist");
            // if the get() method returns null, there's nothing to delete
            return;
        }

        // otherwise, get the index for the key by calling the hash() method
        int index2 = hash2(key2);

        // get the Entry at the index
        Entry2<K, V> entry2 = table2[index2];

        // if this entry has the matching key, remove the element at this index
        if (entry2.getKey().equals(key2)){
            table2[index2] = null;
            numElements2--;
            return;
        }

        // otherwise, if the next element in the linked list is not null
        while (entry2.next != null ) {
            // if the key of the next element in the linked list is not the key we're looking for
            if (entry2.next.getKey() != key2) {
                // traverse the linked list to the next node
                entry2 = entry2.next;
            }
        }

        // when we exit the loop above, entry.next will contain the key we're looking for
        // if we're deleting from the middle of a linked list we need to link
        // entry.next to entry.next.next - this is basically like turning this list:
        // a -> b -> c
        // into this list:
        // a -> c
        if(entry2.next.next != null){
            entry2.next = entry2.next.next;
            numElements2--;
            return;
        }
        // otherwise, entry.next is the end of the list so we can just chop it off
        else {
            entry2.next = null;
            numElements2--;
            return;
        }
    }

    public V get2(K key2) {
        // call the hash() method to get the index for the key
        int index2 = hash2(key2);

        // nothing at key - return null
        if (table2[index2] == null) {
            System.out.println("Element does not exist");
            return null;
        }

        // otherwise, get the Entry at the index
        Entry2<K, V> entry2 = table2[index2];

        // if the key of the current entry is not the key we're looking for
        // that means we're looking at a linked list and we need to traverse it
        // if the key does match right from the start, this loop will be skipped
        while (entry2.getKey() != key2) {

            // if we reach the end of the list and haven't found it return null
            if (entry2.next == null) {
                return null;
            }

            // otherwise, keep traversing the linked list
            entry2 = entry2.next;
        }

        // if we get here, that means the key has been found, return the value
        return entry2.getValue();
    }

    public int getStorage() {
        return table2.length;
    }
}
