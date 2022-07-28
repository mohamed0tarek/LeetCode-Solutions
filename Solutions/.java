class MyHashSet {
    ArrayList arr;

    public MyHashSet() {
        arr = new ArrayList();
    }
    
    public void add(int key) {
        if(!arr.contains(key))
            arr.add(key);
    }
    
    public void remove(int key) {
        if(arr.contains(key))
            arr.remove(arr.indexOf(key));
    }
    
    public boolean contains(int key) {
        return arr.contains(key);
    }
}
