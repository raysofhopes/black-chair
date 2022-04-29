package com.android.app.modules.intereststopics2.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityInterestsTopics2Binding
import com.android.app.modules.intereststopics2.`data`.viewmodel.InterestsTopics2VM
import com.google.android.material.tabs.TabLayoutMediator
import kotlin.String
import kotlin.Unit

public class InterestsTopics2Activity :
    BaseActivity<ActivityInterestsTopics2Binding>(R.layout.activity_interests_topics2) {
  private val viewModel: InterestsTopics2VM by viewModels<InterestsTopics2VM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestsTopics2VM = viewModel
    val adapter = InterestsTopics2ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerGroup41.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup4,binding.viewPagerGroup41) { tab, position ->
      tab.text = InterestsTopics2ActivityPagerAdapter.title[position]
      }.attach()
    }

    public override fun setUpClicks(): Unit {
    }

    public companion object {
      public const val TAG: String = "INTERESTS_TOPICS2ACTIVITY"

      public fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, InterestsTopics2Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
