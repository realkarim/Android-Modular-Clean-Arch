package com.realkarim.navigator.destination

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavDeepLink

interface NavigationDestination {
  fun toRoute(): String

  val arguments: List<NamedNavArgument> get() = emptyList()

  val deepLinks: List<NavDeepLink> get() = emptyList()
}
