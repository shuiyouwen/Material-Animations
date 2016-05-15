package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by 水sir on 2016/5/15.
 */
public class SecondFragment extends BaseFragment {
    @BindView(R.id.btn_click)
    Button btnClick;

    public static SecondFragment newInstance() {
        return new SecondFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @OnClick(R.id.btn_click)
    void btnCLick() {
        FragmentManager manager = getActivity().getSupportFragmentManager();
        manager.popBackStack();
    }


}
