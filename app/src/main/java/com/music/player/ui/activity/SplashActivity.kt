package com.music.player.ui.activity

import android.view.View
import androidx.core.view.ViewCompat
import androidx.core.view.ViewPropertyAnimatorListener
import com.music.player.R
import com.music.player.base.BaseActivity
import kotlinx.android.synthetic.main.activity_splash.*

/**
 * @ClassName:   SplashActivity
 * @Description: 欢迎界面
 * @Date:        2019-12-19 00:32
 * @Author:      kalinaji
 */
class SplashActivity : BaseActivity(), ViewPropertyAnimatorListener {


    override fun getLayoutId(): Int {
        return R.layout.activity_splash
    }

    override fun initData() {
        ViewCompat.animate(imageView)
            .scaleX(1.0f)
            .scaleY(1.0f)
            .setListener(this)
            .duration = 2000
    }

    override fun onAnimationEnd(view: View?) {
        startActivityAndFinish<MainActivity>()
    }

    override fun onAnimationCancel(view: View?) {

    }

    override fun onAnimationStart(view: View?) {

    }
}