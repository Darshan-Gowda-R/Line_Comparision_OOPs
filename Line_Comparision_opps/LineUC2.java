public class LineUC2{

	public static void main(String args[]){
	int x1=2,x2=4,y1=3,y2=6;
	int X1=2,X2=4,Y1=3,Y2=6;
	double length1=Math.sqrt((x2-x1)^2+(y2-y1)^2);
	double length2=Math.sqrt((X2-X1)^2+(Y2-Y1)^2);
		if((Math.round(length1 *100.0)/100.0) == (Math.round(length2*100.0)/100.0)){

			System.out.println("The length is equal");

		}
		else
			System.out.println("The length is not equal ");

	}

}
