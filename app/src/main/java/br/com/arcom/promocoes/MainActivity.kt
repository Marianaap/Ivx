package br.com.arcom.promocoes

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import br.com.arcom.promocoes.R
import com.example.promcoes.adapter.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout = findViewById<TabLayout>(R.id.tab_Layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager2)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter



        TabLayoutMediator(tabLayout,viewPager2){tab,position->
            when(position){
                0 ->{
                    tab.text = "Meu Espaço"
                    tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FF9900"));
                }
                1 ->{
                    tab.text = "Brindes"
                }
                2 ->{
                    tab.text = "Mapex"
                }
                3 ->{
                    tab.text = "Promoções"
                }
            }
        }.attach()


    }
}