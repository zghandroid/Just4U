package com.qy.just4u.app.main;

import android.os.Bundle;
import android.support.annotation.Nullable;


import com.qy.just4u.R;
import com.qy.just4u.base.BaseActivity;
import com.qy.just4u.ui.EmptyCtrlEditText;
import com.qy.just4u.utils.JLog;


/**
 * 欢迎页面,做的炫一点,一个玫瑰花开的逐帧动画
 * Created by qy on 2016/11/2.
 */

public class SplashActivity extends BaseActivity implements SplashView {


    private EmptyCtrlEditText mEt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void initVariable() {

    }

    @Override
    protected void initView() {
        mEt = (EmptyCtrlEditText) findViewById(R.id.et_emptyctrl);
        mEt.setText("测试");
        JLog.i("测试logger");
    }


    @Override
    protected void initListener() {

    }

}
