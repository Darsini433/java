public class Main1
{
    public String fun(int n)
    {
        if(n==11){
            return"chicken biryani";
        }
        System.out.println(n);
        String s=fun(n+1);
        System.out.println(n);
        return s;
    }
	public static void main(String[] args) {
	    Main1 m=new Main1();
	    System.out.println(m.fun(1));
	}
}