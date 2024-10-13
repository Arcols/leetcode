class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer = new int[temperatures.length] ;
        Stack<Integer> stack = new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.empty() && temperatures[stack.peek()]<=temperatures[i]){
                stack.pop();
            }
            if(!stack.empty()){answer[i] = stack.peek() - i;}
            stack.push(i);
        }
        return answer;
    }
}