public class Question1 {

    public static void main(String[] args) {

        Node node1 = new Node(4);
        Node node2 = new Node(6);
        Node node3 = new Node(6);
        Node node4 = new Node(7);
        Node node5 = new Node(6);
        Node node6 = new Node(6);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
        node5.setNext(node6);

        System.out.println(amountOfSequences(node1, 6));
    }

    private static int amountOfSequences(Node node, int num) {
        int counter = 0;

        while (node != null && node.getNext() != null) {

            if (node.getValue() == num && node.getNext().getValue() == num) {
                counter++;

                while (node != null && node.getValue() == num) {
                    node = node.getNext();
                }
            }
            if (node != null) {
                node = node.getNext();
            }
        }
        return counter;
    }
}
