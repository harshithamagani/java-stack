public class SinglyLinkedList {
public Node head;
public SinglyLinkedList(){
     head = null;
 }

 public void add(int value) {
    Node newNode = new Node(value);
    if(head == null) {
        head = newNode;
    } else {
        Node runner = head;
        while(runner.next != null) {
            runner = runner.next;
        }
        runner.next = newNode;
    }
}  

 public void remove(int val){
    Node runner = head;
    while(runner.next != null){
        System.out.println("runner.next"+runner.next.value);
        if(runner.next.value == val && runner.next.next != null){
            runner.next = runner.next.next;
        }
        else if(runner.next.value == val && runner.next.next == null){
            runner.next = null;
        }
        runner = runner.next;
    }
}

 public void printValues(){
     Node runner = head;
     while(runner != null){
         System.out.println(runner.value);
         runner = runner.next;
     }
 }
}