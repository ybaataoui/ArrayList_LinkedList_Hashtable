import java.util.*;

public class Main {
    public static void main(String[] args) {

        AddToArrayList();
        AddToLinkedList();
        AddToHashtable();
    }

    public static void AddToArrayList() {
        ArrayList<Integer> array = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 2000000; i++) {
            array.add(rand.nextInt(2000));
        }
        System.out.println(array.size());

        for (int n: array) {
            System.out.println(n);
        }
        array.removeAll(array);

        System.out.println("*************************************************");

        System.out.println("Array size after delete all items " + array.size());

    }

    public static void AddToLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for(int i = 0; i < 2000000; i++) {
            list.add(rand.nextInt(2000));
        }
        System.out.println("List size " + list.size());

        for (int n: list) {
            System.out.println(n);
        }
        list.removeAll(list);

        System.out.println("*************************************************");

        System.out.println("List size after delete all items " + list.size());

    }

    public static void AddToHashtable() {
        Hashtable<Integer, Integer> table = new Hashtable<>();
        Random rand = new Random();
        for(int i = 0; i < 20; i++) {
            table.put(i + 1, rand.nextInt(2000));
        }
        System.out.println("Table size " + table.size());

        for (Integer key : table.keySet()) {
            System.out.println(key + " : " + table.get(key));
        }

        table.clear();
        System.out.println("*************************************************");
        System.out.println("List size after delete all items " + table.size());

    }

//    Write a Java application that does the following. The Main method should:
//
//    Call a new method which adds 2,000,000 random integers into an ArrayList, then deletes each one from the ArrayList
//
//    Call a new method which adds 2,000,000 random integers into a LinkedList, then deletes each one from the LinkedList
//
//    Call a new method which adds 2,000,000 random integers into a Hashtable, then deletes each one from the Hashtable
}
