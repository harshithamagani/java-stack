public class ListTester{
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(23);
        sll.add(45);
        sll.add(8);
        sll.add(9);
        sll.add(67);

        sll.printValues();
        sll.remove(45);
        sll.printValues();
    }
}