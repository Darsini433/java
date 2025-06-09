public class Mainfact
{
    public int fun(int n)
    {
        if(n==1){
            return 1;
        }
        return n*fun(n-1);
    }
	public static void main(String[] args) {
	    Mainfact m=new Mainfact();
	    System.out.println(m.fun(3));
	}
}