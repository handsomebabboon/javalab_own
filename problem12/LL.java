package problem12;

import java.util.*;

public class LL {
    public static void main(String args[]){
        LinkedList<String> ll= new LinkedList<>();
        int choice;
        Scanner sc  = new Scanner(System.in);
        while(true){
            System.out.println("Enter a choice \n1-add name \n 2-disaply all names \n 3 - display names with length <5\n 4-exit \n");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){

                case 1:
                    System.out.println("Enter the string to insert");
                    String x = sc.nextLine();
                    ll.add(x);
                    break;

                case 2:
                if(ll.peek() == null){
                    System.out.println("It is empty");
                    return;
                }
                Iterator<String> itr = ll.iterator();
                while(itr.hasNext()){
                    System.out.println(itr.next());
                }
                break;


                case 3:
                if(ll.peek() == null){
                    System.out.println("It is empty");
                    return;
                }
                    Iterator<String> itr1 = ll.iterator();
                    String temp = "";
                    while(itr1.hasNext()){
                        temp = itr1.next();
                        if(temp.length() < 5){
                            System.out.println(temp);
                        }
                    }


                case 4:return;
                }

                

            }
        }

        

    }

