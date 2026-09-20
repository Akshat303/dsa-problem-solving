import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		if (sc.hasNextInt()){
		    int t = sc.nextInt();
		    while (t-- > 0){
		        int n = sc.nextInt();
		        System.out.println(n + 1);
		    }
		}
		
		sc.close();

	}
}
