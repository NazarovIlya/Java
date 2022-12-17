package FamilyTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Human {
    private String name;
    private int age;
    private String sex;
    private Human father;
    private List<Human> children;

    public Human(String name, int age, String sex, Human father) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.father = father;
        this.children = new ArrayList<>();
        father.getChildren().add(this);
    }

    public Human(String name, Human father) {
        this.name = name;
        this.age = 0;
        this.sex = getRandomSex();
        this.father = father;
        this.children = new ArrayList<>();
        father.getChildren().add(this);
    }

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Human> getChildren() {
        return this.children = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("name: %s, age: %s, sex: %s\nFather: %s\nChildren: %s",
                this.name, this.age, this.sex, this.father, this.children.toString());
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