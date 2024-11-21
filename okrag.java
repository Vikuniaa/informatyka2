package grafika;



public class okrag {

	public static void circle(double x, double y, double r) {

		StdDraw.setPenColor((int)(255 * Math.random()), (int)(255 * Math.random()), (int)(255 * Math.random())); 
		
		StdDraw.filledCircle(x, y, r);
		
		if(r>0.1) {
		circle(x - r/2, y, r/2);
	 circle(x + r/2, y, r/2);
	        
	       circle(x , y+r/2, r/2);
	        
	      circle(x , y-r/2, r/2);

		}
	
	}

	public static void main(String[] args) {
	
		StdDraw.setScale(-1.0 , 1.0);

   
		circle(0,0,1);

	}

}
