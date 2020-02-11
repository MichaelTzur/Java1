public class Question4 {

    public static void main(String[] args) {

        Node node0 = new Node(2);
        Node node1 = new Node(2);
        Node node2 = new Node(2);
        Node node3 = new Node(2);
        Node node4 = new Node(2);
        Node node5 = new Node(2);

        node0.setLeft(node1);
        node0.setRight(node2);
        node2.setLeft(node3);
        node2.setRight(node4);
        node3.setRight(node5);

        System.out.println(longestPath(node0));
    }

    private static int longestPath(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(longestPath(node.getLeft()), longestPath(node.getRight()));
    }
}
