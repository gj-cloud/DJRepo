class Solution {
    
    public int reverse(int x) {

        int flag=0;
        long y,z;
        
        if(x<=Integer.MIN_VALUE || x>=Integer.MAX_VALUE)
            return 0;
     
        
       if(x<0)
        {
             x=x*(-1);
             flag=1;
            
        }
        
        
        String s=String.valueOf(x);
        
        s=new StringBuilder(s).reverse().toString();
        
  
        if(flag==1)
        {
            
             z=Long.parseLong(s);
       
             z=z*(-1);
            
               if(z>Integer.MAX_VALUE || z<Integer.MIN_VALUE)
                   return 0;
  
           return (int)z;
        }
        
        
          y=Long.parseLong(s);
        
          if(y>Integer.MAX_VALUE || y<Integer.MIN_VALUE)
                return 0;
            
        
         return (int)y;
        
    }
}