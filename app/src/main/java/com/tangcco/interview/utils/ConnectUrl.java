package com.tangcco.interview.utils;

import com.tangcco.interview.presenter.UrlResout;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static com.tangcco.interview.utils.Util.okHttpClient;

/**
 * Created by YN on 2017/3/25.
 */

public class ConnectUrl {

    private UrlResout resout;

    public ConnectUrl() {
    }

    public ConnectUrl(UrlResout resout) {
        this.resout = resout;
    }

    //请求网络数据

    public  void postData(String className,String objectId){
        if (okHttpClient==null){
            okHttpClient=new OkHttpClient();
        }

        Request request = new Request.Builder()
                .url(Util.connectUrl(className,objectId))
                .addHeader(Cons.APPLICATION_ID, Cons.APPLICATION_ID_VALUE)
                .addHeader(Cons.APPLICATION_KEY,Cons.APPLICATION_KEY_VALUE)
                .addHeader(Cons.CONTENT_TYPE,Cons.CONTENT_TYPE_JSON)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

                resout.onFailure(call,e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                resout.onSuccess(call,response);
            }
        });
    }

    public void login(String username,String password){
        if (okHttpClient==null){
            okHttpClient=new OkHttpClient();
        }
        String str = Util.connectUrl("user",null);

        FormBody body = new FormBody.Builder()
                .add("where","{\"username\":\"admin\"}").build();
        Request request = new Request.Builder()
                .url(str)
                .addHeader(Cons.APPLICATION_ID,Cons.APPLICATION_ID_VALUE)
                .addHeader(Cons.APPLICATION_KEY,Cons.APPLICATION_KEY_VALUE)
//                .addHeader(Cons.CONTENT_TYPE,Cons.CONTENT_TYPE_JSON)
                .post(body)
                .build();

        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                resout.onFailure(call,e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                resout.onSuccess(call,response);
            }
        });


    }
}
