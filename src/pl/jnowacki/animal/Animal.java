package pl.jnowacki.animal;

public class Animal {
    protected static int nextId = 1;

    protected int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
