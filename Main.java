public class Main {
    public static void main(String[] args) {

        LinkedListDouble listDouble = new LinkedListDouble();

        listDouble.addLast(1);
        listDouble.addLast(2);
        listDouble.addLast(3);
        listDouble.addLast(4);
        listDouble.addLast(5);

        listDouble.addFront(6);
        listDouble.addFront(7);
        listDouble.addFront(8);
        listDouble.addFront(9);
        listDouble.addFront(10);

        listDouble.frontSearch(6);
        listDouble.reverseSearch(3);

        System.out.println(listDouble.reverseSearch(11));
        System.out.println(listDouble.frontSearch(11));

        listDouble.printListDouble();

        System.out.println(listDouble.popFront());
        System.out.println(listDouble.popFront());

        listDouble.printListDouble();

        System.out.println(listDouble.popLast());
        System.out.println(listDouble.popLast());

        listDouble.printListDouble();

        listDouble.revertListDouble();

        listDouble.printListDouble();

        System.out.println("---");

        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);

        list.search(6);

        System.out.println(list.search(11));

        list.printList();

        System.out.println(list.pop());
        System.out.println(list.pop());

        list.printList();

        list.revertList();

        list.printList();
    }
}