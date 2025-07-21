package com.yourname.booktracker;

public class Practice implements Tast{

    private int count;
    private String name;

    public Practice(int count, String name){
        this.count = count;
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void set(int count) {
        this.count = count;
    }

    @Override
    public void it() {
        int newAge = Tast.age;
        System.out.println("Я ем");
    }
}
