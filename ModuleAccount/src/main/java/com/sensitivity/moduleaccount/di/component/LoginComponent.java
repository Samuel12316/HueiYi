package com.sensitivity.moduleaccount.di.component;

import dagger.Component;

import com.jess.arms.di.component.AppComponent;

import com.sensitivity.moduleaccount.di.module.LoginModule;

import com.jess.arms.di.scope.ActivityScope;
import com.sensitivity.moduleaccount.mvp.ui.activity.LoginActivity;

@ActivityScope
@Component(modules = LoginModule.class, dependencies = AppComponent.class)
public interface LoginComponent {
    void inject(LoginActivity activity);
}