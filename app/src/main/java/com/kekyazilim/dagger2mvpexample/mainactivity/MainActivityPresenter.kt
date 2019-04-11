package com.kekyazilim.dagger2mvpexample.mainactivity

import javax.inject.Inject

class MainActivityPresenter @Inject constructor() : MainActivityContract.Presenter {

    private lateinit var mView: MainActivityContract.View

    override fun setView(view: MainActivityContract.View) {
        this.mView = view
    }

    override fun create() {
    }
}