package com.android.app.modules.interests.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityInterestsBinding
import com.android.app.modules.interests.`data`.viewmodel.InterestsVM
import kotlin.String
import kotlin.Unit

public class InterestsActivity : BaseActivity<ActivityInterestsBinding>(R.layout.activity_interests)
    {
  private val viewModel: InterestsVM by viewModels<InterestsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.interestsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "INTERESTS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InterestsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
