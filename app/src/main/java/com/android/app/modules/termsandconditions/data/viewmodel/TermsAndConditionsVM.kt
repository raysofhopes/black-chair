package com.android.app.modules.termsandconditions.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.termsandconditions.`data`.model.TermsAndConditionsModel
import org.koin.core.KoinComponent

public class TermsAndConditionsVM : ViewModel(), KoinComponent {
  public val termsAndConditionsModel: MutableLiveData<TermsAndConditionsModel> =
      MutableLiveData(TermsAndConditionsModel())

  public var navArguments: Bundle? = null
}
