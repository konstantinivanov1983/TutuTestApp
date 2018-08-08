package com.example.ivanovky.tututestapp.presentation.common.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class KeepAliveService extends Service {

    private static final Binder binder = new Binder();

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return binder;
    }
}
