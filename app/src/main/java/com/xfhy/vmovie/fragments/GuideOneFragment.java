package com.xfhy.vmovie.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xfhy.vmovie.R;


/**
 * Created by xfhy on 2017年6月18日15:14:41
 * 引导界面1
 */

public class GuideOneFragment extends Fragment {

    //加载布局
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
            Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_guide_one, container, false);
        return view;
    }

    public static GuideOneFragment newInstance() {

        Bundle args = new Bundle();

        GuideOneFragment fragment = new GuideOneFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
