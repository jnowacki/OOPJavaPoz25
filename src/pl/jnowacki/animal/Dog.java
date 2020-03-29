package pl.jnowacki.animal;

public class Dog extends Animal {

    private String breed;
    private String sex;

    private int id;

    public Dog(String breed, String sex) {
        this.breed = breed;
        this.sex = sex;

        id = nextId++;
    }

    public void makeSound() {
        System.out.println("Hau!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return String.format("%s %s %d", breed, sex, age);
    }
}
