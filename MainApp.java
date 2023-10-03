package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String Name = "Le Hoang Linh";
		 int maSV =sc.nextInt();
		 long cmnd = sc.nextLong();
		 float dtb = sc.nextFloat();
		 String name = "Le Van A";
		 long sdt =sc.nextLong();
		 float hsl = sc.nextFloat();
		 String nameCar = "Maserati M20";
		 float gia = sc.nextFloat();
		 String color = "Blue";
		 //TTSV
		 System.out.println ("Le Hoang Linh:" +Name);
		 System.out.println (maSV);
		 System.out.println (cmnd);
		 System.out.println (dtb);
		 //TTCN
		 System.out.println ("Le Van A:" +name);
		 System.out.println (sdt);
		 System.out.println (hsl);
		 //TTX
		 System.out.println ("Maserati M20:" +nameCar);
		 System.out.println (gia);
		 System.out.println ("Blue:" + color);
	}

}
