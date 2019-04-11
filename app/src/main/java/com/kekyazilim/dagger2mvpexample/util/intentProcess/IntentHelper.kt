package com.kekyazilim.dagger2mvpexample.util.intentProcess

import android.content.Context
import android.content.Intent
import com.kekyazilim.dagger2mvpexample.mainactivity.MainActivity

/**
 * Responsible to manage intent process
 *
 * @author ismailgungor
 * @since 1.0
 */
class IntentHelper(private val context: Context) {


    /**
     * This method provides an intent which opens Main Activity
     *
     * @author ismailgungor
     * @since 1.0
     */
    fun intentToMainActivity() {
        context.startActivity(Intent(context, MainActivity::class.java))
    }
}