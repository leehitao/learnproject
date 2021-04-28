package com.lht.learn.design23.strategy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.strategy
 * @date 2021/4/11 19:50
 */
public class Client {

    public static void main(String[] args) {

        Shorter shorter = new Shorter();

        Cat[] arr = new Cat[]{new Cat(5,5),new Cat(3,3),new Cat(7,7)};

        shorter.sort(arr,new CatHightCamprator());

        System.out.println(Arrays.toString(arr));

    }
}
