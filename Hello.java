import java.util.*;

import org.w3c.dom.Node;
public class Hello {

    public static void main(String[] args) {

     
       
        int sum=0;
      
        int[] s = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
        for(int i=0;i<s.length;i++){
            sum=sum+s[i];
        }

        int[] sumArray = {sum};
          System.out.println(" Sum of elements in the integer array : "+Arrays.toString(sumArray));

        LinkedList<Integer> ll=new LinkedList<Integer>();  

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
    
        // System.out.println(ll);
        /* while(!ll.isEmpty()){
          int temp = ll.pop();
         System.out.print(temp);   
      
        } */
        Stack<Integer> stack = new Stack<>();

        // Add elements from linked list to stack
        
        for ( Integer element : ll) {
            stack.push(element);

        }

        // Print the stack
      //  System.out.println("Elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.println("reversed elements : " +stack.pop());
        
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        // Iterate through the queue and print values at odd indices
        Queue<Integer> evenindex = new LinkedList<>();
       
        
        int index = 0;
      
        for (Integer value : queue) {
            if (index % 2 == 0) {
                System.out.println("Value at even index " + index + ": " + value);
                evenindex.add(value);
            }
            index++;

           // System.out.println(evenindex);
            


           
        }

          Map<Integer,Integer> map=new HashMap<>();
    for(int i=1;i<5;i+=2)
    {
        map.put(i,ll.get(i));
    }
      
  
      System.out.println("Map odd elements : " + map);


       
       

   

      }
  
      }





