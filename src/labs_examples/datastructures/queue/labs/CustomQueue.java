package labs_examples.datastructures.queue.labs;

import java.util.NoSuchElementException;

public class CustomQueue<T> {
    T[] data;

    CustomQueue() {
        data = (T[]) new Object[10];
    }

    public void push(T element) {
        if (data[0] != null) {
            if (data[data.length * (3 / 4)] != null) {
                enlargeQueue();
            } else if (data[data.length / 4] == null) {
                shortenQueue();
            }
            data[size()] = element;
        } else {
            data[0] = element;
        }
    }

    public T pop() {
        T topE = null;
        try {
            if (data[0] == null) {
                throw new NoSuchElementException();
            }
            else {
                topE = data[0];
                for(int i = 0; i < size(); i++) {
                    data[i] = data[i+1];
                }
            }
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        return topE;
    }

    public T peekFirst() {
        return data[0];
    }

    public T peekLast() {
        return data[size() - 1];
    }

    public int size() {
        int size = 0;
        for(T element : data) {
            if (element != null) {
                size++;
            }
        }
        return size;
    }

    public void print() {
        for(T element : data) {
            if (element != null) {
                System.out.print(element + " ");
            }
        }
    }

    public void enlargeQueue() {
        T[] temp = data;
        data = (T[]) new Object[10 + temp.length];
        for(int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    public void shortenQueue() {
        T[] temp = (T[]) new Object[data.length/2];
        for(int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                break;
            }
            temp[i] = data[i];
        }
        data = (T[]) new Object[temp.length];
        data = temp;
    }
}
