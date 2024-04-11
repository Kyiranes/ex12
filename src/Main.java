import java.util.*;
public class Main {
    public static void main(String[] args) {
        queue<Integer> q = new queue<Integer>();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(434121);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);

    }
}
class queue<T> {
    int front = -1;
    int back = -1;
    ArrayList<T> list = new ArrayList<T>();
    T front(){
        if(front == -1) {
            return null;
        }
        return list.get(front);
    }
    T back(){
        if(back == -1) {
            return null;
        }
        return list.get(back);
    }
    void enqueue(T X) {
        if(this.isEmpty()) {
            front = 0;
            back = 0;
            list.add(X);
        }
        else{
            front++;
            if(list.size() > front) {
                list.set(front, X);
            }
            else {
                list.add(X);
            }
        }
    }
    void dequeue(){
        if(this.isEmpty()) {
            System.out.println("Queue is empty");
        } else if (front == back) front = back = -1;
        else {
            back++;
        }
    }

    boolean isEmpty() {
        return front == -1 && back == -1;
    }
    public String toString() {
        if(this.isEmpty()) {
            return "Queue is empty";
        }
        String x = "";
        for(int i = back; i < front; i++) {
            x = x.concat(list.get(i) + "/");
        }
        x = x.concat(String.valueOf(list.get(front)));
        return x;
    }
}