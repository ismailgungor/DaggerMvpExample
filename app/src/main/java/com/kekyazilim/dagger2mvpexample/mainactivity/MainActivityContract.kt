package com.kekyazilim.dagger2mvpexample.mainactivity

import com.kekyazilim.dagger2mvpexample.base.BasePresenter
import com.kekyazilim.dagger2mvpexample.base.BaseView

interface MainActivityContract {

    interface View : BaseView{

    }

    interface Presenter: BasePresenter<View> {
    }

}