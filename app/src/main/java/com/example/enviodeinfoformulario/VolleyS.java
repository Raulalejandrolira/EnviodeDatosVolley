package com.example.enviodeinfoformulario;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

class VolleyS {
    public static VolleyS mVolleyS = null;
    public RequestQueue mRequestQueue;

    private  VolleyS(Context context){
        mRequestQueue = Volley.newRequestQueue(context);
    }

    public static VolleyS getInstance(Context context){
        if(mVolleyS == null){
            mVolleyS = new VolleyS(context);
        }
        return mVolleyS;
    }

    public RequestQueue getmRequestQueue() {
        return mRequestQueue;
    }
}
