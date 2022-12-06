package LAMBDA;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java 8");

        // method 1 alag se class banani padi
        MyInter myInter=new MyInterIMP();
        myInter.sayHello();

        // method 2 alag se class nahi bnani hai ab...using anonymous class

        MyInter i=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is First an-ominous class");
            }
        };
        i.sayHello();

        MyInter i2=new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("This is second anominous class....");
            }
        };
        i2.sayHello();

        // method 3 using lambda expression........

        MyInter i3= ()->
            System.out.println("This is printing using lambda expression...........");

        i3.sayHello();

        MyInter i4=()->
                System.out.println("This is second xpression using lambda......");
             i4.sayHello();


             //  using lambda sum program..............

        SumInter a1=( a, b)-> (a+b);

          int result= a1.sum(4,6);
           System.out.println(result);

           // using lambda String length program.......

        StringLength s1=(String str) ->{
            return str.length();
        };

        System.out.println(s1.getLenght("Shivendra"));
    }
}
