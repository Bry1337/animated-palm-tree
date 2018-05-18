package io.github.bry1337.todoscky.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector
import io.github.bry1337.todoscky.ui.addedittask.AddEditTaskActivity
import io.github.bry1337.todoscky.ui.addedittask.AddEditTaskModule

/**
 * Created by bry1337 on 08/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * We want Dagger.Android to create a Subcomponent which has a parent Component of whichever module
 * ActivityBindingModule is on,
 * in our case that will be ApplicationComponent. The beautiful part about this setup is that you
 * never need to tell ApplicationComponent that
 * it is going to have all these subcomponents nor do you need to tell the subcomponents that
 * ApplicationComponent exists.
 * We are also telling Dagger.Android that this generated SubComponent needs to include the specified
 * modules and be aware of a scope annotation
 * @ActivityScoped When Dagger.Android annotation processor runs it will ceate 4 subcomponents for us.
 */
@Module
abstract class ActivityBindingModule {

	@ActivityScope
	@ContributesAndroidInjector(modules = [(AddEditTaskModule::class)])
	abstract fun addEditTaskActivity(): AddEditTaskActivity
}