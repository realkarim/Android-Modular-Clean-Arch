package com.realkarim.navigator.di

import com.realkarim.navigator.AppNavigator
import com.realkarim.navigator.AppNavigatorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NavigatorModule {
  @Provides
  @Singleton
  fun navigator(): AppNavigator {
    return AppNavigatorImpl()
  }
}
