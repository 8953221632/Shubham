package StringPrograms;

public class ReverseString {
	public static void main(String[] args) {
		String s="ShubhamKumaryadav";
		int a=s.length();
		String rev=" ";
		for(int i=a-1; i>=0; i--) {
			rev =rev+s.charAt(i);

		}
		System.out.println(rev);
	}

}

