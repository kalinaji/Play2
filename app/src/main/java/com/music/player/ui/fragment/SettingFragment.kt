package com.music.player.ui.fragment

import android.os.Bundle
import android.preference.PreferenceFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.music.player.R


/**
 * @ClassName:   SettingFragment
 * @Description: 设置Fragment
 * @Date:        2019-12-19 10:18
 * @Author:      kalinaji
 */
class SettingFragment : PreferenceFragment() {

    override fun onCreateView(
        inflater: LayoutInflater?,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        addPreferencesFromResource(R.xml.setting)
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}