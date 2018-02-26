package jp.techacademy.taishi.murakami.myapplication;

/**
 * Created by abovi on 2018/02/26.
 */

import android.util.Log;

class BigDog extends Dog {
    static String to_jp = "大型犬";

    public BigDog(String name, int age) {
        super(name, age);
    }

    // クラス関数
    public static void introduce() {
        Log.d("javatest", "これは大型犬クラスです。");
    }
}
