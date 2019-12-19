package com.music.player.util

import android.content.Intent
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.music.player.R
import com.music.player.ui.activity.SettingActivity


/**
 * @ClassName:   ToolBarManager
 * @Description: 所有界面ToolBar的管理类
 * @Date:        2019-12-19 01:50
 * @Author:      kalinaji
 */
interface ToolBarManager {

    val toolbar: Toolbar

    /**
     * 初始化主界面的ToolBar
     */
    fun initMainToolBar(){
        toolbar.setTitle(R.string.app_name)
        toolbar.inflateMenu(R.menu.main)
        toolbar.setOnMenuItemClickListener {

            when(it?.itemId){
                R.id.setting->{
                    // 跳转到设置
                    toolbar.context.startActivity(Intent(toolbar.context,SettingActivity::class.java))
                }
                else -> {

                }
            }
            true
        }
    }
}