package com.tangcco.interview.presenter;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Response;

/**
 * Created by YN on 2017/3/25.
 */

public interface UrlResout {
    void onFailure(Call call, IOException e);
    void onSuccess(Call call, Response response)throws IOException;
}
