package com.tangcco.interview.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tangcco.interview.R;

/**
 * Created by YN on 2017/3/22.
 */

public class shangchuanFragment extends Fragment {
    public shangchuanFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View inflate = inflater.inflate(R.layout.fragment_shangchuan,null);
        return inflate;
    }
}
