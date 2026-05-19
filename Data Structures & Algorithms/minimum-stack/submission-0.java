class MinStack {
    List<Integer> stack;
    public MinStack() {
        stack = new ArrayList<>();
    }
    
    public void push(int val) {
        stack.add(val);
    }
    
    public void pop() {
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        int min=stack.get(stack.size()-1);
        for(int i=0;i<stack.size()-1;i++){
            min = min< stack.get(i)? min : stack.get(i);
        }
        return min;
    }
}
