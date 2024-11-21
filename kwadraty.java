package grafika;

public class kwadraty {
    public static void square(double x , double y, double d) {
    	StdDraw.setPenColor(StdDraw.RED);
    	
    	StdDraw.square(x, y, d);
    	
    	StdDraw.setPenColor((int)(255 * Math.random()), 
    			
                (int)(255 * Math.random()), 
                
                (int)(255 * Math.random()));
    	
    	StdDraw.filledSquare(x, y, d);
    	
    	if(d>0.2) {square(x-d, y-d, d/2);
    	
    
    	
    	square(x+d, y+d, d/2);
    	 	
    	square(x-d, y+d, d/2);
    
    	square(x+d, y-d, d/2);
    	
    	
    	}

    }
	public static void main(String[] args) {
		StdDraw.setScale(-1.1,1.1);
		StdDraw.setPenRadius(0.025);
	
		square(0, 0, 0.5);
	


	}

}
