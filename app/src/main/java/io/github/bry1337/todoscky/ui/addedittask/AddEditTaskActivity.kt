package io.github.bry1337.todoscky.ui.addedittask

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import io.github.bry1337.todoscky.R
import io.github.bry1337.todoscky.application.AppConstants

/**
 * Created by bry1337 on 07/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
class AddEditTaskActivity : DaggerAppCompatActivity(), AddEditTaskContract.View {

	var mIsDataMissing: Boolean = true

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.addtask_act)
		restoreState(savedInstanceState)
	}

	override fun restoreState(savedInstanceState: Bundle?) {
		if(savedInstanceState != null) {
			mIsDataMissing = savedInstanceState.getBoolean(AppConstants.SHOULD_LOAD_DATA_FROM_REPO_KEY)
		}
	}

	override fun isDataMissing(): Boolean {
		return mIsDataMissing
	}

}