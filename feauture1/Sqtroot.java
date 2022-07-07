class Sqtroot {
    public int mySqrt(int x) {
  int l=1, r=x/2;
while(l<=r){
int m=(l+r)/2;
if(m>x/m)
{
r=m-1;
continue;
}
if((m+1)==x/(m-1))
{
l=m-1;
}
return m;
}
return l;
}
}





