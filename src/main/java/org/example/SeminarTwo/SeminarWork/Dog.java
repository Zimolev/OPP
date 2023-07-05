package org.example.SeminarTwo.SeminarWork;

public class Dog extends Animal {

    private String name;
    private Integer age;

    public Dog() {
    }

    public Dog(String name, String name1, Integer age) {
        super(name);
        this.name = name1;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public void animalInfo() {

    }

    @Override
    public void voice() {
        System.out.println(" гав ! гав!");
    }

    @Override
    public void jump() {
        super.jump();
    }

}
