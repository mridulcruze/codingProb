package practice;

import java.util.Objects;

public class TSYS_TEST {

    private TSYS_TEST tSYS_TESTObj;
    private String Name;

    public TSYS_TEST retrieveObject(){
        if(Objects.isNull(tSYS_TESTObj)){
            tSYS_TESTObj = new TSYS_TEST();
        }
        return tSYS_TESTObj;
    }

    private TSYS_TEST(){
        System.out.println("Object created");
    }


    public static void main(String[] args) {

        TSYS_TEST tsysTest=new TSYS_TEST();

        MyThreadClass obj=new MyThreadClass();
        obj.run();

        synchronized(tsysTest){

        }

    }


}

class MyThreadClass implements Runnable{

    public void run(){
        System.out.println("Hello World !");
    }
}