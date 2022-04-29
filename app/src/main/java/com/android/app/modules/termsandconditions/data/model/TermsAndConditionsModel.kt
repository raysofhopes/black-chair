package com.android.app.modules.termsandconditions.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class TermsAndConditionsModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtJohnDoeInLor: String? =
      MyApp.getInstance().resources.getString(R.string.msg_john_doe_in_lor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txt29July: String? = MyApp.getInstance().resources.getString(R.string.lbl_29_july)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndCondi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtEffectiveSept: String? =
      MyApp.getInstance().resources.getString(R.string.msg_effective_sept)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYouCanSeeOur: String? =
      MyApp.getInstance().resources.getString(R.string.msg_you_can_see_our)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol2: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol3: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol5)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourAccountAn: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_account_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol4: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol5)

)
