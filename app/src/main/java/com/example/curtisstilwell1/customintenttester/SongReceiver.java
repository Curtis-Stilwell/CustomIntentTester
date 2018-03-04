package com.example.curtisstilwell1.customintenttester;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by curtisstilwell1 on 8/15/17.
 */

public class SongReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        intent.setClass(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
