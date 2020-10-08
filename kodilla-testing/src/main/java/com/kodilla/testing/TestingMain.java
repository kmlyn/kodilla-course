package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator cl = new Calculator();
        int sum = cl.add(2, 5);
        if (sum == 7) {
            System.out.println("add(): test ok");
        } else {
            System.out.println("add(): test failed");
        }

        int difference = cl.subtract(2, 5);
        if (difference == -3) {
            System.out.println("subtract(): test ok");
        } else {
            System.out.println("subtract(): test failed");
        }
    }
}