import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner input = new Scanner(System.in);
        //gathering starting latitude
        System.out.println("Enter the latitude of the starting location: ");
        double starLat = input.nextDouble();
        //gathering starting longitude
        System.out.println("Enter the longitude of the starting location: ");
        double starLong = input.nextDouble();
        //gathering ending latitude
        System.out.println("Enter the latitude of the ending location: ");
        double endLat = input.nextDouble();
        //gathering ending longitude
        System.out.println("Enter the longitude of the ending location: ");
        double endLong = input.nextDouble();
        //
        GeoLocation starLocation = new GeoLocation(starLat, starLong);
        GeoLocation finLocation = new GeoLocation(endLat, endLong);
        System.out.println("The distance is " + starLocation.distanceFrom(finLocation) + "miles.");
    }
}