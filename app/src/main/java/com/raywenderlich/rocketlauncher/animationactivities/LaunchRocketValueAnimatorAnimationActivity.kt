package com.raywenderlich.rocketlauncher.animationactivities

import android.animation.ValueAnimator
import android.view.animation.LinearInterpolator

class LaunchRocketValueAnimatorAnimationActivity : BaseAnimationActivity() {
    override fun onStartAnimation() {

//1
        val valueAnimator = ValueAnimator.ofFloat(0f, -screenHeight)

//2
        valueAnimator.addUpdateListener {
            // 3
            val value = it.animatedValue as Float
            // 4
            rocket.translationY = value
        }

//5
        valueAnimator.interpolator = LinearInterpolator()
        valueAnimator.duration = DEFAULT_ANIMATION_DURATION

//6
        valueAnimator.start()

    }
}
