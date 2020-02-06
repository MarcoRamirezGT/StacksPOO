public class Stack_<T> {

    private int size;
    private Node<T> head;

    public Stack_() {
        head = null;
        size = 0;
    }
/**
 * 
 * @param element
 */
    public void push(T element) {
        if(head == null) {
            head = new Node(element);
        } else {
            Node<T> newNode = new Node(element);
            newNode.next = head;
            head = newNode;
        }

        size++;
    }
/**
 * @param T pop 
 * @return
 */
    public T pop() {
        if(head == null)
            return null;
        else {
            T topData = head.data;

            head = head.next;
            size--;

            return topData;
        }
    }
/**
 * @param T top 
 * @return head
 */
    public T top() {
        if(head != null)
            return head.data;
        else
            return null;
    }
/**
 * @param size
 * @return size
 */
    public int size() {
        return size;
    }
/**
 * @param isEmpty
 * @return size!=0
 */
    public boolean isEmpty() {
        return size == 0;
    }
/**
 * 
 *
 *
 * @param <T>
 */
    private class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }

    }

}