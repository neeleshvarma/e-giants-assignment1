
public class Car {
	
	String name;
	double price;
	double speed;
	 public Car()
	 {
		 
	 }
	public Car(String name, double price, double speed) {
		super();
		this.name = name;
		this.price = price;
		this.speed = speed;
	}
	 
	public void speedCar(double speed)
	{
		if(speed>55)
		{
			System.out.println("car speed is not safe");
		}
		else
		{
			System.out.println(" car speed is safe");
		}
		
	}
	public void speedCar(double price, double speed)
	{
		if(price>500 && speed>60)
		{
			System.out.println("car is very fast as it is costly");
		}
		else
		{
			System.out.println("car is slow and safe");
		}
	}

}
