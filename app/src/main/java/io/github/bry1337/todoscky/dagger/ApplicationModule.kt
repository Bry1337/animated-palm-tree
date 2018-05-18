package io.github.bry1337.todoscky.dagger

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * This is a Dagger module. We use this to bind our Application class as a Context in the ApplicationComponent
 * By using Dagger Android we do not need to pass our Application instance to any module,
 * we simply need to expose our Application as Context.
 * One of the advatanges of Dagger.Android is that our Application & Activities are provided into your graph
 * for you. [ApplicationComponent]
 */
@Module
abstract class ApplicationModule {
	//expose Application as an injectable context
	@Binds
	abstract fun bindContext(application: Application): Context
}