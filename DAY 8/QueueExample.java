public class QueueExample {
    static class Queue {
        int size;
        int front, rear;
        int[] arr;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
            front = rear = -1;
        }

        // Enqueue - Add element
        void enqueue(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            if (front == -1) front = 0; // First insertion
            arr[++rear] = data;
            System.out.println(data + " enqueued");
        }

        // Dequeue - Remove element
        void dequeue() {
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.println(arr[front] + " dequeued");
            front++;
        }

        // Display elements
        void display() {
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty");
                return;
            }
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // Should show queue full

        q.display();
    }
}
