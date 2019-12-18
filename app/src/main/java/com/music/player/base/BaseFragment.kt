package com.music.player.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.runOnUiThread
import org.jetbrains.anko.toast

/**
 * @ClassName:   BaseFragment
 * @Description: Fragment基类
 * @Date:        2019-12-19 00:04
 * @Author:      kalinaji
 */
abstract class BaseFragment : Fragment() ,AnkoLogger{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    /**
     * 初始化Fragment
     */
    protected open fun init() {

    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return initView()
    }

    /**
     * 布局ID
     */
    abstract fun initView(): View?


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initListener()
        initData()
    }

    /**
     * 初始化数据
     */
    protected open fun initData() {

    }

    /**
     * 初始化监听
     */
    protected open fun initListener() {

    }

    /**
     *  吐司
     */
    protected open fun myToast(msg:String){
        context?.runOnUiThread { toast(msg) }
    }
}



