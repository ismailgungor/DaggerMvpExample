package com.kekyazilim.dagger2mvpexample.mainactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kekyazilim.dagger2mvpexample.R
import com.kekyazilim.dagger2mvpexample.app.AppModule
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainActivityContract.View {

    @Inject
    lateinit var mPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainActivityComponent.builder()
                .appModule(AppModule(this))
                .build().inject(this)

        this.mPresenter.setView(this)
        this.mPresenter.create()
    }

    override fun bindViews() {
    }

}
