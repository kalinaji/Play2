package com.music.player.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.toast

/**
 * @ClassName:   BaseActivity
 * @Description: Activity基类
 * @Date:        2019-12-18 23:48
 * @Author:      kalinaji
 */
abstract class BaseActivity : AppCompatActivity(),AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutId())
        initListener()
    }

    /**
     * 初始化操作
     */
    protected open fun initListener() {

    }

    /**
     * 获取布局ID
     */
    abstract fun getLayoutId(): Int


    /**
     *  吐司
     */
    protected open fun myToast(msg:String){
        runOnUiThread{ toast(msg)}
    }


}

