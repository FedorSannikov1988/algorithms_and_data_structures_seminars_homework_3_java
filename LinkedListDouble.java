public class LinkedListDouble {

    private Node head;

    private Node tail;

    private class Node {
        private int value;
        private Node nextNode;
        private Node previousNode;
    }

    public void revertListDouble() {

        Node currentNode = head;

        while (currentNode != null) {
            Node next = currentNode.nextNode;
            Node previous = currentNode.previousNode;
            currentNode.nextNode = previous;
            currentNode.previousNode = next;
            if (previous == null) {
                tail = currentNode;
            }

            if (next == null) {
                head = currentNode;
            }
            currentNode = next;
        }
    }


    public Integer popLast() {

        if(tail != null) {

            Integer value = tail.value;

            if(tail.previousNode != null) {
                tail = tail.previousNode;
                tail.nextNode = null;
            }
            else{
                head = null;
                tail = null;
            }
            return value;
        }
        return null;
    }


    public Integer popFront() {

        if(head != null) {

            Integer value = head.value;

            if(head.nextNode != null) {
                head = head.nextNode;
                head.previousNode = null;
            }
            else{
                head = null;
                tail = null;
            }
            return value;
        }
        return null;
    }


    public Node reverseSearch(int value) {

        Node current = tail;

        while (current != null) {

            if(current.value == value){
                return current;
            }
            current = current.previousNode;
        }
        return null;
    }


    public Node frontSearch(int value) {

        Node current = head;

        while (current != null) {

            if(current.value == value) {
                return current;
            }
            current = current.nextNode;
        }
        return null;
    }


    public void addLast(int value) {

        Node node = new Node();

        node.value = value;

        if(tail != null) {
            tail.nextNode = node;
            node.previousNode = tail;
        }
        else {
            head = node;
        }
        tail = node;
    }


    public void addFront(int value) {

        Node node = new Node();

        node.value = value;

        if(head != null) {
            head.previousNode = node;
            node.nextNode = head;
        }
        else {
            tail = node;
        }
        head = node;
    }


    public void printListDouble() {

        Node current = head;

        System.out.print("\n");

        while (current != null) {

            System.out.print(current.value + " ");

            current = current.nextNode;
        }

        System.out.print("\n"+"\n");
    }
}
