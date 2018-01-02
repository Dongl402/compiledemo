package com.flowerplus.libdemo;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by flowerplus-sdl on 2018/1/2.
 */

public class Util {
    private static Context mContext;

    public static void initHere(Context context) {
        mContext = context;
    }

    public static void HAHAHA() {
        if (mContext == null) return;

        Toast.makeText(mContext, "HAHAHA", Toast.LENGTH_SHORT).show();
    }
}
