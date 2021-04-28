package com.lht.learn.design23.strategy;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.strategy
 * @date 2021/4/11 19:24
 */
public class Cat {
    int hight;

    int weight;

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hight=" + hight +
                ", weight=" + weight +
                '}';
    }

    public Cat(int hight, int weight) {
        this.hight = hight;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
