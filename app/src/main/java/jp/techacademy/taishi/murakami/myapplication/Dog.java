package jp.techacademy.taishi.murakami.myapplication;

/**
 * Created by abovi on 2018/02/23.
 */

import android.util.Log;

class Dog extends Animal {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void say() {
        Log.d("javatest", this.name + "(" + this.age + "歳)" + "「ワンワン」");
    }
}

