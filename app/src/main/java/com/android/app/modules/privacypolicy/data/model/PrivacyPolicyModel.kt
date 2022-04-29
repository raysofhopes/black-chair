package com.android.app.modules.privacypolicy.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class PrivacyPolicyModel(
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
  public var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy)
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
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtLoremIpsumDol1: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCONTENT: String? = MyApp.getInstance().resources.getString(R.string.lbl_content)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCollectionOfI: String? =
      MyApp.getInstance().resources.getString(R.string.msg_collection_of_i)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtUseOfInformat: String? =
      MyApp.getInstance().resources.getString(R.string.msg_use_of_informat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSharingOfInfo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sharing_of_info)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtThirdPartyEmb: String? =
      MyApp.getInstance().resources.getString(R.string.msg_third_party_emb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtYourChoices: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_your_choices)

)
