package com.kekyazilim.dagger2mvpexample.splash

import com.kekyazilim.dagger2mvpexample.util.handlerProcess.HandlerCallback
import com.kekyazilim.dagger2mvpexample.util.handlerProcess.HandlerProcessManagement
import com.kekyazilim.dagger2mvpexample.util.intentProcess.IntentHelper
import javax.inject.Inject

class SplashActivityPresenter @Inject constructor() : SplashActivityContract.Presenter {

    private lateinit var mView: SplashActivityContract.View

    @Inject
    lateinit var mHandlerProcessManagement: HandlerProcessManagement

    @Inject
    lateinit var mIntentHelper: IntentHelper


    override fun setView(view: SplashActivityContract.View) {
        this.mView = view
    }

    override fun create() {

        this.mView.bindViews()
        this.mView.showProgress()

        this.mHandlerProcessManagement.providePostDelayedHandler(object : HandlerCallback {
            override fun onCompleted() {
                mView.hideProgress()
                mIntentHelper.intentToMainActivity()
                mView.finishActivity()
            }
        }, HandlerProcessManagement.DEFAULT_HANDLER_DURATION)
    }

}