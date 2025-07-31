class MinStack {
    static class pair
    {
        int f; 
        int s;
        pair(int f , int s)
        {
            this.f = f;
            this.s = s;
        }
    }
    private Stack<pair> st ;

    public MinStack() {
        st =  new Stack<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.push(new pair(val , val));
        }
        else
        {
            // form the min val
            int min = Math.min(val , st.peek().s);
            //push
            st.push(new pair(val , min));
        }
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
            st.pop();
        }
    }
    
    public int top() {
        return st.peek().f;
        
    }
    
    public int getMin() {
        return st.peek().s;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */