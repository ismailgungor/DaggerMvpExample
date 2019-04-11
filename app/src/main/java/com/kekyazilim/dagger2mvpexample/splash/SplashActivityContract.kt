package com.kekyazilim.dagger2mvpexample.splash

import com.kekyazilim.dagger2mvpexample.base.BasePresenter
import com.kekyazilim.dagger2mvpexample.base.BaseView

interface SplashActivityContract {

    interface View : BaseView{

        fun finishActivity()

    }

    interface Presenter: BasePresenter<View>{
        //Silence is golden
    }

}