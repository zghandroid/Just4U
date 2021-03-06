package com.qy.just4u.app.main;

import com.qy.just4u.base.BasePresenter;
import com.qy.just4u.base.BaseView;

/**
 * Created by abc on 2016/11/23.
 */

public interface SplashContract {
    interface SplashPresenter extends BasePresenter {
        void countDown();
    }

    interface SplashView extends BaseView<SplashPresenter> {
        void setNum(int second);
        void finish();
    }

}
