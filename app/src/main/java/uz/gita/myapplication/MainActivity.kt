package uz.gita.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.gita.myapplication.databinding.ActivityMainBinding
import uz.gita.myapplication.task1.Task1Activity
import uz.gita.myapplication.task2.Task2Activity
import uz.gita.myapplication.task3.Task3Activity
import uz.gita.myapplication.task4.Task4Activity
import uz.gita.myapplication.task5.Task5Activity
import uz.gita.myapplication.task6.Task6Activity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btn1.setOnClickListener {
            startActivity(Intent(this, Task1Activity::class.java))
        }

        binding.btn2.setOnClickListener {
            startActivity(Intent(this, Task2Activity::class.java))
        }

        binding.btn3.setOnClickListener {
            startActivity(Intent(this, Task3Activity::class.java))
        }

        binding.btn4.setOnClickListener {
            startActivity(Intent(this, Task4Activity::class.java))
        }

        binding.btn5.setOnClickListener {
            startActivity(Intent(this, Task5Activity::class.java))
        }

        binding.btn6.setOnClickListener {
            startActivity(Intent(this, Task6Activity::class.java))
        }
    }
}
