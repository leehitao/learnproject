package com.lht.learn.design23.strategy;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.strategy
 * @date 2021/4/11 19:34
 */
public class Shorter<T> {

    public void sort(T[] arr,Camprator<T> camprator ){

        for (int i = 0; i < arr.length-1; i++) {
            for (int i1 = i+1; i1 < arr.length; i1++) {
                int x = camprator.compareTo(arr[i], arr[i1]);
                if (x ==-1) {
                    swap(arr,i,i1);
                }
            }
        }
    }

    private void swap(T[] arr, int i, int i1) {
        T temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;

    }


}
