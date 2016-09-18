/*Assignment – Defining an interface and its implementation in two
different classes in different ways.
*/

// defining the interface
interface Interface{
	int getNumber();
}

//class 1
// defining the child class to print the number object
class PrintNum implements Interface{
	public int number;
	public PrintNum(int num) {
            this.number=num;
                                
	}
	public int getNumber() {
               return number;
		
		
	}
}

//class 2
// defining the class to square the number implementing the interface
class SquaringNum implements Interface{
	int number;
	public SquaringNum(int num) {
		this.number=num;
		}
	
	public int getNumber() {
		 return number*number;
		
	}
}
public class Session_6_Assignment_1 {
    public static void main(String[] args) {
        int number=1;
        
		Interface obj1 = new PrintNum(number);
                 // prints the number
                System.out.println("The number is "+obj1.getNumber());
               
		
		Interface obj2= new SquaringNum(number);
                 // prints the square of a number					
                System.out.println("The square of the number is "+obj2.getNumber());// prints the square of the number
		
	}

}

	


