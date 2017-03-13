import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ride{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("ride.in");
		
		Scanner s= new Scanner(file);
		String word1;
		String word2;

		String alpha = "0ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int num=0;
		int total1=1;
		int total2=1;
		int total = 1;
		

		
		word1 = s.next();
		word2 = s.next();

		
		
		
		//System.out.println(word1);
		//System.out.println(word2);
		
		for(char d:word1.toCharArray()){
			//System.out.println(d);
			num = alpha.indexOf(d, 0);
			//System.out.println(num);
			total1 = total1*num;
			
		}
		//System.out.println(total1);
		
		for(char d:word2.toCharArray()){
			//System.out.println(d);
			num = alpha.indexOf(d, 0);
			//System.out.println(num);
			total2 = total2*num;
			
		}
		//System.out.println(total2);
		
		int mod1 = 0;
		int mod2 = 0;
		
		mod1 = total1%47;
		mod2 = total2%47;
		
		//System.out.println(mod1 + " " + mod2);
		PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("ride.out")));
		
		if(mod1 == mod2){
			//System.out.println("GO");
			out.println("GO");                           // output result
		    
		}else{
			//System.out.println("Stay");
			out.println("STAY");
		}
		// output result
	    out.close(); 
		
	}

}
