package com.main;

public class SQLInjectionExample {
    public static void main(String[] args) {
        String username = getUserInput();
        String query = "SELECT * FROM users WHERE username = '"+username+"'";
        System.out.println(query);
    }

    private static String getUserInput (){
        return "admin' --";
    }
}
