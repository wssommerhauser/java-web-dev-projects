package org.launchcode;

public abstract class Disc {
    private String title;
    private double capacity;
    private String contents;
    private String discType;

    public String getName() {
        return title;
    }

    public void setName(String name) {
        this.title = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }


}
