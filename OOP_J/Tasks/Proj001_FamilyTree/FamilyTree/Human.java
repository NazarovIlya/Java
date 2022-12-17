package FamilyTree;

import java.util.Random;

public class Human {
    private String name;
    private int age;
    private String sex;
    // private Random random;

    public Human(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public Human(String name) {
        this.name = name;
        this.age = 0;
        this.sex = getRandomSex();
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("name: %s\nage: %s\nsex: %s\n",
                this.name, this.age, this.sex);
    }

    private String getRandomSex() {
        Random random = new Random();
        int rnd = random.nextInt(0, 2);
        if (rnd == 0)
            return "female";
        else
            return "male";
    }
}