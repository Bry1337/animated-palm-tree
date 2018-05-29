package io.github.bry1337.todoscky.ui

/**
 * Created by bry1337 on 08/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */
interface BasePresenter<T> {

	/**
	 * Binds presenter with a view when resumed. The Presenter will perform initialization here.
	 *
	 * @param view the view associated with this presenter
	 */
	fun takeView(view: T)

	/**
	 * Drops the reference to the view when destroyed
	 */
	fun dropView()
}