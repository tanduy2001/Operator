
package basic.dev;

/**
 * Lab08
 * @author Admin
 *
 */
import java.text.NumberFormat;
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMaximumFractionDigits(2);
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		a = sc.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		b = sc.nextInt();
		float d = (float) a/b;
		System.out.printf("%d + %d = %d\n",a,b,a+b);
		System.out.printf("%d - %d = %d\n",a,b,a-b);
		System.out.printf("%d x %d = %d\n",a,b,a*b);
		System.out.printf("%d : %d = ",a,b);
		System.out.println(Math.ceil(d*100)/100);
		String c; 
		c = a>b?">":a==b?"=":"<";
		System.out.println("Ket qua so sanh cua a voi b la: " + c);
	}

}
