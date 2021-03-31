package com.indev.funcooking

import android.app.Application
import android.content.Context
import com.google.firebase.crashlytics.FirebaseCrashlytics
import com.indev.funcooking.repository.SharedPrefHelper
import com.indev.funcooking.timber.DebugTree
import com.indev.funcooking.timber.ReleaseTree
import timber.log.Timber

/**
 * Main entry point of the app. It is declared in the manifest file
 */
class App : Application() {



    /**
     * Main method that we use to set up important things
     */
    override fun onCreate() {
        super.onCreate()

        // Set up timber
        setUpTimber()

        // Set up shared preferences helper
        setUpSharedPreferences()

    }


    /**
     * Timber is a library to log in a better
     * way
     */
    private fun setUpTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(DebugTree())
            // Set a key to an int.
            FirebaseCrashlytics.getInstance().setCustomKey("Build config", "DEBUG")
            Timber.i("Timber set up in DEBUG level")
        } else {
            Timber.plant(ReleaseTree())
            // Set a key to an int.
            FirebaseCrashlytics.getInstance().setCustomKey("Build config", "RELEASE")
        }
    }


    /**
     * Initialize the singleton object to get the shared preferences
     */
    private fun setUpSharedPreferences() {
        SharedPrefHelper.sharedPref =
                this.getSharedPreferences(GeneralConstants.SHARED_PREF_FILE_NAME, Context.MODE_PRIVATE)
    }
}

