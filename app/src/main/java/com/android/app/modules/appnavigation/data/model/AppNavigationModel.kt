package com.android.app.modules.appnavigation.`data`.model

import com.android.app.R
import com.android.app.appcomponents.di.MyApp
import kotlin.String

public data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  public var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
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
  public var txtBlog: String? = MyApp.getInstance().resources.getString(R.string.lbl_blog)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtTermsAndConditions: String? =
      MyApp.getInstance().resources.getString(R.string.msg_terms_and_condi2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtPrivacyPolicy: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_privacy_policy3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterests: String? = MyApp.getInstance().resources.getString(R.string.lbl_interests)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSearchTopics: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_search_topics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignIn: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  public var txtInterestsTopics: String? =
      MyApp.getInstance().resources.getString(R.string.msg_interests_topic)

)
