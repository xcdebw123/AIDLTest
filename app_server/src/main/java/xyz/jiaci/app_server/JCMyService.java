package xyz.jiaci.app_server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class JCMyService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return new MyBinder();
    }

    class MyBinder extends MyAIDL.Stub{
        @Override
        public String getText() throws RemoteException
        {
            return "我来自app_server";
        }
    }
}
