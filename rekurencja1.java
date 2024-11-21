package grafika;

public class rekurencja1 {
	static int n = 0; 
	
	public static void main(String[] args) {
	  imie();
     
	}
	
 public static void imie (){
		 n++;
		 if(n>4) return;
		 System.out.println("JaVi");
		 imie();

 }
}
