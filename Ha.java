package grafika;

public class Ha {

public static void haa(double x, double y, double d) {
	if(d>0.01) {
		StdDraw.line (x-d, y, x+d, y);

	StdDraw.line (x-d,y-d, x-d, y+d);
	
	StdDraw.line (x+d,y-d, x+d, y+d);

		haa(x-d, y+d, d/2);
		haa(x+d, y+d, d/2);
		haa(x-d, y-d, d/2);
		haa(x+d, y-d, d/2);
	}
	
	
}



	public static void main(String[] args) {
		StdDraw.setScale(-1.1, 1.1);
		haa(0,0,0.35);
      
	}

}
