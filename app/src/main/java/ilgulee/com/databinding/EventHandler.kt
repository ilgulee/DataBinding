package ilgulee.com.databinding

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context) {
    val appContext = context
    fun onButtonClick() {
        Toast.makeText(appContext, "Hello", Toast.LENGTH_SHORT).show()
    }
}