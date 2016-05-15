package com.example.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Created by 水sir on 2016/5/15.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @BindView((R.id.tv_title))
    TextView tvTitle;
    @BindView(R.id.tv_subtitle)
    TextView tvSubtitle;
    @BindView(R.id.rv_title_bar)
    RelativeLayout rvTitleBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData(savedInstanceState);
        initView();

        initTitleBar();
    }

    public void initData(Bundle savedInstanceState) {
    }

    public abstract void initView();


    public void initTitleBar() {
        setToolbarTitle();
        setToolbarSubtitle();
    }

    @OnClick(R.id.iv_back)
    public void backClick() {
        onBackPressed();
    }

    public void setToolbarSubtitle() {
        tvSubtitle.setText("156****9121");
    }

    public void setToolbarTitle() {
        tvTitle.setText("收银台");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            backClick();
        }
        return true;
    }
}
