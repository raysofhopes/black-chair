package com.android.app.modules.signup.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivitySignUpBinding
import com.android.app.modules.interests.ui.InterestsActivity
import com.android.app.modules.signup.`data`.viewmodel.SignUpVM
import kotlin.String
import kotlin.Unit

public class SignUpActivity : BaseActivity<ActivitySignUpBinding>(R.layout.activity_sign_up) {
  private val viewModel: SignUpVM by viewModels<SignUpVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signUpVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearGroup161.setOnClickListener {
      val destIntent = InterestsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearGroup162.setOnClickListener {
      val destIntent = InterestsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "SIGN_UP_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SignUpActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
