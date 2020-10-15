import java.util.Scanner;

public class Lat3Prak3{
	public static void main(String[] args)
	{
		Scanner inputan = new Scanner(System.in);
		int nilai;
		
		System.out.print("Masukkan nilai = ");
		nilai = inputan.nextInt();
		
		//posisi if berjalan 
		if (nilai % 2 == 0)
		{
			System.out.println("Angka yang dimasukkan adalah genap");
		}
		else
		{
			System.out.println("Angka yang dimasukkan adalah ganjil");
		}
	}
}