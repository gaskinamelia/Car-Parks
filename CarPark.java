
/**
 * The Class CarParks is used to create individual carparks with a location
 * and capacity,which the user inputs. On creating an instance of the class 
 * it will set the occupancy to 0. In order to increase or decrease this value
 * the user will need to either park their car or leave the carpark. 
 * The user cannot enter the carpark if the car park is full and
 * cannot enter the carpark if it is closed, meaning the capacity of 
 * the carpark is 0 and there are no cars within the carpark. The user is 
 * able to change the capacity value but it cannot be less than the amount 
 * of cars that are in the car park at that time. Also the user is unable to 
 * change the value to less than 0, as it will automatically change that
 * value to 0.
 *
 * @author (Amelia Gaskin)
 * @version (1)
 */
public class CarPark
{
	public static void main(String[] args) {
		CarPark c = new CarPark("Canterbury", 20);
		c.printDetails();
	}
    // The capacity of that carpark.
    private int capacity;
    //The amount of cars that are currently in that carpark.
    private int occupancy;
    //The location of that carpark.
    private String location;
    
    /**
     * Create a carpark that shows how many spaces are in that 
     * carpark and where is it located.
     */
    public CarPark(String area, int spaces)
    {
        location = area;
        capacity = spaces;
        occupancy = 0;      
    }
   
    /**
     * Returns the amount of spaces that are occupied in the 
     * carpark.
     */
    public int getOccupancy()
    {
        return occupancy;
    }
    
    /**
     * Returns the amount of spaces that the carpark has.
     */
    public int getCapacity()
    {
        return capacity;
    }
    
    /**
     * Returns the location of that carpark.
     */
    public String getLocation()
    {
        return location;
    }
    
    /**
     * If user wants to park in the carpark it checks to see if 
     * there is space, if so the occupancy will increase by 1. 
     * However if not the user will receive a message to say
     * that the carpark is full.
     */
    public void park()
    {
        if (occupancy < capacity) {
            occupancy +=1;
        }
        else{
            System.out.println("The carpark is full");
        }
    }
    
    /**
     * If user would like to leave the carpark it will decrease
     * the occupancy by 1. If that car was the last one in 
     * the car park a message will show that the carpark 
     * is empty.
     */
    public void leave()
    {
        if (occupancy > 0){
            occupancy -=1;
        }
        else {
            System.out.println("The carpark is empty");
        }
    }
    
    /**
     * If user would like to change the value of capacity the
     * class will check to see if the new capacity is greater 
     * than the occupancy, if its less than, then print an
     * error message to say that the new value is less than the 
     * amount that is in the carpark currently. If the new 
     * capacity is less than or equal to 0 and 
     * the occupancy also equals 0 then the new capacity is set
     * to 0 and a message will show that the carpark is closed.
     * If the new value is  more than 0 and less than occupancy 
     * then the carpark will keep the new capacity value.
     */
    public void changeCapacity(int newCapacity)
    {
        if ((newCapacity + capacity)< occupancy){
            System.out.println("Error: The new capacity is less than the amount of cars that are currently in the carpark.");
            if ((newCapacity + capacity) <= 0 && occupancy == 0){
            capacity = 0;
            System.out.println("The carpark is closed.");
            }
        }
        else{
            capacity += newCapacity;
        }
    }
    
    /**
     * print details of the carpark with location first and 
     * how many spaces are left to be occupied. 
     */
    public void printDetails()
    {
         System.out.println(location + " car park has " + (capacity - occupancy) + " spaces.");
    }
}
