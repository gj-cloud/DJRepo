import java.io.*;
import java.lang.*;
public abstract class Edevice{    //  aclass
public abstract void ematerial();

public class mobile extends Device{     //concrete class
public void ematerial() // override
{
System.out.println("Mobile::material")
System.out.println("Mobile comes under EDevices it is made by ematerials");
}
}
public class Main{
public static void main(String args[])
{
Edevice obj=new Mobile();
obj.stop();     // call method
}
}
o
