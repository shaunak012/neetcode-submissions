class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack =new Stack<>();
        int answer=0;
        for(int i=0;i<tokens.length;i++){
            char ch=tokens[i].charAt(0);
            if(tokens[i].length()>1){
                stack.push(Integer.parseInt(tokens[i]));
            }
            else if(ch=='+'){
                stack.push(stack.pop()+stack.pop());
            }
            else if(ch=='-'){
                int first=stack.pop();
                stack.push(stack.pop()-first);
            }
            else if(ch=='*'){
                stack.push(stack.pop()*stack.pop());
            }
            else if(ch=='/'){
                int first=stack.pop();
                stack.push(stack.pop()/first);
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            System.out.print(stack.peek()+", ");
        }
        return stack.pop();
    }
}
