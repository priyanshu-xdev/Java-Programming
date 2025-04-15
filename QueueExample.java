import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();

        q.offer(1);
        q.offer(3);
        q.offer(6);
        q.offer(3);

        while(!q.isEmpty()){
            System.out.println(q.poll());
        }
    }
}
