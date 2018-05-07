package io.github.bry1337.todoscky.ui.application

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import io.github.bry1337.todoscky.ui.dagger.DaggerApplicationComponent

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
class MainApplication : DaggerApplication() {

	override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
		return DaggerApplicationComponent.builder().application(this).build()
	}
}