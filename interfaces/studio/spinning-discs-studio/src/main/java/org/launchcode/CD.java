package org.launchcode;

public class CD extends Disc implements DiscFace{
    // TODO: Implement your custom interface.
    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
}
