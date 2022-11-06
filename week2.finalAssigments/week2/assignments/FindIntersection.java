package week2.assignments;



public class FindIntersection {

	public static void main(String[] args) {

       int[] a={3,2,11,4,6,7};
       int[] b={1,2,8,4,9,7};
        
       int firstArraylen =a.length;
       int secArraylen = b.length;
       
       System.out.println("Matched Numbers are");
       
       for (int i=0;i<firstArraylen;i++)
    	 {
    	   for (int j=0;j<secArraylen;j++)
    	   {

			   
    		   if (a[i]==b[j])
    		   {
    		     System.out.println(a[i]);
    		   }
    		   else
    		   {
    			   
    		   }
    	   }
    	}
	}

}
