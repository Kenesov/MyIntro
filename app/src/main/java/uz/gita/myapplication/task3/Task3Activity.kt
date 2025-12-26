package uz.gita.myapplication.task3

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.gita.myapplication.R
import uz.gita.myapplication.databinding.ActivityTask3Binding

class Task3Activity : AppCompatActivity() {

    lateinit var binding: ActivityTask3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTask3Binding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.viewPager.adapter = Pager3Adapter(supportFragmentManager, lifecycle)
        binding.dotsIndicator.attachTo(binding.viewPager)

    }
}