package com.nmcint.jpialumnus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import java.security.AccessController
import java.security.AccessController.getContext

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val technologies = arrayOf<String?>("Item 1", "Item 2", "Item 3", "Item 4")

        val adapter: ArrayAdapter<String?> = ArrayAdapter(
            this,
            R.layout.dropdown_menu_popup_item,
            technologies)

        val editTextFilledExposedDropdown: AutoCompleteTextView =
            findViewById(R.id.filled_exposed_dropdown)
        editTextFilledExposedDropdown.setAdapter(adapter)
    }
}