import java.util.Scanner;
/**
 * Calculates the volume of a sphere using a user submitted diameter
 * @author sonuska
 */
public class SphereVolume {

	public static void main(String[] args) {
		//define the scanner obj and declare/initialize variables and constants 
		Scanner in = new Scanner(System.in);
		double diam, volume, radius;
		
		//prompt for and assign diameter
		System.out.println("Enter the diameter of the sphere: ");
		diam = in.nextDouble();
		
		//calculate radius and volume
		radius = diam/2.0;
		volume = (4.0/3.0)*(Math.PI)*(Math.pow(radius,3));
		
		//output the volume
		System.out.println("A sphere with a diameter of "+diam+" has a volume of "+volume);
		in.close();//close scanner
		
	}

}


