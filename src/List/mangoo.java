package List;

import java.util.ArrayList;

public class mangoo {

	    public static void main(String[] args)
	    {
	  
	       
	        ArrayList<Integer> arrli = new ArrayList<Integer>();
	  
	        
	        for (int i = 1; i <= 8; i++)
	            arrli.add(i);
	  
	      
	        System.out.println(arrli);
	  
	        
	        arrli.remove(3);
	  
	        
	        System.out.println(arrli);
	  
	        	        for (int i = 0; i < arrli.size(); i++)
	            System.out.print(arrli.get(i) + " ");
	    }
	}

