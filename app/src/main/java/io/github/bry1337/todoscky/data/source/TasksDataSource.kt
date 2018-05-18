package io.github.bry1337.todoscky.data.source

import android.support.annotation.NonNull
import io.github.bry1337.todoscky.data.Task

/**
 * Created by bry1337 on 09/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * Main entry point for accessing tasks data.
 *
 * For simplicity, only getTasks() and getTask() have callbacks. Consider adding callbacks to other
 * methods to inform the user of network/database errors or successful operations.
 * For example, when a new task is created, it's synchronously stored in cache but usually every
 * operation on database or network should be executed in a different thread
 */
interface TasksDataSource {

	interface LoadTasksCallback {
		fun onTasksLoaded(tasks: List<Task>)

		fun onDataNotAvailable()
	}

	interface GetTaskCallback {
		fun onTaskLoaded(task: Task)

		fun onDataNotAvailable()
	}

	fun getTasks(@NonNull callback: LoadTasksCallback)

	fun getTask(@NonNull taskId: String, @NonNull callback: GetTaskCallback)

	fun saveTask(@NonNull task: Task)

	fun completeTask(@NonNull task: Task)

	fun completeTask(@NonNull taskId: String)

	fun activeTask(@NonNull task: Task)

	fun clearCompletedTasks()

	fun refreshTasks()

	fun deleteAllTasks()

	fun deleteTask(@NonNull taskId: String)
}