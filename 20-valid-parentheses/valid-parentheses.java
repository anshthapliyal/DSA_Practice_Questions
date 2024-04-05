class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> stack = new Stack<Character>();
        char[] c = s.toCharArray();
        if(c.length == 0 || c.length == 1)
        {
            return false;
        }
        for(int i=0; i<c.length; i++)
        {
            if(c[i]=='(' || c[i]=='{' || c[i]=='[')
            {
                stack.push(c[i]);
            }
            else 
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                if (c[i]==')' || c[i]=='}' || c[i]==']')
                {
                    char top = stack.peek();
                    if((c[i]== ')' && top == '(') || (c[i]== '}' && top == '{') || (c[i]== ']' && top == '['))
                    {
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}