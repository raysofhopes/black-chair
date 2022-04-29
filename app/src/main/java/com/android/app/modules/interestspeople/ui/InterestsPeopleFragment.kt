package com.android.app.modules.interestspeople.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.android.app.R
import com.android.app.appcomponents.base.BaseFragment
import com.android.app.databinding.FragmentInterestsPeopleBinding
import com.android.app.modules.interestspeople.`data`.model.InterestsPeople1RowModel
import com.android.app.modules.interestspeople.`data`.viewmodel.InterestsPeopleVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

public class InterestsPeopleFragment :
    BaseFragment<FragmentInterestsPeopleBinding>(R.layout.fragment_interests_people) {
  private val viewModel: InterestsPeopleVM by viewModels<InterestsPeopleVM>()

  public override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val recyclerInterestsPeopleAdapter =
    RecyclerInterestsPeopleAdapter(viewModel.recyclerInterestsPeopleList.value?:mutableListOf())
    binding.recyclerInterestsPeople.adapter = recyclerInterestsPeopleAdapter
    recyclerInterestsPeopleAdapter.setOnItemClickListener(
    object : RecyclerInterestsPeopleAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InterestsPeople1RowModel) {
        onClickRecyclerInterestsPeople(view, position, item)
      }
    }
    )
    viewModel.recyclerInterestsPeopleList.observe(requireActivity()) {
      recyclerInterestsPeopleAdapter.updateData(it)
    }
    binding.interestsPeopleVM = viewModel
  }

  public override fun setUpClicks(): Unit {
  }

  public fun onClickRecyclerInterestsPeople(
    view: View,
    position: Int,
    item: InterestsPeople1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  public companion object {
    public const val TAG: String = "INTERESTS_PEOPLE_FRAGMENT"
  }
}
