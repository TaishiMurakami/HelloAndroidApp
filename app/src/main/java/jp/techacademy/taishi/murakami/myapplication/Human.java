package jp.techacademy.taishi.murakami.myapplication;

/**
 * Created by abovi on 2018/02/26.
 */

import android.util.Log;

class Human extends Animal implements Thinkable {

 String hobby;

  public Human(String name, String hobby, int age) {
        this.name = name;
        this.hobby = hobby;
        this.age = age;

    }

    public void say() {
        Log.d("javatest", "私の名前は" + this.name + "です。年は" + this.age + "歳です。");
    }

    public void think() {
        Log.d("javatest", "私は" + this.hobby + "について考える");
    }
}
