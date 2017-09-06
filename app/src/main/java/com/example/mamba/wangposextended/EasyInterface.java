package com.example.mamba.wangposextended;

import android.os.RemoteException;

/**
 * Created by mamba on 06.09.2017.
 */

public interface EasyInterface {
    void osBeep(int toneType, int durationMs) throws RemoteException;
    char osGetRandom();
    int osWiCheck();
    int osCheckBattery();
    int osCheckPowerSupply();
    int osReboot();
    int[] osScrGetSize();
    int osPowerOff();
}
