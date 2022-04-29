package com.android.app.modules.itemdrawermenu.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class DrawerItemDrawerMenuModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtJohnDoe: String? = MyApp.getInstance().resources.getString(R.string.lbl_john_doe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtHome: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtExplore: String? = MyApp.getInstance().resources.getString(R.string.lbl_explore)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterests: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndCondi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
