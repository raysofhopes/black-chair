package com.android.app.modules.blog.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityBlogBinding
import com.android.app.modules.blog.`data`.viewmodel.BlogVM
import kotlin.String
import kotlin.Unit

public class BlogActivity : BaseActivity<ActivityBlogBinding>(R.layout.activity_blog) {
  private val viewModel: BlogVM by viewModels<BlogVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.blogVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public companion object {
    public const val TAG: String = "BLOG_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BlogActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
