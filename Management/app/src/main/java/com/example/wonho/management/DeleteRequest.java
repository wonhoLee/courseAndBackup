package com.example.wonho.management;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wonho on 2017-11-14.
 */

public class DeleteRequest extends StringRequest {
    final static  private  String URL = "http://";
    private Map<String, String> parameters;

    public DeleteRequest(String userID, Response.Listener<String> listener) {
        super(Request.Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
    }

    @Override
    protected Map<String, String> getParams() {
        return parameters;
    }
}
