package com.android.app.modules.signin.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class SignInModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcomeBack: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_welcome_back)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignInWithGo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_go)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignInWithFa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_fa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignInWithTw: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_tw)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignInWithAp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sign_in_with_ap)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtDontHaveAnA: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)

)
