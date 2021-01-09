package problem3;

import java.util.Scanner;
public class Stack {
    int MAX = 1000;
    int top;
    int a[];// Maximum size of Stack

	Stack(int n) {
		top = -1;
		MAX=n;
		a = new int[MAX];
	}

    void push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
         
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            
        }
    }
 
    void pop()
    {
        if (top < 0) {
            System.out.println("Stack Underflow");
            
        }
        else {
            int x = a[top--];
            System.out.println(x+"was popped");
        }
    }
 

    void display(){
        int temp = top;
        if(temp == -1){
            System.out.println("Stack is empty!Nothing to display!");
        }
        else{
            System.out.print("top ->\t");
            while(temp >=0){
                System.out.print(a[temp]+"\t");
                temp--;
            }
            System.out.print("->bottom\n");
        }
    }
    
        public static void main(String args[])
        {
            Stack s = new Stack(10);
            int ch =0;
            Scanner sc = new Scanner(System.in);
            while(ch != 4){
                System.out.println("Enter\n1)push\n2)pop\n3)Display\n4)Exit");
                
                ch = sc.nextInt();
                    switch(ch){
            
                        case 1:
                            System.out.println("Enter numbver to push");
                            
                            int x=sc.nextInt();
                            
                            s.push(x);
                            break;
            
                        case 2:
                            
                            s.pop();
                           
                            break;
                      

                        case 3:
                            s.display();
                            break;

                        case 4:
                            System.out.println("Exitting");
                            break;
                        default:
                            System.out.println("Invalid input");
                        
                    }
            }
            sc.close();
        }
    
}
 
// Driver code
