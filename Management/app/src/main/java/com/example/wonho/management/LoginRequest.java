package com.example.wonho.management;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wonho on 2017-11-09.
 */

public class LoginRequest extends StringRequest{

    final static private String URL = "http://";
    private Map<String, String> parameters;

    public LoginRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return parameters;
    }
}
