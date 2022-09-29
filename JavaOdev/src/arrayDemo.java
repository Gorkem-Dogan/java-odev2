import java.util.Iterator;

public class arrayDemo {

	public static void main(String[] args) {
		String [] ogrenciler = new String[5];

		ogrenciler[0]="Görkem";
		ogrenciler[1]="Beyza";
		ogrenciler[2]="Göksel";
		ogrenciler[3]="Derin";
		ogrenciler[4]="Engin";
		for(int i=0;i<ogrenciler.length;i++)
		
		{System.out.println("-------------------------------------");
			System.out.println(ogrenciler[i]);
		}
		for(String ogrenci:ogrenciler) 
		{
			{System.out.println("-------------------------------------");
			System.out.println(ogrenci);
		}
	}

}
}