package com.android.app.modules.signup.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class SignUpModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtRegisterNow: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_register_now)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithTw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_tw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUpWithAp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_up_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtAlreadyHaveAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_have_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtBySigningUp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_by_signing_up)

)
