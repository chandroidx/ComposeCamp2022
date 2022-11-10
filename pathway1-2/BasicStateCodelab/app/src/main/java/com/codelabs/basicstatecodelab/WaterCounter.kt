package com.codelabs.basicstatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * @Description
 * @author yc.park (DEEP.FINE)
 * @since 2022-11-11
 * @version 1.0.0
 */

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
  Column(modifier = modifier.padding(16.dp)) {
    var count = 0
    Text("You've has $count glasses.")
    Button(onClick = { count++ }, Modifier.padding(top = 8.dp)) {
      Text("Add one")
    }
  }
}