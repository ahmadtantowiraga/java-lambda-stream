package com.enigma.java_stream_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {
    public static void main(String[] args) {
        //versi Stream
        Stream<Integer> numbers= Arrays.stream(new Integer[]{1,2,3,4,5});
        Integer[] in={1,2,3,4,5};
        Stream<Integer> num=Arrays.stream(in);

        Stream<Integer> filteredNumber=numbers.filter(number -> number>3);

        System.out.println(filteredNumber.toList());

        //versi normal
        int[] numberNormal=new int[] {1,2,3,4,5};
        List<Integer> numberNormalFiltered=new ArrayList<>();
        for (int number : numberNormal){
            if (number > 3){
                numberNormalFiltered.add(number);
            }
        }
        System.out.println(numberNormalFiltered);

        //versi java 8 ketas
        List<String> name=Stream.of("cahyo","adil","theo")
                .map(nama1 -> nama1 +" #Gosling 1")
                .filter(nama -> nama.contains("cahyo"))
                .toList();
        List<String> namesFromList=List.of("Teo","adil","shidiq");

        List<String> nameGosling=namesFromList.stream().map(namx->namx + " Gosling 1")
                .filter(name1 -> name1.contains("Teo"))
                .toList();
    }
}
