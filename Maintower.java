public class Maintower
{
    public void fun(String s,String h,String d,int n)
    {
        if(n==1){
System.out.println("move"+n+"from"+s+"to"+d);
return;
        }
    fun(s,d,h,n-1);
    System.out.println("move"+n+"from"+s+"to"+d);
    fun(h,s,d,n-1);
    }
	public static void main(String[] args) {
	    Maintower m=new Maintower();
	    int n=3;
	    int c=10;
	    m.fun("source","helper","dest",n);
	}
}