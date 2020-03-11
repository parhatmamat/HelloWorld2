package com.uyghuria;

// TODO: 2020-03-09  

import com.google.gson.Gson;

/**
 * This is my main class!
 */
public class HelloWorld {
    private static final String MY_CONSTANT = "My Constant";

    public static void main(String[] args) {
        System.out.println("Testinging...3");

        Person person = new Person("David", "Nelson", 2);

        Gson gson = new Gson();
        String personJson = gson.toJson(person);
        System.out.println(personJson);

/*        String colorsJson = gson.toJson(Colors);
        System.out.println(colorsJson);*/

/*        String[] colors = new String[]{"Red", "Blue", "Green"};

        for (String color : colors) {
            System.out.println("Hi Mr. " + person.toString());
            System.out.println(color);
        }
        */

    }

}
