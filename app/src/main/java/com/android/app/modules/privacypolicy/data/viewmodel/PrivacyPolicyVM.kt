package com.android.app.modules.privacypolicy.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.privacypolicy.`data`.model.PrivacyPolicyModel
import org.koin.core.KoinComponent

public class PrivacyPolicyVM : ViewModel(), KoinComponent {
  public val privacyPolicyModel: MutableLiveData<PrivacyPolicyModel> =
      MutableLiveData(PrivacyPolicyModel())

  public var navArguments: Bundle? = null
}
