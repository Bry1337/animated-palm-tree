package io.github.bry1337.todoscky.ui.addedittask

import android.os.Bundle
import io.github.bry1337.todoscky.ui.BasePresenter
import io.github.bry1337.todoscky.ui.BaseView

/**
 * Created by bry1337 on 08/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
interface AddEditTaskContract {

	interface View : BaseView<Presenter> {

		fun restoreState(savedInstanceState: Bundle?)

		fun isDataMissing(): Boolean

	}

	interface Presenter : BasePresenter<View> {

	}
}