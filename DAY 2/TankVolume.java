/* 1.	Mr. Vimal is working as plumber repairing tank of spherical nature, 
in an apartment he came across a tank that had a small slit through which 
water leaks as a result the tank is half empty. After fixing the issue he wants
to access the maximum capacity of the tank guide him to write a code with a radius of 21cm for the tank as such */
public class TankVolume {
    public static void main(String[] args) {
        double radius = 21.0; // in cm
        double pi = Math.PI;

        // Volume formula: (4/3) * π * r^3
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);

        System.out.printf("Maximum capacity of the tank is %.2f cubic centimeters (cc)", volume);
    }
}
