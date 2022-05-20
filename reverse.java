import java.util.*;
public class reverse 
{
    public static void main(String[] args) 
    {
        Scanner kb =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = kb.nextInt();
        int reverse=0,reminder;
        while(number != 0)
        {
            reminder = number%10;
            reverse = reverse*10+reminder;
            number = number/10;
        }
        System.out.println("Reverse = "+reverse);
    }
}
