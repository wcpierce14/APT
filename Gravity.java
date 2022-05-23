/*
Elphaba has decided to try to defy gravity. She's going to drop or throw an object from the top of an infinitely tall 
building and see how far it falls. She knows exactly what speed she throws the object and has a stop watch she uses to 
time how long it falls. Write method falling that returns the number of meters the object has fallen after time seconds 
have elapsed when the object is thrown with an initial velocity of velo meters/sec.
*/

public class Gravity {
    public double falling(double time, double velo){
      return (velo * time) + (0.5 * 9.8 * time * time);
    }
}