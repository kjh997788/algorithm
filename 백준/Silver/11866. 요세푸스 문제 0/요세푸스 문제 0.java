import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] sArr = br.readLine().split(" ");
        int N = Integer.parseInt(sArr[0]);
        int K = Integer.parseInt(sArr[1]);
        int[] answer = new int[N];
        CircularQueue circularQueue = new CircularQueue(N);
        for (int i = 1; i <= N; i++) {
            circularQueue.enqueue(i);
        }
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < K; j++) {
                circularQueue.enqueue(circularQueue.dequeue());
            }
            answer[i] = circularQueue.dequeue();
        }
        bw.write("<");
        for (int i = 0; i < N-1; i++) {
            bw.write(answer[i] + ", ");
        }
        bw.write(answer[N-1] + ">");
        bw.close();
        br.close();
    }
}

class CircularQueue {
    private final int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

//    public int size() {
//        return size;
//    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        queue[rear] = value;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }
        int removedValue = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return removedValue;
    }
}