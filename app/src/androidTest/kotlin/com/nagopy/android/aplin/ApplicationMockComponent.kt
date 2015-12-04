/*
 * Copyright 2015 75py
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.nagopy.android.aplin

import com.nagopy.android.aplin.model.converter.AppConverterTest
import com.nagopy.android.aplin.presenter.MainScreenPresenterTest
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = arrayOf(ApplicationMockModule::class))
interface ApplicationMockComponent : ApplicationComponent {
    fun inject(appParametersTest: AppConverterTest)
    fun inject(mainScreenPresenterTest: MainScreenPresenterTest)
}