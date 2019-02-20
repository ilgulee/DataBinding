package ilgulee.com.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import ilgulee.com.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        //build project again
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        binding.textName.text = "Ilgu Lee"
//        binding.textEmail.text = "iglee2000@gmail.com"
        binding.contact = Contact("Ilgu Lee", "iglee2000@gmail.com")
    }
}
