package io.github.bry1337.todoscky.ui.dagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.github.bry1337.todoscky.ui.application.MainApplication
import javax.inject.Singleton

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
@Singleton
@Component(modules = [(ApplicationModule::class), (AndroidSupportInjectionModule::class)])
interface ApplicationComponent : AndroidInjector<MainApplication> {

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun application(application: Application): ApplicationComponent.Builder

		fun build(): ApplicationComponent
	}
}