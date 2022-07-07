abstract class Device{
abstract void manufac();
abstract void produc();
abstract void deliv();
}
public class Devmanu extends Device
{
void manufac()
{
System.out.println("list of manufacturing details: 1. Mobiles\n2. Laptops");
}

void produc()
{
System.out.println("complete product details: 1.Samsung Mobiles\n2.HP Laptops");
}
void deliv()
{
System.out.println("Deliverd products:1.Mobiles=20\n 2. Laptops=20") ;
}
public static void main(String args[])
{
Devmanu obj=new Devmanu();
obj.manufac();
obj.produc();
obj.deliv();
}
}
