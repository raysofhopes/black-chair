package com.android.app.modules.blog.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.blog.`data`.model.BlogModel
import org.koin.core.KoinComponent

public class BlogVM : ViewModel(), KoinComponent {
  public val blogModel: MutableLiveData<BlogModel> = MutableLiveData(BlogModel())

  public var navArguments: Bundle? = null
}
