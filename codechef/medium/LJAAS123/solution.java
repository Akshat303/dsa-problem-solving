class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		int a = 0 , b = 1;
		for (int i = 0 ; i < 10 ; i++){
		    System.out.print(a + " ");
		    int next = a + b ;
		     a = b;
		      b = next ;
		}

	}
}
