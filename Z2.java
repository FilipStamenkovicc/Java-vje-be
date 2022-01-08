package edunova;


//find duplicate array value using for loop
public class Z2 {
	
	public static void main(String[] args) {
		
		int[] my_array = {1,2,5,6,13,17,22,26,6};
		
		
		
		for (int i = 0; i < my_array.length; i++)
		{
			for (int j = 0; j < my_array.length; j++)
			{
				if((my_array[i] == (my_array[j])) && (i != j)  )
				{
					System.out.println("Duplicirana vrijednos je: " +my_array[j]);

                }
            }
        }
    }    
}