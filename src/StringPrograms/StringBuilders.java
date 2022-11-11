package StringPrograms;
public class StringBuilders {
	public static void main(String[] args) {
StringBuilder sb=new StringBuilder("Shubham");
System.out.println(sb);
//char at index 3
System.out.println(sb.charAt(3));
//set char at index 7
sb.setCharAt(0, 'Y');
System.out.println(sb);
//insert at index
sb.insert(0, 'Y');
System.out.println(sb);
//To delete at index 0
sb.delete(0, 0);
System.out.println(sb);
//to append/add 
sb.append(" ");
sb.append("Y");
sb.append("a");
sb.append("d");
sb.append("a");
sb.append("v");
System.out.println(sb);

	}  

}
