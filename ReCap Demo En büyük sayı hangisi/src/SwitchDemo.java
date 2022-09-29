
public class SwitchDemo {

	public static void main(String[] args) {
	   char grade ='F';
	   switch (grade) {
	case 'A':
		System.out.println("Mükemmel, Geçtiniz");
		
		break;
	case 'B':
		System.out.println("Çok güzel, Geçtiniz");
		
		break;
	case 'C':
		System.out.println("İyi, Geçtiniz");
		
		break;
	case 'D':
		System.out.println("Daha fazla çalışmayı deneyiniz, Geçtiniz");
		
		break;
	case 'F':
		System.out.println("Üzgünüz , Kaldınız");
		
		break;
		

	default: System.out.println("anlamlandırılabilir bir değer girmediniz");
		break;
	}

	}

}
