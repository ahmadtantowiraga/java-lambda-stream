package com.enigma.java_stream_lambda;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExampleLambda {
    public static void main(String[] args) {
        Function<String , String> hello= new Function<String, String>() {
            @Override
            public String apply(String s) {
                return "Hello "+s;
            }
        };
        String cahyo=hello.apply("Cahyo");

        //Function
        Function<String, String> helloLambda=(name)->{       //parameter dan retunr
            return "Hello " +name;
        };
        String cah=helloLambda.apply("aku");
        System.out.println(cah);

        //Consumer

        Consumer<Integer> printNumber=(number)->{ // parameter dan void
            System.out.println(number);
        };
        printNumber.accept(21);

        //Predicate
        Predicate<String> validate=(name)-> {    //parameter dan retunr boolean
            return !name.equals("cahyo");
        };

        //sumplier
        Supplier<Long> Lambda=()->15L; //return value
        System.out.println(Lambda.get());

        //KALO GADA {} AUTO di return

        inputUtils(input->(!input.isBlank() && input.length() >5));

    }
    private static String inputUtils(Predicate<String> validate){
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("Tulisakan sesuatu : ");
            String input=scanner.nextLine();
            if (!validate.test(input)){
                continue;
            }
            return input;
        }
    }
}
