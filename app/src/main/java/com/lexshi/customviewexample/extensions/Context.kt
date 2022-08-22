package com.lexshi.customviewexample.extensions

import android.content.Context

/**
 * @author Lex Shi on 22.08.22
 */

fun Context.dpToPx(dp: Int) : Float {
    return dp.toFloat() * this.resources.displayMetrics.density
}