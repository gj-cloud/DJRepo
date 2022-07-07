class Spe
{
    String docName;
    String grp;
    Spe(String a,String  m)
    {
        docName=a;
        grp=m;
    }
    void display()
    {
        System.out.println("name of the doc: "+docName);
        System.out.println("spesalist: "+grp);
    }
}
 
class EyeSpe extends Spe
{
    int noOfPat;
    EyeSpe(String a,String m,int n)
    {
        super(a,m);
        noOfPat=n;
    }
    void display()
    {
        super.display();
        System.out.println("experince 5yrs");
        System.out.println("No. of patients : " +noOfPat);
    }
}
 
class Heartspe extends Spe
{
    int noOfPat;
    Heartspe(String a,String m,int n)
    {
        super(a,m);
        noOfPat=n;
    }
    void display()
    {
        super.display();
        System.out.println("experince 10yrs");
        
        System.out.println("No. of patients:" +noOfPat);
    }
}
 
class Dentist extends Spe
{
    int noOfPat;
    Dentist(String a,String m,int n)
    {
        super(a,m);
        noOfPat=n;
    }
    void display()
    {
        super.display();
        System.out.println("experince 3yrs");
        
        System.out.println("No. of patients:" +noOfPat);
    }
}
 
public class Main
{
    public static void main(String arg[])
    {
        EyeSpe eyed;
        Heartspe heartd;
        Dentist dint;
        eyed=new EyeSpe("dr kiran mbbs","eye spesalist",2);
        heartd=new Heartspe("dr phani","heart spesalist",3);
        dint=new Dentist("dr ram","dentist",4);
        eyed.display();
        heartd.display();
        dint.display();
    }
}