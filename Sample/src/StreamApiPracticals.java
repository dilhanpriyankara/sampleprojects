import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPracticals {
	public static void main(String[] args) {
		/*map methode*/
		// create a list of integers 
	    List<Integer> number = Arrays.asList(2,3,4,5);	    
	    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList()); 
	    System.out.println(square); 
	  
	    
		/*filter methode */
	    List<String> names = Arrays.asList("Reflection","Collection","Stream");    
	    List<String> result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList()); 
	    System.out.println(result); 
	    
	    // demonstration of sorted method 
	    List<String> show = names.stream().sorted().collect(Collectors.toList()); 
	    System.out.println(show); 
		
	}
}
