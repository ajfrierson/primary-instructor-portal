package udemy.com;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    /**
     * Node class for used solely for the purpose of creating Nodes. (a node is just data and a pointer to the next node)
     */
    public class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    /**
     * LinkedList constructor which is called using the NEW keyword to create new nodes.
     * @param value    is the value of the data in the new node
     */
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }


    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + length);
    }

    /**
     * uses a while loop to loop through list until it comes to the end or a null value and prints those values
     */
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }

    }

    /**
     * appends a value to the end of the linkedList and makes the newNode the tail
     * @param value    the value to be appended to the end of the linked list
     */
    public void append(int value){
        Node newNode = new Node(value);
        if(head == null){
            head= newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast(){
        if(head == null) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0){
            head = null;
            tail = null;
        }
        return temp;
    }

    /**
     * Appends a value to the front of our linked list
     * @param value    the value to be prepended to the front of the linked list
     */
    public void prepend(int value){
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    /**
     * removes the first element of the linked list
     * @return
     */
    public Node removeFirst(){
        if(head == null) return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }
        return temp;
    }

    /**
     * gets the value at a given index
     * @param index the index provided for which we are searching to return the value at that index
     * @return  value returned by this method
     */
    public Node get(int index){
        // this if statement makes sure the index is within range
        if(index < 0 || index >= length){
            return null;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }
        if(index == 0){
            prepend(value);
            return true;
        }
        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true;
        }
        return false;
    }
}
