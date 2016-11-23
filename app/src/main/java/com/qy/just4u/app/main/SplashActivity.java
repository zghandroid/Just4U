package com.qy.just4u.app.main;

import android.app.Service;
import android.os.Bundle;
import android.support.annotation.Nullable;


import com.qy.just4u.R;
import com.qy.just4u.base.BaseActivity;
import com.qy.just4u.ui.EmptyCtrlEditText;

import butterknife.BindView;


/**
 * 欢迎页面,做的炫一点,一个玫瑰花开的逐帧动画
 * Created by qy on 2016/11/2.
 */

public class SplashActivity extends BaseActivity implements SplashView {

    @BindView(R.id.et_emptyctrl)
    EmptyCtrlEditText mEt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void initVariable() {
//        getPackageManager()
    }

    @Override
    protected void initView() {
    }



    @Override
    protected void initListener() {

    }

}
