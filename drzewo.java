package grafika;

public class drzewo {
   


public static void linia(double x, double y, double k, double r) {


    double d =r;

      double dx = d * Math.sin(2 * Math.PI * k / 360);
	
      double dy = d * Math.cos(2 * Math.PI * k / 360);
 
           

    StdDraw.line(x, y, x + dx, y + dy);


		if(d>0.1) {
			

    linia(x + dx, y + dy, k + 10, 0.8 * d);

    linia(x + dx, y + dy, k - 10, 0.8 * d);


		}

	 }
	public static void main(String[] args) {
	StdDraw.setXscale(-2.5, 2.5);
	StdDraw.setYscale(-0.5, 5);
	
	StdDraw.setPenScale(0.001);
	
	linia(0, 0 , 0,1);
	

	}

}
