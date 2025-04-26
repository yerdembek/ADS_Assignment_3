import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>(97); // Простое число для M

        Random random = new Random();

        for (int i = 0; i < 10000; i++) {
            int id = random.nextInt(100000);
            String name = "Name" + random.nextInt(1000);
            MyTestingClass key = new MyTestingClass(id, name);
            table.put(key, "Value" + i);
        }

        table.printBucketSizes();




        // --- Тестирование BST ---
        BST<Integer, String> bst = new BST<>();
        bst.put(5, "Five");
        bst.put(3, "Three");
        bst.put(7, "Seven");
        bst.put(1, "One");

        System.out.println("\nBST in-order traversal:");
        for (BST<Integer, String>.Node node : bst) {
            System.out.println(node.getKey() + " => " + node.getValue());
        }

    }
}