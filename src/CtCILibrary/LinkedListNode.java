package CtCILibrary;

public class LinkedListNode {
    public LinkedListNode next;
    public LinkedListNode prev;
    public LinkedListNode last;
    public int data;
    public LinkedListNode(int d, LinkedListNode n, LinkedListNode p) {
            data = d;
            setNext(n);
            setPrevious(p);
    }

    public LinkedListNode(int d) {
            data = d;
    }	

    public LinkedListNode() { }

    public void setNext(LinkedListNode n) {
            next = n;
            if (this == last) {
                    last = n;
            }
            if (n != null && n.prev != this) {
                    n.setPrevious(this);
            }
    }

    public void setPrevious(LinkedListNode p) {
            prev = p;
            if (p != null && p.next != this) {
                    p.setNext(this);
            }
    }	

    public String printForward() {
            if (next != null) {
                    return data + "->" + next.printForward();
            } else {
                    return ((Integer) data).toString();
            }
    }

    public LinkedListNode clone() {
            LinkedListNode next2 = null;
            if (next != null) {
                    next2 = next.clone();
            }
            LinkedListNode head2 = new LinkedListNode(data, next2, null);
            return head2;
    }
    public int length(){
        int length = 0;
        LinkedListNode a = this;
        while (a != null){
            length++;
            a = a.next;
        }
        return length;
    }
    /**
     * Generates a linked list of ints delimited by spaces
     * @param s String of ints seperated by spaces
     * @return Head of generated linked list
     */
    public static LinkedListNode stringToList(String s){
        String[] nums = s.split(" ");
        LinkedListNode n = new LinkedListNode();
        LinkedListNode head = n;
        for(int i = 0; i < nums.length; i++){
            if (i == 0){
                n.data = Integer.parseInt(nums[i]);
                head = n;
            }
            else{
                n.setNext(new LinkedListNode(Integer.parseInt(nums[i])));
                n = n.next;
            }
        }
        return head;
    }
}
