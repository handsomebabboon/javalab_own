package problem9;
import java.util.Scanner;
public abstract class Vehicle {
    
    int YOM;

    Vehicle(){

    }
    
    abstract int getData();
    abstract void putData(int YOM);

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);System.out.println("Enter the year of manufacture");
            int x = sc.nextInt();
            MyTwoWheeler myTwoWheeler=new MyTwoWheeler(x);
            System.out.println(myTwoWheeler.getData());
            sc.close();
    }
}

class TwoWheeler extends Vehicle{

    TwoWheeler(int YOM){
        this.YOM = YOM;
    }


    @Override
    int getData(){
        return YOM;
    }
    @Override
    void putData(int YOM){
        this.YOM = YOM;
    }
   
}

final class FourWheeler extends Vehicle{
    @Override
    int getData(){
        return YOM;
    }
    @Override
    void putData(int YOM){
        this.YOM = YOM;
    }
}

class MyTwoWheeler extends TwoWheeler{

    MyTwoWheeler(int YOM){
        super(YOM);
    }
}

