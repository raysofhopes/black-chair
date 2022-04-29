package com.android.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityAppNavigationBinding
import com.android.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.android.app.modules.blog.ui.BlogActivity
import com.android.app.modules.explore.ui.ExploreActivity
import com.android.app.modules.home.ui.HomeActivity
import com.android.app.modules.interests.ui.InterestsActivity
import com.android.app.modules.intereststopics2.ui.InterestsTopics2Activity
import com.android.app.modules.notifications.ui.NotificationsActivity
import com.android.app.modules.privacypolicy.ui.PrivacyPolicyActivity
import com.android.app.modules.searchtopics.ui.SearchTopicsActivity
import com.android.app.modules.signin.ui.SignInActivity
import com.android.app.modules.signup.ui.SignUpActivity
import com.android.app.modules.termsandconditions.ui.TermsAndConditionsActivity
import kotlin.String
import kotlin.Unit

public class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  public override fun setUpClicks(): Unit {
    binding.linearSearchTopics.setOnClickListener {
      val destIntent = SearchTopicsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInterestsTopics.setOnClickListener {
      val destIntent = InterestsTopics2Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInterests.setOnClickListener {
      val destIntent = InterestsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearExplore.setOnClickListener {
      val destIntent = ExploreActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPrivacyPolicy.setOnClickListener {
      val destIntent = PrivacyPolicyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignIn.setOnClickListener {
      val destIntent = SignInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotifications.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBlog.setOnClickListener {
      val destIntent = BlogActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTermsAndConditions.setOnClickListener {
      val destIntent = TermsAndConditionsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  public companion object {
    public const val TAG: String = "APP_NAVIGATION_ACTIVITY"
  }
}
