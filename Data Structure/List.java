public class List {
    public Node headPtr;


    public List() {
        headPtr = null;
    }

    /* Adds a new node to the list */
    public void add(String x) {
       Node temp = null;

       if(headPtr == null) {
           headPtr = new Node(x);
           headPtr.next = headPtr;
       } else {
           temp = headPtr;

           while(temp.next != headPtr) {
               temp = temp.next;
           }

           Node newNode = new Node(x);
           temp.next = newNode;
           newNode.next = headPtr;
       }
    }

    /* Temporary add */
    public void singlyAdd(String x) {
       Node temp = null;

       if(headPtr == null) {
           headPtr = new Node(x);
           headPtr.next = null;
       } else {
           temp = headPtr;
           while(temp.next != null) {
               temp = temp.next;
           }
           Node newNode = new Node(x);
           temp.next = newNode;
           
           newNode.next = null;
       }
    }

    /*Removes given node from the list */
    public void remove(String x) {

        /*Search where the node is first */

        Node searchNode = headPtr;
        while(!(searchNode.val.equals(x))) {
            searchNode = searchNode.next;
        }

        /* If deleted node is headptr */
        if(searchNode == headPtr) {
            System.out.println(searchNode.val + " entered at searchnode == headPtr");
            Node lastNode = headPtr;
            Node replaceNode = headPtr;
            while(lastNode.next != headPtr) {
                lastNode = lastNode.next;
            }
            replaceNode = headPtr.next;
            lastNode.next = replaceNode;
            headPtr = replaceNode;
        }

        /* if searchnode is in the middle of the list */
        if(searchNode != headPtr && searchNode.next != headPtr) {
            // System.out.println(searchNode.val + " entered here");
            Node tempP = headPtr;
            // System.out.println(tempP.val + " and " + searchNode.next.val);

            while(!(tempP.next.val.equals(x))) {
                tempP = tempP.next;
            }
            // System.out.println(tempP.val + " tempP val  ");
            tempP.next = searchNode.next;
            // System.out.println(tempP.next.val + " tempP.next.val");
            searchNode.next = null;
           
        }

        /*if searchNode is the last node in the list */
        if(searchNode.next == headPtr) {
            Node prevNode = headPtr;
            while(prevNode.next != searchNode) {
                prevNode = prevNode.next;
            }
            prevNode.next = headPtr;
            searchNode.next  = null;
        }
       
    }


    /*print the nodes in the list */
    public void print() {
        Node ptr = headPtr;
        while(ptr.next != null) { 
            System.out.println(ptr.val);
            ptr = ptr.next;
        }
    }

    /* Print method for circly singly linked list */
    public void printcircly() {
       Node temp = headPtr;
    //    System.out.println(temp.val);
    //    System.out.println(temp.next.val);
    //    System.out.println(temp.next.next.val);
       while(temp.next != headPtr) {
           System.out.println(temp.val);
           temp = temp.next;
       }
        
    }


}