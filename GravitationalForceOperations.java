
/**
 * 
 * @author Aribah Baig
 * 7/20/2019
 */

import java.lang.Math;

public class GravitationalForceOperations
{
  public static void main(String[] args)
  {
    double planetA = calculatePlanetMass(520, 700);
    double planetB = calculatePlanetMass(250, 360);
    double radius = 500;
    double forceBetweenPlanets = calculateForce(planetA, planetB, radius);

    System.out.println("The mass of Planet A is: " + planetA + " kg");
    System.out.println("The mass of Planet B is: " + planetB + " kg");
    System.out.println("The distance between the center of the two planets is: " + radius + " m");
    System.out.println("The force of gravity between the two planets is:" + forceBetweenPlanets + " N");
    
    
  }

  
  // This method uses the inputed density and volume parameters to calculate and return the mass
  public static double calculatePlanetMass(double density, double volume)
  {
    double mass = density * volume;
    return mass;
  }

  
  // This method calculates and returns the magnitude of the gravitational force between two planets
  // The radius is equal to the distance between the center of the two planets
  public static double calculateForce(double planet1, double planet2,
    double radius)
  {
    double gravityConstant = 6.67 * Math.pow(10, -11);
    double forceOfGravity =
      (gravityConstant * planet1 * planet2) / Math.pow(radius, 2);
    return forceOfGravity;
  }

}
