package com.lht.learn.design23.strategy.campratortest;

/**
 * @author Lee
 * @version 1.0
 * @project learntest
 * @package com.lht.learn.design23.strategy
 * @date 2021/4/11 19:30
 */
public class CatHightCamprator implements Camprator<Cat> {
    @Override
    public int compareTo(Cat c1, Cat c2) {
        if (c1.getHight()>c2.hight) {
            return 1;
        }else if(c1.getHight()<c2.hight){
            return -1;
        }else{
            return 0;
        }
    }
}
