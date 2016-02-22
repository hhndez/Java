package com.test.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hhernandez on 22/09/15.
 */
public class MapTest {
    public static void main(String ...args) {
        Map<Object, Object> m = new HashMap<>();

        m.put("k1", new Dog("aiko"));
        m.put("k2", Pets.DOGS);
        m.put(Pets.CAT, "CAT key");
        Dog d1 = new Dog("clover");
        m.put(d1, "Dog key");
        m.put(new Cat(), "Cat key");

        String k2 = "k2";
        Pets p = Pets.CAT;
        System.out.println(m.get("k1"));
        System.out.println(m.get(k2));
        System.out.println(m.get(p));
        System.out.println(m.get(d1));
        System.out.println(m.get(new Cat()));
        System.out.println(m.size());

        System.out.println();
        d1.name = "magnolia";
        System.out.println(m.get(d1));
        d1.name = "clover";
        System.out.println(m.get(new Dog("clover")));
        d1.name = "arthur";
        System.out.println(m.get(new Dog("clover")));
    }
}

class Dog {
    public Dog(String n) {
        name = n;
    }
    public String name;
    @Override
    public boolean equals(Object o) {
        if ((o instanceof Dog) &&
                ((Dog) o).name == name) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.length();
    }
}

class Cat { }

enum Pets { DOGS, CAT, HORSE};
