package com.Pasha.DigitalLab.Team1;

/**
 * Hello world!
 *
 */
public class App 
{
    int x=5 ;

    public static void met(){
        int a=4;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        met();
        App app = new App();
        App app2=new App();
        System.out.println(app2.x);

    }
}
