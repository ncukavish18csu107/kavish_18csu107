class Circle
{
	private double radius ; 
	private string colour ; 
	public Circle()
	{
		this.radius = 1.0 ;
		this.colour = "red" ;
	}

	public Circle(double r , String c)
	{
		this.radius = r;
		this.colour = c;
	}

	public Circle(double r)
	{
		this.radius = r;
		this.colour = "red";
	}

	public double getRadius()
	{
		return radius ; 
	}

	public double setRadius(double r)
	{
	   this.radius = r;
	}

    public double getColour()
    {
    	return colour ;
    }

    public double setcolour(double c)
    {
    	this.colour = c;
    }

    public double getArea()
    {
    	return 3.14*r*r;
    }

}