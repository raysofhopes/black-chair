package com.android.app.modules.intereststopics.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseFragment
import com.android.app.databinding.FragmentInterestsTopicsBinding
import com.android.app.modules.intereststopics.`data`.model.InterestsTopics1RowModel
import com.android.app.modules.intereststopics.`data`.viewmodel.InterestsTopicsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class InterestsTopicsFragment :
    BaseFragment<FragmentInterestsTopicsBinding>(R.layout.fragment_interests_topics) {
  private val viewModel: InterestsTopicsVM by viewModels<InterestsTopicsVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerInterestsTopicsAdapter =
    RecyclerInterestsTopicsAdapter(viewModel.recyclerInterestsTopicsList.value?:mutableListOf())
    binding.recyclerInterestsTopics.adapter = recyclerInterestsTopicsAdapter
    recyclerInterestsTopicsAdapter.setOnItemClickListener(
    object : RecyclerInterestsTopicsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InterestsTopics1RowModel) {
        onClickRecyclerInterestsTopics(view, position, item)
      }
    }
    )
    viewModel.recyclerInterestsTopicsList.observe(requireActivity()) {
      recyclerInterestsTopicsAdapter.updateData(it)
    }
    binding.interestsTopicsVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerInterestsTopics(
    view: View,
    position: Int,
    item: InterestsTopics1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INTERESTS_TOPICS_FRAGMENT"
  }
}
