package com.music.player.ui.activity

import androidx.appcompat.widget.Toolbar
import com.music.player.R
import com.music.player.base.BaseActivity
import com.music.player.util.ToolBarManager
import org.jetbrains.anko.find

/**
 * @ClassName:   Setting
 * @Description: 设置Activity
 * @Date:        2019-12-19 09:40
 * @Author:      kalinaji
 */
class SettingActivity : BaseActivity(),ToolBarManager {

    // 线程安全的懒加载模式
    override val toolbar by lazy { find<Toolbar>(R.id.toolbar) }

    override fun getLayoutId(): Int {
        return R.layout.activity_setting
    }

    override fun initData() {
        initSettingToolBar()
    }
}