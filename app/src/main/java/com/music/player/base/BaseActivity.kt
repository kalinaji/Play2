package com.music.player.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.music.player.ui.activity.MainActivity
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.startActivity
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
        initData()
    }

    /**
     * 初始化数据
     */
    protected open fun initData() {

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
    protected fun myToast(msg:String){
        runOnUiThread{ toast(msg)}
    }


    /**
     * 开启activity并且finish当前界面
     * 内联函数inline 支持 关键字reified 实现泛型
     */
    inline fun <reified T:BaseActivity> startActivityAndFinish(){
        startActivity<T>()
        finish()
    }
}

