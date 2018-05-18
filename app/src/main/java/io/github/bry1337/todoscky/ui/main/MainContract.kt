package io.github.bry1337.todoscky.ui.main

import io.github.bry1337.todoscky.ui.BasePresenter
import io.github.bry1337.todoscky.ui.BaseView

/**
 * Created by bry1337 on 08/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
interface MainContract {

	interface View : BaseView<Presenter> {
		fun redirectToAddEditTaskActivity()
	}

	interface Presenter : BasePresenter<View>
}