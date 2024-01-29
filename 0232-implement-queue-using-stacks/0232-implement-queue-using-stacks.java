class MyQueue {
    private Stack<Integer> input,output;
    private int size;

    public MyQueue() {
        this.input=new Stack();
        this.output=new Stack();
        this.size=0;
    }
    
    public void push(int x) {
        this.input.push(x);
        this.size++;
    }
    
    public int pop() {
        if(this.output.size()==0)
        {
            if(this.input.size()==0)return 0;
            while(this.input.size()!=0)
            {
                this.output.push(this.input.pop());
            }
        }
        this.size--;
        return (int)this.output.pop();
    }
    
    public int peek() {
        if(this.output.size()==0)
        {
            if(this.input.size()==0)return 0;
            while(this.input.size()!=0)
            {
                this.output.push(this.input.pop());
            }
        }
        return (int)this.output.peek();
    }
    
    public boolean empty() {
        System.out.println(this.size);
        return this.size==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */