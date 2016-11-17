package com.qy.just4u.app.joke;

import com.qy.just4u.base.BasePresenter;
import com.qy.just4u.base.BaseView;

/**
 * Created by abc on 2016/11/17.
 */

public interface GetJokeContract {
    interface View extends BaseView<Presenter> {
        void showLoading();// 显示加载匡

        void dismissLoading();// 隐藏加载框

        void showData();//展示请求回的数据
    }

    interface Presenter extends BasePresenter {
        // TODO: 2016/11/17 操作
    }
}
