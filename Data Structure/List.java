/* List class (in the name) */

public class List {

    
    /* Class to add each node */

    /* Each Node holds the following data:
    * data --> holds data at each node
    * next --> pointer to next node
    * isTail --> keeps track if a node is a tailNode or not
    */ 
    class Node {

        public int data; 
        public Node next;
        public boolean isTail;


    }

    public Node headPtr;
    public Node tailPtr;
    public int count;

    public List() {
        this.headPtr = null;
        this.tailPtr = null;
        this.count = 0;
    }


    /* Inserts the node at the end of the list */
    public void insert(int data) {
        Node temp = new Node();
        temp.data = data;

        if(headPtr == null) {
            headPtr = temp;
            tailPtr = temp;
        } else {
            tailPtr.next = temp;
            tailPtr = temp;
            tailPtr.next = headPtr;
        }
        count++;
    }

    public void remove(int data) {
        Node val = search(data);
        if(val == null) {
            System.out.println("Can't remove what isn't there!");
        } else {
            Node temp = headPtr, prev = headPtr;

            do {
                if(temp == val) {
                    break;
                }
                prev = temp;
                temp = temp.next;
            } while(temp != headPtr);
        
            if(temp == headPtr) {
                headPtr = temp.next;
                tailPtr.next = headPtr;
            } else if(temp == tailPtr) {
                tailPtr = prev;
                tailPtr.next = headPtr;
            } else {
                prev.next = temp.next;
                temp.next = null;
            }
            count--;
        }

    }
    /* displays the list */
    public void print() {
        
        Node temp = headPtr;
        if(count == 0) {
            System.out.println("List empty");
            return;
        } else if(count == 1) {
            System.out.println(headPtr.data);
            return;
        }
        
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while(temp != headPtr);
    }

    public Node search(int data) {
        Node temp = headPtr;
        Node val = null;
        do {
            if(temp.data == data) {
                val = temp;
            }
            temp = temp.next;
        } while(temp != headPtr);

        return val;
    }

}





















































// /* Singly linked list class */

// public class List {
//     public Node headPtr;
//     public Node tailPtr;


//     public List() {
//         headPtr = null;
//         tailPtr = null;
//     }

//     /* Adds a new node to the list */
//     public void add(String x) {
//        Node temp = null;

//        if(headPtr == null) {
//            headPtr = new Node(x);
//            headPtr.next = headPtr;
//        } else {
//            temp = headPtr;

//            while(temp.next != headPtr) {
//                temp = temp.next;
//            }

//            Node newNode = new Node(x);
//            temp.next = newNode;
//            newNode.next = headPtr;
//        }
//     }

//     /* Temporary add */
//     public void singlyAdd(String x) {
//        Node temp = null;

//        if(headPtr == null) {
//            headPtr = new Node(x);
//         //    headPtr.val = x;
//            headPtr.next = null;
//        } else {
//            temp = headPtr;
//            while(temp.next != null) {
//                temp = temp.next;
//            }
//            Node newNode = new Node(x);
//            temp.next = newNode;
//            temp.val = x;
           
//            newNode.next = null;
//        }
//     }

//     /*Removes given node from the list */
//     public void remove(String x) {

//         /*Search where the node is first */

//         Node searchNode = headPtr;
//         while(!(searchNode.val.equals(x))) {
//             searchNode = searchNode.next;
//         }

//         /* If deleted node is headptr */
//         if(searchNode == headPtr) {
//             System.out.println(searchNode.val + " entered at searchnode == headPtr");
//             Node lastNode = headPtr;
//             Node replaceNode = headPtr;
//             while(lastNode.next != headPtr) {
//                 lastNode = lastNode.next;
//             }
//             replaceNode = headPtr.next;
//             lastNode.next = replaceNode;
//             headPtr = replaceNode;
//         }

//         /* if searchnode is in the middle of the list */
//         if(searchNode != headPtr && searchNode.next != headPtr) {
//             // System.out.println(searchNode.val + " entered here");
//             Node tempP = headPtr;
//             // System.out.println(tempP.val + " and " + searchNode.next.val);

//             while(!(tempP.next.val.equals(x))) {
//                 tempP = tempP.next;
//             }
//             // System.out.println(tempP.val + " tempP val  ");
//             tempP.next = searchNode.next;
//             // System.out.println(tempP.next.val + " tempP.next.val");
//             searchNode.next = null;
           
//         }

//         /*if searchNode is the last node in the list */
//         if(searchNode.next == headPtr) {
//             Node prevNode = headPtr;
//             while(prevNode.next != searchNode) {
//                 prevNode = prevNode.next;
//             }
//             prevNode.next = headPtr;
//             searchNode.next  = null;
//         }
       
//     }


//     /*print the nodes in the list */
//     public void print() {
//         Node ptr = headPtr;
//         while(ptr.next != null) { 
//             System.out.println(ptr.val);
//             ptr = ptr.next;
//         }
//     }

//     /* Print method for circly singly linked list */
//     public void printcircly() {
//        Node temp = headPtr;
//     //    System.out.println(temp.val);
//     //    System.out.println(temp.next.val);
//     //    System.out.println(temp.next.next.val);
//        while(temp.next != headPtr) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }
        
//     }


// }