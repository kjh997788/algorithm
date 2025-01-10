import java.io.*;
import java.util.*;

class Main {
    static Map<Character, Node> tree = new HashMap<>();

    // 노드 클래스 정의
    static class Node {
        char data;
        Node left, right;

        Node(char data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // 전위 순회 (루트 -> 왼쪽 -> 오른쪽)
    static void preOrder(Node node, StringBuilder result) {
        if (node == null) return;
        result.append(node.data);
        preOrder(node.left, result);
        preOrder(node.right, result);
    }

    // 중위 순회 (왼쪽 -> 루트 -> 오른쪽)
    static void inOrder(Node node, StringBuilder result) {
        if (node == null) return;
        inOrder(node.left, result);
        result.append(node.data);
        inOrder(node.right, result);
    }

    // 후위 순회 (왼쪽 -> 오른쪽 -> 루트)
    static void postOrder(Node node, StringBuilder result) {
        if (node == null) return;
        postOrder(node.left, result);
        postOrder(node.right, result);
        result.append(node.data);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            char parent = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            tree.putIfAbsent(parent, new Node(parent)); // 부모 노드 생성
            Node parentNode = tree.get(parent);

            if (left != '.') {
                tree.putIfAbsent(left, new Node(left)); // 왼쪽 자식 노드 생성
                parentNode.left = tree.get(left);
            }
            if (right != '.') {
                tree.putIfAbsent(right, new Node(right)); // 오른쪽 자식 노드 생성
                parentNode.right = tree.get(right);
            }
        }

        Node root = tree.get('A');

        StringBuilder preOrderResult = new StringBuilder();
        StringBuilder inOrderResult = new StringBuilder();
        StringBuilder postOrderResult = new StringBuilder();

        preOrder(root, preOrderResult);
        inOrder(root, inOrderResult);
        postOrder(root, postOrderResult);

        bw.write(preOrderResult.toString() + "\n");
        bw.write(inOrderResult.toString() + "\n");
        bw.write(postOrderResult.toString() + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}