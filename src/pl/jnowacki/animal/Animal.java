package pl.jnowacki.animal;

public class Animal {
    protected static int nextId = 1;

    protected int age;

    private int id;

    public Animal(int age) {
        id = nextId++;
        this.age = age;
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
}
