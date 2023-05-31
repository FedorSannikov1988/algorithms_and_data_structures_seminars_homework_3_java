public class LinkedList {

    private Node head;

    private class Node {
        private int value;
        private Node nextNode;
    }

    public void revertList() {
        if (head != null && head.nextNode != null) {
            revert(head.nextNode, head);
        }
    }

    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.nextNode == null) {
            head = currentNode;
        }
        else
        {
            revert(currentNode.nextNode, currentNode);
        }
        currentNode.nextNode = previousNode;
        previousNode.nextNode = null;
    }

    public Integer pop() {

        if(head != null) {

            Integer value = head.value;

            head = head.nextNode;

            return value;
        }
        return null;
    }


    public Node search(int value) {

        Node current = head;

        while (current != null) {

            if(current.value == value) {
                return current;
            }
            current = current.nextNode;
        }
        return null;
    }
    

    public void add(int value) {

        Node node = new Node();
        node.value = value;
        node.nextNode = head;
        head = node;
    }


    public void addLast(int value) {

        Node node = new Node();

        node.value = value;

        Node current = head;

        if(current != null) {
            while (current.nextNode != null) {
                current = current.nextNode;
            }
            current.nextNode = node;
        }else{
            head = node;
        }
    }


    public void printList() {

        Node current = head;

        System.out.print("\n");

        while (current != null) {

            System.out.print(current.value + " ");

            current = current.nextNode;
        }

        System.out.print("\n"+"\n");
    }
}
