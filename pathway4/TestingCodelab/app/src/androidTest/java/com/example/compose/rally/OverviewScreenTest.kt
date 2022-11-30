package com.example.compose.rally

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.compose.rally.ui.overview.OverviewBody
import org.junit.Rule
import org.junit.Test

/**
 * @Description
 * @author yc.park (DEEP.FINE)
 * @since 2022-11-30
 * @version 1.0.0
 */
class OverviewScreenTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun overviewScreen_alertsDisplayed() {
    composeTestRule.setContent {
      OverviewBody()
    }

    composeTestRule
      .onNodeWithText("Alerts")
      .assertIsDisplayed()
  }
}