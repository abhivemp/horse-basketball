public class List {
    public Node headPtr;

    public List() {
        headPtr = null;
    }

    /* Adds a new node to the list */
    public void add(String x) {
        
        if(headPtr == null) {
            headPtr.val = x;
            headPtr.next = headPtr;
        } else {
            Node temp = headPtr;
            while(temp.next != headPtr) {
                temp = temp.next;
            }
            Node newNode = new Node(x);
            temp.next = newNode;
            newNode.next = headPtr;
        }
    }
    /*Removes given node from the list */
    public void remove(String x) {
        Node tempP = headPtr;
        Node temp = headPtr.next;
        while(temp.next != headPtr) {
            if(temp.val.equals(x)) {
                tempP.next = temp.next;
                temp.next = null;
                break;
            }
            tempP = temp;
            temp = temp.next;
        }
    }
    /*print the nodes in the list */
    public void print() {
        Node temp = headPtr;
        while(temp.next != headPtr) {
            System.out.println(temp.val);
        }
    }
    public void stuff(String x) {
        System.out.println(x);
    }
}