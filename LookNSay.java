/*2 i/p..num
1 num- start of series
2 num-length of series
eg. 4 6
14
1114
3114
132114*/
package project1;
import java.util.*;
public class LookNSay {
  public static void main(String[] args){
      String input,output=" ";
      int LengthOfSeries;
      int i=0,j=0,z=1,length;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your starting number: ");
      input=sc.nextLine();
      System.out.println("Enter the length of number: ");
      LengthOfSeries=sc.nextInt();
      length=input.length();
      while(length<=LengthOfSeries){
        char[] newinput=input.toCharArray();
        length=input.length();
        if(length==1){
            output="1"+newinput[0];
            System.out.println(output);
        }
        for(i=0;i<length-1;i++)
        {
         if(newinput[j]==newinput[j+1])
          z++;
         else
            {
             output=""+z+""+newinput[j];
             z=1;
             }
         j++;
         if(j==(length-1)){
            output=output+""+z+""+newinput[j];
            System.out.println(output);
         }
         }
       input=output;
       length=input.length();
       j=0;
       z=1;
  }
  }  
}

