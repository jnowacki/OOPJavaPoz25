package pl.jnowacki;

import pl.jnowacki.animal.Dog;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("German shepard", "M");
        Dog dog2 = new Dog("Husky", "F");


        Dog[] myPack = {dog1, dog2};

        for (Dog dog : myPack) {
            System.out.println(dog);
        }
    }
}
