class MyLinkedList {
    private Node head;
    private Node tail;
    private int length;
    private class Node{
        public int val;
        public Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    
    public int get(int index) {
        if(index >= length || index < 0)
            return -1;
        Node ptr = head;
        while(index > 0){
            ptr = ptr.next;
            index--;
        }
        return ptr.val;
    }
    
    public void addAtHead(int val) {
        Node ptr = new Node(val);
        ptr.next = this.head;
        this.head = ptr;
        if(this.length == 0)
            this.tail = ptr;
        this.length++;
    }
    
    public void addAtTail(int val) {
        Node ptr = new Node(val);
        if(this.length == 0){
            this.head = ptr;
            this.tail = ptr;
        }else{
            this.tail.next = ptr;
            this.tail = ptr;
        }
        this.length++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index == this.length){
            this.addAtTail(val);
        }else if (index == 0){
            this.addAtHead(val);
        }else if (index < this.length && index > 0){
            Node newNode = new Node(val);
            Node ptr = this.head;
            while(index > 1){
                ptr = ptr.next;
                index--;
            }
            newNode.next = ptr.next;
            ptr.next = newNode;
            this.length++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if(index == 0){
            this.head = this.head.next;
            // garbage collect old this.head T_T
            this.length--;
        }else if(index > 0 && index < this.length){
            Node ptr = this.head;
            while(index > 1){
                ptr = ptr.next;
                index--;
            }
            if(ptr.next == this.tail)
                this.tail = ptr;
            ptr.next = ptr.next.next;
            // garbage collect deleted node T_T
            this.length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
