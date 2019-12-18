package com.music.player.ui.activity

import androidx.appcompat.widget.Toolbar

import com.music.player.R
import com.music.player.base.BaseActivity
import com.music.player.util.ToolBarManager
import org.jetbrains.anko.find

/**
 * @ClassName:   MainActivity
 * @Description: 主界面
 * @Date:        2019-12-19 01:32
 * @Author:      kalinaji
 */
class MainActivity : BaseActivity(),ToolBarManager {

    // 线程安全的懒加载模式
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    override fun initData() {
        initMainToolBar()
    }
}
