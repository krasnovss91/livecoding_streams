package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {//убрать дубликаты и вернуть отсортированным в обратном порядке
	// write your code here
        List<Integer> list = Arrays.asList(6, 1, 3, 2, 6, 1, 3, 8, 9, 1, 4, 5, 7, 9);
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(result);
        Collections.reverse(result);
        System.out.println(result);
    }
}
