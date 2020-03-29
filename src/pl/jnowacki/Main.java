package pl.jnowacki;

import pl.jnowacki.animal.Dog;
import pl.jnowacki.building.Room;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("German shepard", "M");
        Dog dog2 = new Dog("Husky", "F");
        Dog dog3 = new Dog("Spaniel", "M");


        Dog[] myPack = {dog1, dog2, dog3};

        for (Dog dog : myPack) {
            System.out.println(dog);
            System.out.println(dog.getId());
        }

//        Room.MyNestedStaticClass myNested = new Room.MyNestedStaticClass();
//        Room.MyNestedStaticClass myNested2 = new Room.MyNestedStaticClass();
//        myNested.name = "name1";
//        myNested2.name = "name2";
//
//        System.out.println(myNested.name);
//        System.out.println(myNested2.name);
//
//        Room room1 = new Room(2, 2, 2);
//        Room room2 = new Room(3, 3);
//
//
//        Room[] rooms = {room1, room2};
//
//        for (Room room: rooms) {
//            room.displayProperties();
//        }
    }
}
