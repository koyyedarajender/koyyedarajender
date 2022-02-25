package com.org.project.coreJava;

/**
 * Created by rajender.koyyeda on 14-02-2022.
 */
public class CastConvertGeneric {

    <T> void display(T x){
        System.out.println(x);
    }

   public void display1(String y){
        System.out.println(y);
    }
    public static void main(String args[]){
        /*
        int x=10;
        float y=x;
        System.out.println(y);
        float y=10;
        int x=(int)y;
        System.out.println(x);
        String a = "123";
        System.out.println(a+10);  //12310
        int b = Integer.parseInt(a);
        System.out.println(b+10);  //133 */
        CastConvertGeneric castConvertGeneric = new CastConvertGeneric();

        castConvertGeneric.display1("jaya");
        castConvertGeneric.display(2);
        castConvertGeneric.display('a');
        castConvertGeneric.display(10.2);
        castConvertGeneric.display("test");



    }
}
