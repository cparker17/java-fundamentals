package labs_examples.datastructures.linkedlist.labs;

import java.util.ArrayList;

public class CustomLinkedList<T> {
    private Node head;

    public CustomLinkedList(T... data) {
        if (data.length < 1) {
            head = null;
        } else {
            for (int i = 0; i < data.length; i++) {
                add(data[i]);
            }
        }
    }

    public void add(T data) {
        insert(data, size());
    }

    public void insert(T data, int index) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node iterator = head;
            Node previous = null;

            if (index == 0) {
                head = new Node(data, head);

            } else if (index < size()) {
                int count = 0;

                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }
                previous.next = new Node(data, iterator);
            } else {
                while (iterator.next != null) {
                    iterator = iterator.next;
                }
                iterator.next = new Node(data);
            }
        }
    }

    public void removeWithIndex(int index) {
        if (index == 0) {
            head = head.next;
        } else if (index < size()){
            try {
                int count = 0;
                Node previous = null;
                Node iterator = head;

                while (count != index) {
                    previous = iterator;
                    iterator = iterator.next;
                    count++;
                }
                previous.next = iterator.next;
            } catch (NullPointerException ex) {
                System.out.println("invalid index");
            }
        } else {
            Node iterator = head;

            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = null;
        }
    }

    public void removeWithValue(T value) {
        Node iterator = head;
        Node prev = null;

        if(iterator.data == value) {
            head = iterator.next;
        } else if (iterator.next != null) {
            while(iterator.data != value && iterator.next != null) {
                prev = iterator;
                iterator = iterator.next;
            }
            prev.next = iterator.next;
        } else {
            System.out.println("Can not search an empty list.");
        }
    }

    public int getIndex(T value) {
        Node iterator = head;
        int index = 0;

        while(iterator.next != null) {
            if(iterator.data == value) {
                return index;
            }
            iterator = iterator.next;
            index++;
        }
        return -1;
    }

    public T get(int index) {
        try {
            int count = 0;
            Node iterator = head;

            while (count != index) {
                iterator = iterator.next;
                count++;
            }
            return (T) iterator.data;
        } catch (NullPointerException ex) {
            return null; // list is empty
        }
    }

    public void set(int index, T data) {
        try {
            int count = 0;
            Node iterator = head;

            while (count != index) {
                iterator = iterator.next;
                count++;
            }

            iterator.data = data;
        } catch (NullPointerException ex) {
            System.out.println("invalid index");
        }
    }

    public int size() {
        int count = 0;
        Node iterator = head;

        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void clear() {
        head = null;
    }

    public void removeFromEnd() {
        Node iterator = head;
        int count = 0;

        if (iterator != null) {
            while(iterator.next != null) {
                iterator = iterator.next;
                count++;
            }
            removeWithIndex(count);
        }
    }

    public void removeFromBeginning() {
        Node iterator = head;

        if (iterator.next != null) {
            head = iterator.next;
        }
    }

    public ArrayList<T> toArrayList() {
        ArrayList<T> list = new ArrayList<>();
        Node iterator = head;

        if (iterator == null) {
            return null;
        } else {
            list.add((T) iterator.data);
            while(iterator.next != null) {
                iterator = iterator.next;
                list.add((T) iterator.data);
            }
            return list;
        }
    }

    class Node<T> {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node node) {
            this.data = data;
            this.next = node;
        }
    }
}
