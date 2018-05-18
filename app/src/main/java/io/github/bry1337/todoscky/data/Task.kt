package io.github.bry1337.todoscky.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Ignore
import android.arch.persistence.room.PrimaryKey
import android.support.annotation.NonNull
import android.support.annotation.Nullable
import org.apache.commons.lang3.StringUtils
import java.util.*

/**
 * Created by bry1337 on 09/05/2018.
 *
 * @author edwardbryan.abergas@gmail.com
 */

/**
 * Immutable model class for a Task.
 */
@Entity(tableName = "tasks")
class Task {

	@PrimaryKey
	@NonNull
	@ColumnInfo(name = "entryid")
	var mId: String = StringUtils.EMPTY

	@Nullable
	@ColumnInfo(name = "title")
	var mTitle: String = StringUtils.EMPTY

	@Nullable
	@ColumnInfo(name = "description")
	var mDescription: String = StringUtils.EMPTY

	@ColumnInfo(name = "completed")
	var mCompleted: Boolean = false


	/**
	 * Use this constructor to create a new active task.
	 *
	 * @param title title of the task
	 * @param description description of the task
	 */
	@Ignore
	constructor(@Nullable title: String, @Nullable description: String) :
			this(title, description, UUID.randomUUID().toString(), false)

	/**
	 * Use this constructor to create an active Task if the Task already has an id
	 * (copy of another Task).
	 *
	 * @param title title of the task
	 * @param description description of the task
	 * @param id id of the task
	 */
	@Ignore
	constructor(@Nullable title: String, @Nullable description: String, @NonNull id: String) :
			this(title, description, id, false)

	/**
	 * Use this constructor to create a new completed Task
	 *
	 * @param title title of the task
	 * @param description description of the task
	 * @param completed true if the task is completed, false if it's active
	 */
	@Ignore
	constructor(@Nullable title: String, @Nullable description: String, completed: Boolean) :
			this(title, description, UUID.randomUUID().toString(), completed)

	constructor(@Nullable title: String, @Nullable description: String, @NonNull id: String, completed: Boolean) {
		mId = id
		mTitle = title
		mDescription = description
		mCompleted = completed
	}

}