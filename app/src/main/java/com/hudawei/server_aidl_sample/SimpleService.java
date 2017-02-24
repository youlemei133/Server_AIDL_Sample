package com.hudawei.server_aidl_sample;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by hudawei on 2017/2/24.
 */

public class SimpleService extends Service {
    public class SimpleServiceImpl extends ISimpleService.Stub{
        @Override
        public int get() throws RemoteException {
            return 10086;
        }
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.e("SimpleService","SimpleService onBind");
        return new SimpleServiceImpl();
    }
}
