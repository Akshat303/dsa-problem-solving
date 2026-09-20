import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        //your code goes InheritableThreadLocal
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int a = sc.nextInt();
        
        if (!sc.hasNextInt()) return;
        int b = sc.nextInt();
        
        char op = sc.next().charAt(0);
        
        switch (op){
            case  '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                if (b !=0){
                System.out.println(a / b);
                }
                break;
            default :
            break;
        }
        
        sc.close();
        
        
    }
}