import java.util.*;;
public class App {
    public static void main(String[] args) throws Exception {
            Scanner input = new Scanner(System.in);
    
            System.out.println("Enter the first Number");
            int a = input.nextInt();
    
            System.out.println("Enter the second number");
            int b = input.nextInt();
    
            if(a>b){
                System.out.println("The maximum number is:" + a);
            }
    
            else if(a<b){
                System.out.println("The maximum number is:" + b);
            }
    
            else{
                System.out.println("the two numbers are equals");
            }
    
        
    }
}
