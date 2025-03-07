import java.util.Scanner;

public class Travel {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		float so=s.nextFloat();
		float eo=s.nextFloat();
		float distance=eo-so;
		System.out.println("distance:"+String.format("%.2f",distance));
		System.out.println("rupees:"+(int)(distance*25));
	}

}
