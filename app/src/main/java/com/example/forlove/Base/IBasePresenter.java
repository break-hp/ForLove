package com.example.forlove.Base;
/**
 * created by jiangtao on 2021/3/2 16:02
 * breakTT
 */
public interface  IBasePresenter {

        //Activity关闭把view对象置为空
        void detach();

        //将网络请求的每一个disposable添加进入CompositeDisposable，再退出时候一并注销
//        void addDisposable(Disposable subscription);

        //注销所有请求
        void unDisposable();
}
