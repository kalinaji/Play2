package com.music.player.ui.fragment

import android.graphics.Color
import android.view.Gravity
import android.view.View
import android.widget.TextView
import com.music.player.base.BaseFragment

/**
 * @ClassName:   MVFragment
 * @Description: MVFragment
 * @Date:        2019-12-20 01:36
 * @Author:      kalinaji
 */
class MVFragment : BaseFragment(){

    override fun initView(): View? {
        val tv = TextView(context)
        tv.gravity = Gravity.CENTER
        tv.setTextColor(Color.RED)
        tv.text = javaClass.simpleName
        return tv
    }

}