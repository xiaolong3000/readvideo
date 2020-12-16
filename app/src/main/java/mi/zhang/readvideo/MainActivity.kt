package mi.zhang.readvideo

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.RelativeLayout
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val tabs=findViewById<TabLayout>(R.id.remoteurls)
        val tab1=tabs.newTab()
        tab1.setText("yunzhaun")



        tabs.addTab(tab1)

      tabs.addTab(tab1)

    }



}





