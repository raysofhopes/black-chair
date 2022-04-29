package com.android.app.modules.signup.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.app.modules.signup.`data`.model.SignUpModel
import org.koin.core.KoinComponent

public class SignUpVM : ViewModel(), KoinComponent {
  public val signUpModel: MutableLiveData<SignUpModel> = MutableLiveData(SignUpModel())

  public var navArguments: Bundle? = null
}
