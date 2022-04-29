package com.android.app.modules.termsandconditions.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityTermsAndConditionsBinding
import com.android.app.modules.termsandconditions.`data`.viewmodel.TermsAndConditionsVM
import kotlin.String
import kotlin.Unit

public class TermsAndConditionsActivity :
    BaseActivity<ActivityTermsAndConditionsBinding>(R.layout.activity_terms_and_conditions) {
  private val viewModel: TermsAndConditionsVM by viewModels<TermsAndConditionsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.termsAndConditionsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "TERMS_AND_CONDITIONS_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TermsAndConditionsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
