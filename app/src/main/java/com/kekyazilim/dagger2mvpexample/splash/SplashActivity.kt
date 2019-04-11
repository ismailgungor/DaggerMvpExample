package com.kekyazilim.dagger2mvpexample.splash

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.github.ybq.android.spinkit.SpinKitView
import com.kekyazilim.dagger2mvpexample.R
import com.kekyazilim.dagger2mvpexample.app.AppModule
import com.kekyazilim.dagger2mvpexample.util.intentProcess.IntentModule
import javax.inject.Inject

class SplashActivity : AppCompatActivity(), SplashActivityContract.View {

    private lateinit var progressView: SpinKitView

    @Inject
    lateinit var mPresenter: SplashActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        DaggerSplashActivityComponent.builder()
                .appModule(AppModule(this))
                .intentModule(IntentModule())
                .splashActivityModule(SplashActivityModule())
                .build().inject(this)

        this.mPresenter.setView(this)
        this.mPresenter.create()

    }

    override fun bindViews() {
        this.progressView = findViewById(R.id.sk_progress)
    }

    override fun showProgress() {
        this.progressView.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        this.progressView.visibility = View.GONE
    }

    override fun finishActivity() {
        this.finish()
    }
}