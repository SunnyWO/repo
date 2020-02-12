package windChill;
import java.util.Scanner;
import java.lang.Math;
public class WindChill {
	
	public static void main(String[] args) {
		//declare scanner and variables
		Scanner stdin = new Scanner(System.in);
		double fahrenheitTemp, windSpeed, windChill;
		
		//Display program header
		System.out.println("Wind Chill Calculator");
		System.out.println("_____________________");
		System.out.println("");
		
		//prompt for and assign fahrenheitTemp to input
		System.out.println("Enter a temperature between -45 and 40 degrees fahrenheit inclusive: ");
		fahrenheitTemp = stdin.nextDouble();
		
		//prompt for and assign windSpeed to input
		System.out.println("Enter a wind speed in MPH between 5 and 60 degrees inclusive: ");
		windSpeed = stdin.nextDouble();
		
		//calculate and display windChill
		windChill = 35.74 + 0.6215*(fahrenheitTemp) -35.75*(Math.pow(windSpeed,0.16)) + 0.4275*fahrenheitTemp*(Math.pow(windSpeed,0.16));
		System.out.println("wind chill temperature: "+windChill+" degrees Fahrenheit");
		
		//display programmer name
		System.out.println("Programmer: Sunny Onuska");
		
		

	}

}
