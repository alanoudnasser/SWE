package com.example.myapplication_add;

public class CustomerModel {
    private int id;
    private String name;
    private  int age;

    public CustomerModel(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public CustomerModel() {
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +

                '}';
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
