public class Question3 {

    public static void main(String[] args) {

        Node node0 = new Node(2);
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(2);
        Node node5 = new Node(2);
        Node node6 = new Node(2);

        node0.setLeft(node1);
        node0.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        node2.setRight(node6);

        System.out.println(average(node0));
    }

    private static int average(Node node) {
        int amountOfNodes = amountOfNodes(node);
        int sumOfNodes = sumOfNodes(node);

        if (amountOfNodes == 0) {
            return 0;
        }
        return sumOfNodes / amountOfNodes;
    }

    private static int amountOfNodes(Node node) {
        if (node == null) {
            return 0 ;
        }
        return 1 + amountOfNodes(node.getLeft()) + amountOfNodes(node.getRight());
    }

    private static int sumOfNodes(Node node) {
        if (node == null) {
            return 0 ;
        }
        return node.getValue() + sumOfNodes(node.getLeft()) + sumOfNodes(node.getRight());
    }
}
