package com.kekyazilim.dagger2mvpexample.util.handlerProcess

import android.os.Handler

/**
 * Responsible to manage Handler Process
 *
 * @author ismailgungor
 * @since 1.0
 */
class HandlerProcessManagement {

    companion object {
        const val DEFAULT_HANDLER_DURATION = 2000L
    }

    /**
     * This method provides post delayed handler with given duration.
     * After the specified period, triggers with given callback where it is called
     *
     * @param callback as HandlerCallback
     * @param duration as Long
     * @author ismailgungor
     * @since 1.0
     */
    fun providePostDelayedHandler(callback: HandlerCallback, duration: Long) {

        Handler().postDelayed({
            callback.onCompleted()
        }, duration)
    }

}