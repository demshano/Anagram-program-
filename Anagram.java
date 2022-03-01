import java.util.Arrays;
import java.util.Scanner;
public class Anagram{
//anagram program which is given two strings and check whether both string characters are same.	
	public static void main(String []args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("word 1: ");
		String w1=scan.nextLine();
		
		System.out.print("word 2: ");
		String w2=scan.nextLine();
		
		char ch1[]=w1.toCharArray();		//convert string to char array
		char ch2[]=w2.toCharArray();
		
		int w1_len=w1.length();
		int w2_len=w2.length(),c;
		
		Arrays.sort(ch1);				//sort both arrays
		Arrays.sort(ch2);
		
		/* for(int i=0;i<w1_len;i++){
			System.out.print(ch1[i]);
		}
		System.out.println();
		for(int i=0;i<w2_len;i++){
			System.out.print(ch2[i]);
		} */
		c=0;
		System.out.println();
		if(w1_len==w2_len){			//check the length of both strings
			
			for(int i=0;i<w1_len;i++){
			c=0;
			if(ch1[i]==ch2[i]){		//if both string characters are same c=1
				c=1;
			}
			else if(ch1[i]!=ch2[i]){	//if same index characters not same c=2
				c=2;
				break;					//if we found 1 missed match characters, need to stop the for loop. then we use break statement
			}
		}
		//System.out.print(c);
		}
		else
			System.out.print("missed match characters");
		
		System.out.print(c);
		
		if(c==1)
			System.out.println("anagram");
		
		else if(c==2)
			System.out.println("not an anagram");
		
}
}