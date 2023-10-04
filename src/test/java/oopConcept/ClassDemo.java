package oopConcept;

public class ClassDemo {
    public static void main(String[] args) {
        Car bmw=new Car(); //create and initialize the object
        bmw.setModel("3,20");
        System.out.println(bmw.getModel());

        Car benz=new Car();
        benz.setYear(2023);
        System.out.println(benz.getYear());
        benz.setMake("mercedes");
        System.out.println(benz.getMake());
        benz.setColor("fusya");
        System.out.println(benz.getColor());
    }
}
