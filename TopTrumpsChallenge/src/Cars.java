
public class Cars {
	String make;
	String model;
	float engineSize;
	int topSpeed;
	int horsePower;
	float acceleration;
	int price;
	
	
	public Cars(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		make = Make;
		model = Model;
		engineSize = EngineSize;
		topSpeed = TopSpeed;
		horsePower = HorsePower;
		acceleration = Acceleration;
		price = Price;
		
		
	}
	
	public String getModel() {
		return model;
	}
	
	public String getMake() {
		return make;
	}
	public int gethorsePower() {
		return horsePower;
	}
		
	
	public float getengineSize() {
		return engineSize;
	}
	
	public float getAcceleration() {
		return acceleration;
	}
	
	public int getTopSpeed() {
		return topSpeed;
	}
	
	public int getPrice() {
		return price;
	}

	
	// Horse Power Tests ----------------------------------------------------------------------------------------------
	void horsePower(Cars car1, Cars car2) {
		if (car1.gethorsePower() > car2.gethorsePower()) {
			System.out.println("The Car with most Horse Power is " + car1.getModel());
			car2.topSpeed -=5;
			System.out.println(car2.topSpeed);
			
		} else {
			System.out.println("The Car with most Horse Power is " + car2.getModel());
			car1.topSpeed -=5;
			System.out.println(car1.topSpeed);
		}
	}
	
		
//	Price Tests --------------------------------------------------------------------------------------------------
	
	void price(Cars car1, Cars car2) {
		if (car1.getPrice() > car2.getPrice()) {
			
			System.out.println("the most expensive car is " + car1.getModel());
		} else {
			System.out.println("the Most Expensive car is " + car2.getModel());
			
		}
		
	car1.getPrice();
	System.out.println(car2.price);
	}
	

	
	// TopSpeed Test --------------------------------------------------------------------------------------------------------------
//	void topSpeed(Cars car1, Cars car2) {
//		if (car1.getTopSpeed() > car2.getTopSpeed()) {
//			car2.topSpeed -=10;
//			System.out.println("the car with highest top speed is " + car1.getModel());
//		} else {
//			car1.topSpeed -=10;
//			System.out.println("the car with highest top speed is " + car2.getModel());
//		}
//		
//		car1.getTopSpeed();
//		car2.getTopSpeed();
//		System.out.println(car1.getTopSpeed());
//	}
	
	
	void topSpeed(Cars car2) {
		if (this.getTopSpeed() > car2.getTopSpeed()) {
			car2.topSpeed -=10;
			System.out.println("the car with highest top speed is " + this.getModel());
		} else {
			this.topSpeed -=10;
			System.out.println("the car with highest top speed is " + car2.getModel());
		}
		
		this.getTopSpeed();
		car2.getTopSpeed();
		System.out.println(this.getTopSpeed());
	}
	
	// acceleration Test --------------------------------------------------------------------------------------------------------------
	void accelaration(Cars car1, Cars car2) {
		if (car1.getAcceleration() > car2.getAcceleration()) {
			System.out.println("the car with highest Acceleration from 0-60 is " + car1.getModel());
		} else {
			System.out.println("the car with highest Acceleration from 0-60 is " + car2.getModel());
		}
	}
	
	// engine size Test --------------------------------------------------------------------------------------------------------------
	void engineSize(Cars car1, Cars car2) {
		if (car1.getengineSize() > car2.getengineSize()) {
			System.out.println("the car with the biggest engine is " + car1.getModel());
		} else {
			System.out.println("the car with the biggest engine is " + car2.getModel());
		}
	}
}




class Audi extends Cars {

	public Audi(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Acceleration, Price);
		
		
		}
	
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	acceleration += 3;
	    }
	    
}


class BMW extends Cars {

	public BMW(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Acceleration, Price);
		
		
		}
	
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	acceleration += 3;
	    }
	    
}


class Mercedes extends Cars {

	public Mercedes(String Make, String Model, float EngineSize, int TopSpeed, int HorsePower, float Acceleration, int Price) {
		super(Make, Model, EngineSize, TopSpeed, HorsePower, Acceleration, Price);
		
		
		}
	
	    
	    void tuneEngine() {
	    	horsePower =+ 10;
	    	acceleration += 3;
	    }
	    
}


