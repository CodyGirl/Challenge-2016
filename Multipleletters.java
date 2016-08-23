/*input : enter the set of letters needed to be counted.
 * eg: aabbccFFs
 * output: a2b2c3f2s1*/
package project1;
import java.util.Scanner;
import java.util.ArrayList;
public class Multipleletters {
  public static void main(String[] args){
      String word;
      int i=0,j=0,z=1,length;
      Scanner sc=new Scanner(System.in);
      word=sc.nextLine();
      char[] newword=word.toLowerCase().toCharArray();
      length=word.length();
      if(length==1){
          System.out.println(newword[0]+"1");
      }
      for(i=0;i<length-1;i++){
       if(newword[j]==newword[j+1]){ 
           z++;
       }
       else{
           System.out.print(""+newword[j]+""+z);
           z=1;
           }
       j++;
       if(j==(length-1)){
          System.out.print(""+newword[j]+""+z);
      }
       }
      
  }  
}
