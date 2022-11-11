package ArrayPrograms;
public class MinANDmax {
	public static void main(String[] args) {
int ar[]= {06,43,24,22,34,63,45,342,54,64};
	int max=ar[0];
	int min=ar[0];
	for(int i=0; i<ar.length; i++) {
		System.out.println(ar[i]);
		if(ar[i]>max && ar[i]>min)
			max=ar[i];
		min=ar[i];
		
	}
	System.out.println("minimum number is"+min);
	System.out.println("maximum number is"+max);
	}
}
