package com.google.firebase.udacity.friendlychat;

import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by jorge.soasti on 25/10/2017.
 */

public class InstanceIdService extends FirebaseInstanceIdService {

    public static final String TAG = "TOKEN";

    @Override
    public void onTokenRefresh() {
        //super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
        enviarTokenServidor(token);
        //Toast.makeText(this, "TOKEN: " + token, Toast.LENGTH_SHORT).show();
    }

    public void enviarTokenServidor(String token){
        Log.d(TAG, "TOKEN: " + token);
    }
}
