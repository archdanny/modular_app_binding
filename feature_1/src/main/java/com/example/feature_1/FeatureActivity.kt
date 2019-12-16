package com.example.feature_1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.airbnb.epoxy.TypedEpoxyController
import kotlinx.android.synthetic.main.activity_feature.*

class FeatureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
//        setSupportActionBar(toolbar)

        val controller = FeatureActivityEpoxyController()
        feature_recyclerview.setController(controller)
        val itemList = listOf("Test1","Test2")
        controller.setData(itemList)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(com.example.modularapp.R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            com.example.modularapp.R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}


class FeatureActivityEpoxyController : TypedEpoxyController<List<String>>() {
    init {
        setFilterDuplicates(true)
    }

    override fun buildModels(data: List<String>) {
        for (listItem in data) {
            featureOne {
                id(listItem).title(listItem)
            }
        }
    }

}