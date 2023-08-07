package Lecture_69;
import java.util.*;
public class Node {
    int key;
    List<Node> child;
    public Node(int key) {
        this.key = key;
        child = new ArrayList<Node>();
    }
}
class NextLargerElement {
    public static void main(String args[]) {
        Node root = new Node(20);
        (root.child).add(new Node(8));
        (root.child).add(new Node(22));
        (root.child.get(0).child).add(new Node(4));
        (root.child.get(0).child).add(new Node(12));
        (root.child.get(0).child.get(1).child).add(new Node(10));
        (root.child.get(0).child.get(1).child).add(new Node(14));


        int x = 10;
        nextLargerElement(root, x);
        System.out.print(res.key);
    }
    static Node res = null;
    public static void nextLargerElement(Node node, int x) {
        if (node == null)
            return;
        if (node.key > x)
            if ((res == null || (res).key > node.key))
                res = node;


        int numChildren = node.child.size();


        for (int i = 0; i < numChildren; i++)
            nextLargerElement(node.child.get(i), x);
        return;
    }
}