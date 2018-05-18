package io.github.bry1337.todoscky.dagger

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import io.github.bry1337.todoscky.application.MainApplication
import javax.inject.Singleton

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * This is a Dagger component. Refer to [MainApplication] for the list of Dagger components
 * used in this application.
 *
 * Even though Dagger allows annotating a [Component] as a singleton, the code itself must
 * ensure only one instance of the class is created. This is done in [MainApplication]
 *
 * [AndroidSupportInjectionModule] is the module from Dagger.Android that helps with the
 * generation and location of subcomponents.
 */
@Singleton
@Component(modules = [(ApplicationModule::class), (AndroidSupportInjectionModule::class),
	(ActivityBindingModule::class)])
interface ApplicationComponent : AndroidInjector<MainApplication> {

	@Component.Builder
	interface Builder {

		@BindsInstance
		fun application(application: Application): ApplicationComponent.Builder

		fun build(): ApplicationComponent
	}
}