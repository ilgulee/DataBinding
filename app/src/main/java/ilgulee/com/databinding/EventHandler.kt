package ilgulee.com.databinding

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {
    val appContext = context
    fun onButtonClick(name: String) {
        Toast.makeText(appContext, "Hello $name", Toast.LENGTH_SHORT).show()
    }
}