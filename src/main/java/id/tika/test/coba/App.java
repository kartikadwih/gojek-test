package id.tika.test.coba;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
	static List<Car> parkingSlot = new ArrayList<Car>();
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // define parking space
        defineParkingSlot(10);
        
        // define input 
        // park for 6 cars
        Car car = new Car();
        car.setColor("White");
        car.setNumberPlate("KA-01-HH-1234");
        park(car);        
        
        car = new Car();
        car.setColor("White");
        car.setNumberPlate("KA-01-HH-9999");
        park(car); 
        
        car = new Car();
        car.setColor("Black");
        car.setNumberPlate("KA-01-BB-0001");
        park(car); 
        
        car = new Car();
        car.setColor("Red");
        car.setNumberPlate("KA-01-HH-7777");   
        park(car); 
        
        car = new Car();
        car.setColor("Blue");
        car.setNumberPlate("KA-01-HH-2701");   
        park(car); 
        
        car = new Car();
        car.setColor("Black");
        car.setNumberPlate("KA-01-HH-3141");   
        park(car);         
        
        
        //4th leave
        car = new Car();
        car.setColor("Red");
        car.setNumberPlate("KA-01-HH-7777");   
        car.setSlot(4);
        leave(car);
        
        
        
        //find car with color white
        System.out.println("get car by color");
        String color = "white";
        List<Car> cars = findCarByColor(color);
        if(null!= cars && cars.size()>0) {
        	System.out.println("car found");
        	for(Car c : cars) {
            	System.out.println("Slot No. "+c.getSlot()+" Reg Numb. "+c.getNumberPlate()+" color. "+c.getColor());
            }
        } else {
        	System.out.println("not found "+color);
        }
        

        //find car with Reg Numb KA-01-HH-3141
        System.out.println("get car by reg num");
        String regNum = "KA-01-HH-3141";
        cars = findCarByNumberPlate(regNum);
        if(null!= cars && cars.size()>0) {
        	System.out.println("car found");
        	for(Car c : cars) {
            	System.out.println("Slot No. "+c.getSlot()+" Reg Numb. "+c.getNumberPlate()+" color. "+c.getColor());
            }
        } else {
        	System.out.println("not found "+color);
        }
        
        
        
    }
    
    public static void defineParkingSlot (Integer totalSlot) {    	
    	for(int a=0; a<totalSlot; a++) {
    		Car park = new Car();
        	parkingSlot.add(park);
        }  	
    	System.out.println("Early Parking Slot "+parkingSlot.size());
    }
    
    public static void park (Car car) {    	
    	
    		String status ="FULL";
    		for(int x=0; x<parkingSlot.size(); x++) {
        		if(null == parkingSlot.get(x).getSlot()) {
        			car.setSlot((x+1));
        			parkingSlot.set(x, car);
        			status="PARKED";
        			System.out.println("Allocated slot number : "+(x+1));
        			break;
        		}
        	}
    		
    		if(status.equalsIgnoreCase("FULL")) {
    			System.out.println("sorry, parking lot is FULL");    			
    		}
    		
    		
    	
    	
    }
    
    public static void leave (Car car) {    	
    	for(int b=0; b<parkingSlot.size(); b++) {
    		if(car.getSlot().equals(parkingSlot.get(b).getSlot())) {
    			Car newCar = new Car();
    			parkingSlot.set(b, newCar);
    			System.out.println("leave slot "+(b+1));
    			break;
    		}
    	}
    	
    }
    
    
    
    public static List<Car> findCarByColor (String color) {    	
    	List<Car> getCar = new ArrayList<Car>();
    	for(Car car : parkingSlot) {
    		if(color.equalsIgnoreCase(car.getColor())) {
    			getCar.add(car);
    		}
    	}    		
    	return getCar;
    }
    
    public static List<Car> findCarByNumberPlate (String numberPlate) {    	
    	List<Car> getCar = new ArrayList<Car>();
    	for(Car car : parkingSlot) {
    		if(numberPlate.equalsIgnoreCase(car.getNumberPlate())) {
    			getCar.add(car);
    		}
    	}    		
    	return getCar;
    }
}
