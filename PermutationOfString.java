import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class PermutationOfString {
	public static void main(String[] args) {

		// convertPostFixToInfix("ab*c+");
		find_permutation("ABC").forEach(System.out::println);
	}
  
public static List<String> find_permutation(String S) {
		List<String> obj=new ArrayList<String>();
		findPerM(S, "",obj );
		return obj;
	}

	public static void findPerM(String s, String ans, List<String> obj) {

		if (s.length() == 0) {

			obj.add(ans);
			return;
		}
		Set<String> on = new HashSet<String>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String rest = s.substring(0, i) + s.substring(i + 1);

			if (on.add(String.valueOf(ch))) {
				findPerM(rest, ans + String.valueOf(ch), obj);

			}

		}

	}
}
