package com.reactlibrary.devicenumber;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;


public class DeviceNumberModule extends ReactContextBaseJavaModule {
    private static ReactApplicationContext reactContext;
    private Promise gPromise ;
    private final ActivityEventListener mActivityEventListener = new BaseActivityEventListener(){
        @Override
        public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
            if(requestCode == 1){
                if (resultCode == Activity.RESULT_OK){
                    WritableMap map = Arguments.createMap();
                    map.putString("mobileNumber", data.getExtras().getString("mobileNumber"));
                    gPromise.resolve(map);
                }else{
                    gPromise.reject("Error", "Cancle");
                }
            }
        }
    };

    DeviceNumberModule(ReactApplicationContext context) {
        super(context);
        reactContext = context;
        context.addActivityEventListener(mActivityEventListener);
    }

    @Override
    public String getName() {
        return "DeviceNumber";
    }

    @ReactMethod
    public void get(Promise promise) {
        Intent intent = new Intent(getCurrentActivity(),DeviceNumberActivity.class);
        getCurrentActivity().startActivityForResult(intent,1);
        gPromise = promise ;
    }
}