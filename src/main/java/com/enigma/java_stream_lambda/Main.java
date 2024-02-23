package com.enigma.java_stream_lambda;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Ini anonymous Class
        SimpleAction action=new SimpleAction() {
            @Override
            public void action() {
                System.out.println("Hello");
            }
        };
        action.action();

        //lambda
        SimpleAction action1=()->{
            System.out.println("Helo");
        };
        action1.action();



        //lambda dengan 1 paramaeter

        //jika cuma satu parameter bisa tanpa kurung

        SimpleAction2 action2= (name1) ->{
            return "Hello "+name1;
        };
        String cahyo2=action2.action("cahyoqqq");
        System.out.println(cahyo2);

        //jika tanpa block {}, yang akan terjadi pada lamda langsung rtunr sesuai dengan tipe datanya
        SimpleAction2 action3=name -> "hello "+ name;
        String cahyo3=action3.action("ahmad");
        System.out.println(cahyo3);


        String s = tesParameterLambda((nama) -> "Helo" + nama);
        System.out.println(s);

        List<Product> products= List.of(
                new Product("1", "Baju Wibu",25000),
                new Product("1", "Celana Wibu",30000),
                new Product("1", "Gantungan Wibu", 5000)
        );
        List<Product> filteredProduct=products.stream()
                .filter(product -> product.getPrice() < 30000)
                .toList();
        filteredProduct.forEach(product -> {
            System.out.println(product.getName());
            System.out.println(product.getPrice());
            System.out.println("-".repeat(30));
        });


        //kalkulasi semua harga


    }
    private static String tesParameterLambda(SimpleAction2 simpleAction){
        return simpleAction.action("cahyo anyng");
    }
}
