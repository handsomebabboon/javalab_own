package problem12;

import java.util.*;

public class queue {
    
    
    static ArrayList<String> queue = new ArrayList<>();


    static void enqueue(String x){
        
        queue.add(x);
      
    }

    static void dequeue(){
        if(queue.isEmpty()){
            System.out.println("queue is empty,cannot dequeue");
            return; 
        }
        queue.remove(0);
    }

    static void display(){
        if(queue.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=0 ; i<queue.size() ; i++){
            System.out.println(queue.get(i)+"\t");
        }
    }

    public static void main(String args[]){
        int choice=99;
        String str;
        Scanner sc = new Scanner(System.in);

        while(choice != 4){
            System.out.println("Enter an option\n 1-enqueue \n 2- dequeu \n 3-display \n 4-exit\n");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                
                case 1:
                    System.out.println("Enter string to enqueue");
                    str = sc.nextLine();
                    enqueue(str);
                    break;

                case 2:
                    dequeue();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    return;
            }
        }
        sc.close();
    }

  
    
    
}
