package oopConcept;

public class Car {
    //color
    public String color;
    //make
    public String make;
    //model
    public String model;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //year
    public int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
    }

    public void increaseSpeed(){
        System.out.println("Increasing the speed");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String mak){
        make=mak;
    }
    public String getMake(){
        return this.make;
    }
}
