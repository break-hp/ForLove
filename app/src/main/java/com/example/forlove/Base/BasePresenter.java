package com.example.forlove.Base;


/**
 * DESC: 主要是用于添加、删除view，防止内存泄露。
 */
public class BasePresenter<V extends IContract.IBaseView, M extends IContract.IBaseModel> implements IBasePresenter {

//    CompositeDisposable mSubscriptions;

    protected V mView;

    protected M mModel;

    public BasePresenter(V view) {
        mView = view;
    }

    protected void attach(M model) {
        this.mModel = model;
    }

    @Override
    public void detach() {
        if (this.mView != null) {
            mView = null;
        }
        unDisposable();
    }


    @Override
    public void unDisposable() {
    }
}