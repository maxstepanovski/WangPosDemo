package com.example.mamba.wangposextended;

import android.content.Context;
import android.os.RemoteException;

import wangpos.sdk4.libbasebinder.Core;

/**
 * Created by mamba on 06.09.2017.
 */

public class Controller implements EasyInterface {
    private Core core;

    public Controller(final Context context) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                core = new Core(context.getApplicationContext());
            }
        }).start();
    }

    @Override
    public void osBeep(int toneType, int durationMs) throws RemoteException {
        core.buzzerEx(durationMs);
    }

    @Override
    public char osGetRandom() {
        return 0;
    }

    @Override
    public int osWiCheck() {
        return 0;
    }

    @Override
    public int osCheckBattery() {
        return 0;
    }

    @Override
    public int osCheckPowerSupply() {
        return 0;
    }

    @Override
    public int osReboot() {
        return 0;
    }

    @Override
    public int[] osScrGetSize() {
        return new int[0];
    }

    @Override
    public int osPowerOff() {
        return 0;
    }
}
