import java.util.Scanner;

public class Lat4Prak3{
	public static void main(String[] args)
	{
		int i,n,nilai;
		int min = 0;
		int maks = 0;
		
		Scanner inputan = new Scanner(System.in);

		System.out.print("Masukkan banyaknya data = ");
		n = inputan.nextInt();
		
		System.out.println("");
		for (i = 1; i <=n; i++)
		{
			System.out.print("Masukkan nilai ke " + i + " = ");
			nilai = inputan.nextInt();
			
			//menghitung nilai max dan nilai min
			if (i == 1 || nilai < min)
			{
				min = nilai;	
			}
			if (i == 1 || nilai > maks)
			{
				maks = nilai;
			}
		}
        
        System.out.println("");
        System.out.println("Nilai Min = "+min);
        System.out.println("Nilai Max = "+maks);
         
	}
}