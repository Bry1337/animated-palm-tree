package io.github.bry1337.todoscky.ui.addedittask

import dagger.Module
import dagger.Provides
import io.github.bry1337.todoscky.application.AppConstants
import io.github.bry1337.todoscky.dagger.ActivityScope
import javax.annotation.Nullable

/**
 * Created by bry1337 on 08/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * This is a Dagger module. We use this to auto create the AddEditTaskSubComponent and bind the
 * presenter to the graph
 */
@Module
abstract class AddEditTaskModule {

	@Module
	companion object {
		@Provides
		@ActivityScope
		@Nullable
		fun provideTaskId(activity: AddEditTaskActivity): String {
			return activity.intent.getStringExtra(AppConstants.ARGUMENT_EDIT_TASK_ID)
		}

		@Provides
		@ActivityScope
		fun provideStatusDataMissing(activity: AddEditTaskActivity): Boolean {
			return activity.isDataMissing()
		}
	}
}