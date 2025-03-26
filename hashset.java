import java.util.*;

public class hashset {
    public static void main(String args[]) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        set.add(3);
        set.add(4);

        System.out.println("Size=" + set.size());

        System.out.println(set);
        if (set.contains(3)) {
            System.out.println("IT contains 3");
        }

        set.remove(4);

        System.out.println(set);

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.print(it.next());
        }
    }
}
