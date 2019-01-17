class Box
{
  double width ;
  double height ; 
  double depth ;

  Box(double w , double h , double d)
  {
  	width = w;
  	height = h;
  	depth = d;
  }

  void setDim()
  {
  	width = 10;
  	height = 20;
  	depth = 10;
  }
  
  double volume()
  {
  	double volume = width * height * depth ;
  return volume;
  }
}

class BoxDemo
{
	public static void main(String[]args)
	{
		Box var = new Box() ; 
		var.netDim();
		double vol = var.volume();
		System.out.println("volume is " +vol);
	}
}

