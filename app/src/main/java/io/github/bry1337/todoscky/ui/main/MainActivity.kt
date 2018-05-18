package io.github.bry1337.todoscky.ui.main

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import io.github.bry1337.todoscky.R
import io.github.bry1337.todoscky.ui.addedittask.AddEditTaskActivity

class MainActivity : AppCompatActivity(), MainContract.View {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		redirectToAddEditTaskActivity()
	}

	override fun redirectToAddEditTaskActivity() {
		val intent = Intent(this, AddEditTaskActivity::class.java)
		intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
		startActivity(intent)
	}
}
