package com.sensitivity.moduleaccount.mvp.ui.activity;

import static com.jess.arms.utils.Preconditions.checkNotNull;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputEditText;
import android.widget.TextView;

import com.jess.arms.base.BaseActivity;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.utils.ArmsUtils;
import com.qmuiteam.qmui.widget.roundwidget.QMUIRoundButton;
import com.sensitivity.moduleaccount.R;
import com.sensitivity.moduleaccount.di.component.DaggerLoginComponent;
import com.sensitivity.moduleaccount.di.module.LoginModule;
import com.sensitivity.moduleaccount.mvp.contract.LoginContract;
import com.sensitivity.moduleaccount.mvp.presenter.LoginPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;


public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {

//    @BindView(R.id.et_email)
//    TextInputEditText mEtEmail;
//    @BindView(R.id.et_password)
//    TextInputEditText mEtPassword;
//    @BindView(R.id.btn_login)
//    QMUIRoundButton mBtnLogin;
//    @BindView(R.id.btn_signUp)
//    QMUIRoundButton mBtnSignUp;
//    @BindView(R.id.btn_facebook)
//    QMUIRoundButton mBtnFacebook;
//    @BindView(R.id.btn_google)
//    QMUIRoundButton mBtnGoogle;
//    @BindView(R.id.tv_forgotPassword)
//    TextView mTvForgotPassword;

    @Override
    public void setupActivityComponent(@NonNull AppComponent appComponent) {
        DaggerLoginComponent //如找不到该类,请编译一下项目
                .builder()
                .appComponent(appComponent)
                .loginModule(new LoginModule(this))
                .build()
                .inject(this);
    }

    @Override
    public int initView(@Nullable Bundle savedInstanceState) {
        return R.layout.account_activity_login; //如果你不需要框架帮你设置 setContentView(id) 需要自行设置,请返回 0
    }

    @Override
    public void initData(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showMessage(@NonNull String message) {
        checkNotNull(message);
        ArmsUtils.snackbarText(message);
    }

    @Override
    public void launchActivity(@NonNull Intent intent) {
        checkNotNull(intent);
        ArmsUtils.startActivity(intent);
    }

    @Override
    public void killMyself() {
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
