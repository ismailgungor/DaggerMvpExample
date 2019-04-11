package com.kekyazilim.dagger2mvpexample.base

interface BasePresenter<T : BaseView> {

    fun setView(view: T)

    fun create()
}