class LRUCache {

    /*public LRUCache(int capacity) {
        
    }*/

    
    // create the ndoe
    static class Node
    {
        int key , value;
        Node prev;
        Node next;
        
        Node(int k , int v)
        {
            this.key = k;
            this.value =v;
            // all the prev and the next will be null
            prev = next = null;
        }
    }
    
    // create a dummy head and tail wil value of -1 , -1
    Node head = new Node(-1 , -1);
    Node tail = new Node(-1 , -1);



    // create an unorders map for the key val storage
    HashMap<Integer  , Node> m = new HashMap<>();
    int limit;
    
    LRUCache(int capacity)
    {
        // code here
        limit = capacity;
        // now  we will point the head to the tail
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        // your code here
        if(!m.containsKey(key)) return -1;
        // now we will store the val of the key or the to the ansNode
        Node ansNode = m.get(key);
        // now we will ge the address of the node
        int ans = ansNode.value;
        // now we will need to remove the ansNode from the ll
        // first delete the key from the map
        m.remove(key);
        //now delete thendeo
        deletenode(ansNode);
        // then  add the ndoe
        addnode(ansNode);
        // add the key val pair in map
        m.put(key , ansNode);
        
        return ans;
        
    }

    
    
    // addnode and delete node function
    public void addnode(Node newNode)
    {
        //we will store the head.next or the tail node
        Node oldnext = head.next;
        // head will point to new node
        head.next = newNode;
        newNode.prev = head;
        newNode.next = oldnext;
        oldnext.prev = newNode;
        
        
    }
    public void deletenode(Node oldnode)
    {
        Node oldprev = oldnode.prev;
        Node oldnext = oldnode.next;
        oldprev.next = oldnext;
        oldnext.prev = oldprev;
    }
    public  void put(int key, int value) {
        // your code here
        // wewill first check that if it exists or not
        if(m.containsKey(key))
        {
            // if this is true
            // get the value of the key or the address of the node that we want to delete
            Node oldnode = m.get(key);
            // now we will delete the node from the DLL
            deletenode(oldnode);
            // now earese the node from the map
            m.remove(key);
        }
        // if the map capacity reached
        if(m .size() == limit)
        {
            // here we will delete the key val from the map first of the lru
            m.remove(tail.prev.key);
            // then we will remove the lru
            deletenode(tail.prev);
        }
        // else we will create the new node  with the key and value
        Node newNode = new Node(key , value);
        // now add the ndoe to the front in the ll
        addnode(newNode);
        // add the key and value to the map
        m.put(key , newNode);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */