package com.android.app.modules.explore.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseActivity
import com.android.app.databinding.ActivityExploreBinding
import com.android.app.modules.blog.ui.BlogActivity
import com.android.app.modules.explore.`data`.model.Explore1RowModel
import com.android.app.modules.explore.`data`.viewmodel.ExploreVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class ExploreActivity : BaseActivity<ActivityExploreBinding>(R.layout.activity_explore) {
  private val viewModel: ExploreVM by viewModels<ExploreVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recyclerExploreAdapter =
    RecyclerExploreAdapter(viewModel.recyclerExploreList.value?:mutableListOf())
    binding.recyclerExplore.adapter = recyclerExploreAdapter
    recyclerExploreAdapter.setOnItemClickListener(
    object : RecyclerExploreAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Explore1RowModel) {
        onClickRecyclerExplore(view, position, item)
      }
    }
    )
    viewModel.recyclerExploreList.observe(this) {
      recyclerExploreAdapter.updateData(it)
    }
    binding.exploreVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerExplore(
    view: View,
    position: Int,
    item: Explore1RowModel
  ): Unit {
    when(view.id) {
      R.id.linearGroup ->  {
        val destIntent = BlogActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  public companion object {
    public const val TAG: String = "EXPLORE_ACTIVITY"

    public fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ExploreActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
