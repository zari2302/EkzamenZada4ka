package model;

public class Cow extends Animal implements Runnable{
    private String breed;

    public Cow() {
    }

    public Cow(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
    public void voice(){
        System.out.println("muu-muu-muu :)");
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void sleeps() {
        System.out.println("tundo uktait");;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void run() {
        System.out.println("kattu churkait");
    }


    @Override
    public String toString() {
        return "Cow{" +
                "breed='" + breed + super.toString();
    }
}
