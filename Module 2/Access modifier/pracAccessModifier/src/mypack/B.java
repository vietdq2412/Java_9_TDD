package mypack;

import pack.A;

public class B extends A {

    public static void main(String[] args) {

        B obj = new B();

        obj.msg();
        obj.msg2();
    }
    public void a(){
        A a = new A();
        a.msg();
    }

}

