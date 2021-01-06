import java.io.IOException;
import java.util.Scanner;

public class Atividades {

	public static void main(String[] args) throws IOException{
	
		   Scanner i = new Scanner(System.in);
	       
		   int num,cont;
		   
		   num = i.nextInt();
		   
	       for(cont = num; cont <= num+(6*2); cont++){
	    	   
	    	   if(cont % 2 != 0) {
	    		   
	    		   System.out.println(cont);
	    		   
	    	   }
	    	   
	       }
	       
	       i.close();
		
	}

}
