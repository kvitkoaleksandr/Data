package com.yourname.booktracker;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[2];
        int s = 1;
        for (int i : a) {
            ++s;
            i = 1 + s;
            System.out.println(i);
        }
    }
}