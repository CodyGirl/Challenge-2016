package project1;
import java.util.*;
import java.lang.*;
public class challenge4
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of array elements: ");
        n=sc.nextInt();
        sc.nextLine();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
            str[i]=sc.nextLine();
        System.out.println(Arrays.toString(str));
        String input;
        System.out.println("Enter your string");
        input=sc.nextLine();
        int flag=0;
        for(int i=0;i<n;i++)
        {
            int count=0;
            if(input.equals(str[i])==true)
            {
                System.out.println("Found the command");
                break;
            }
            else
            {
                for(int j=0,k=0;j<str[i].length()&&k<input.length();k++,j++)
                {
                        if(str[i].charAt(j)!=input.charAt(k))
                        {
                            count++;
                        }
                }
                count= count+Math.abs(str[i].length()-input.length());
                if(count<3)
                {
                    System.out.println("did you mean "+str[i]);
                    flag++;
                }
            }
        }
        if(flag==0)
            System.out.println("Command not found");
    }
}
