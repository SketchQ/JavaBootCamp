package com;

import java.util.stream.Stream;

public class MainStreamThread {
    public static void main(String[] args) {
        Stream.iterate(10, i -> i + 1)
            .parallel()
            .filter(i -> i > 1000)
            .limit(1000)
            .forEach(System.out::println);
    }
    
}
