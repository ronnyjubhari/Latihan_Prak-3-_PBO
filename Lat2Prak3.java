import java.util.Scanner;

public class Lat2Prak3{
	public static void main(String[] args)
	{
		Scanner inputan = new Scanner(System.in);
		
		int nilai;
		
		System.out.print("Masukkan nilai = ");
		nilai = inputan.nextInt();
		
		//posisi if berjalan
		if (nilai == 1)
		{
			System.out.println("Angka yang dimasukkan adalah satu");
		}
		else
		{
			System.out.println("Angka yang dimasukkan bukan satu");
		}
	}
}