package io.github.bry1337.todoscky.application

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.bry1337.todoscky.dagger.DaggerApplicationComponent

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * We create a custom [android.app.Application] class that extends [DaggerApplication].
 * We then override applicationInjector() which tells Dagger how to make our @Singleton Component
 * We never have to call `component.inject(this)` as [DaggerApplication] will do that for us.
 */
class MainApplication : DaggerApplication() {

	override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
		return DaggerApplicationComponent.builder().application(this).build()
	}
}