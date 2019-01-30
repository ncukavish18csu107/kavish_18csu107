class pointdemo
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextdouble(); 
		double x2 = scan.nextdouble();
		double y1 = scan.nextdouble();
		double y2 = scan.nextdouble();
		pount p1(x1,y1);
		point p2(x2,y2);

		double distance = p1.calculatedistance(p1,p2);

		System.out.println("distance = " + distance);	

	}
}