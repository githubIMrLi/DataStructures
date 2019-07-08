package classOne.class_03;

public class Code_PrintCommonPart {

    public static class Node{
        public  int value;
        public Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private static void printCommonPart(Node node1, Node node2) {
        System.out.println("Common :");
        while (node1!= null&& node2!= null){
            if (node1.value>node2.value){
                node2 = node2.next;
            }else if (node1.value<node2.value){
                node1 = node1.next;
            }else {
                System.out.print(node1.value+"\t");
                node1 = node1.next;
                node2 = node2.next;
            }
        }

    }

    private static void printLinkedList(Node node1) {
        System.out.println("Linked List:");
        while (node1!= null){
            System.out.print(node1.value+"\t");
            node1 = node1.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1 = new Node(2);
        node1.next = new Node(3);
        node1.next.next = new Node(5);
        node1.next.next.next = new Node(6);

        Node node2 = new Node(1);
        node2.next = new Node(2);
        node2.next.next = new Node(5);
        node2.next.next.next = new Node(7);
        node2.next.next.next.next = new Node(8);

        printLinkedList(node1);
        printLinkedList(node2);
        printCommonPart(node1, node2);

    }




}
