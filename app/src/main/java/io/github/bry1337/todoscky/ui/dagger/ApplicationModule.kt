package io.github.bry1337.todoscky.ui.dagger

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
@Module
abstract class ApplicationModule {
	//expose Application as an injectable context
	@Binds
	abstract fun bindContext(application: Application): Context
}