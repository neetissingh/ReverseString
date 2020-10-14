import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateOccuranceString 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String str = "Neeti get get ready for interview interview";
		 String[] strArray = str.split(" ");
		
		 HashMap<String, Integer> StrHashmap = new HashMap<String, Integer>();
		 int count = 0;
		 for (String s:strArray )
		 {
			 if(StrHashmap.containsKey(s))
			 {
				 count = count+1;
				 StrHashmap.put(s, count);
			 }
			 else
			 {
				 StrHashmap.put(s, count); 
			 }
		 }
		 for (Entry<String, Integer> entry : StrHashmap.entrySet()) 
			{ 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        
			}
			 
	}
}
