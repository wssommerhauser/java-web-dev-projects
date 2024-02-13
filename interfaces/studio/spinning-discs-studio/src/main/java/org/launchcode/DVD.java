package org.launchcode;

public class DVD extends Disc implements DiscFace{
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }
    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
