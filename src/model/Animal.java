package model;

public abstract class Animal {
    private String name;
    private int age;
    private String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if (age>0){
            System.out.println(this.age);
        }else
            System.out.println("tuula elek");return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void sleeps(){
        System.out.println();
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name=: " + name + '\'' +
                "age: " + age +
                "color: " + color + '\'' ;
    }
}
