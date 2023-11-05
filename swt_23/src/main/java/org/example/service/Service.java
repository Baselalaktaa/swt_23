package org.example.service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Service {

    public final List<Integer> integers;

    public Service(List<Integer> integers) {
        this.integers = integers;
    }


    public List<Integer> removeDuplicates(){
        return integers.stream()
                .filter(n -> n != n)
                .collect(Collectors.toList());
    }

    public List<Integer> getIntegers() {
        return integers;
    }
}
