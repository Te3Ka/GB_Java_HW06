import java.util.*;

public class Seminar06 {
    public static void main(String[] args) {
        MySet<Integer> mySet = new MySet<>();
        System.out.println(mySet.add(123));
        System.out.println(mySet.add(123));
        System.out.println(mySet.add(234));
        System.out.println(mySet.add(234));
        System.out.println(mySet.add(345));
        System.out.println(mySet.add(456));
        System.out.println(mySet.size());
        System.out.println(mySet.toString());
        System.out.println(mySet.getNum(2));
        System.out.println(mySet.remove(123));
        System.out.println(mySet.remove(123));

        Iterator<Integer> it = mySet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}

class MySet<E> {
    private HashMap<E, Object> mp = new HashMap<>();
    private static final Object OB = new Object();

    public boolean add(E num) {
        return mp.put(num, OB) == null;
    }

    public boolean remove(E num) {
        return mp.remove(num) != null;
    }

    public int size() {
        return mp.size();
    }

    public Iterator<E> iterator() {
        return mp.keySet().iterator();
    }

    public String toString() {
        return mp.keySet().toString();
    }

    public int getNum(int num) {
        return (int) mp.keySet().toArray()[num];
    }
}
