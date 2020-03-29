package pl.jnowacki.animal;

public class Dog {

    private String breed;
    private String sex;
    private int age;

    private int id;

    public Dog(String breed, String sex) {
        this.breed = breed;
        this.sex = sex;

        age = 0;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String toString(){
        return String.format("%s %s %d", breed, sex, age);
    }
}
