package balanceBracketsUsingStack;
import java.util.*;
 
public class BalancingBrackets {
 
    
    static boolean areBracketsBalanced(String expression)
    {
        
        Deque<Character> stack= new ArrayDeque<Character>();
 
        
        for (int i=0;i<expression.length();i++)
        {
            char x = expression.charAt(i);
 
            if (x=='(' || x=='[' || x=='{')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check=='{' || check=='[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check=='(' || check=='[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check=='(' || check=='{')
                    return false;
                break;
            }
        }
 
        
        return (stack.isEmpty());
    }
    
   
    public static void main(String[] args)
    {
    	
       String expression = "([[{}]]))";
 
       
    	   if (areBracketsBalanced(expression))
    		   System.out.println("The entered String has Balanced Brackets");
    	   else
    		   System.out.println("The entered Strings do not contain Balanced Brackets");
        }
        
    }
