import java.util.*;
public class RtoI 
{
public static int  rtoi(String s)
{
HashMap<Character,Integer> map=new HashMap<>();
map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);
s=s.replace("IV","IIII");
s=s.replace("IX","VIIII");
s=s.replace("XL","XXXXX");
s=s.replace("XC","LXXXX");
s=s.replace("CD","CCCCC");
s=s.replace("CM","DCCCC");

int output=0;
for(int i=0;i<s.length();i++)
{
output=output+(map.get(s.charAt(i)));
}
return output;

}
public static void main(String args[])
{
int x=rtoi("VX");
System.out.println("given roman letter is "+x);
}
}