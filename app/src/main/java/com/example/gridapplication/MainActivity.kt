package com.example.gridapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var selectionQueue: Queue<Int> = LinkedList()
    lateinit var ib1: Button
    lateinit var ib2: Button
    lateinit var ib3: Button
    lateinit var ib4: Button
    lateinit var ib5: Button
    lateinit var ib6: Button
    lateinit var ib7: Button
    lateinit var ib8: Button
    lateinit var ib9: Button
    lateinit var ib10: Button
    lateinit var ib11: Button
    lateinit var ib12: Button
    lateinit var ib13: Button
    lateinit var ib14: Button
    lateinit var ib15: Button
    lateinit var ib16: Button

    private var buttons = ArrayList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }


    private fun refreshClickState(id: Int) {
        if(!selectionQueue.contains(id)) {
            if (selectionQueue.size == 2) {
                selectionQueue.poll()
            }
            selectionQueue.add(id)
        }
    }

    override fun onClick(v: View?) {
        refreshClickState((v!!.tag as String).toInt())
        refreshUI()
    }

    private fun refreshUI() {
        for (button in buttons) {
            if (selectionQueue.contains((button.tag as String).toInt())) {
                button.setBackgroundColor(Color.RED)
            } else {
                button.setBackgroundColor(Color.BLUE)
            }
        }
    }

    private fun initViews() {
        ib1 = findViewById(R.id.ib_1)
        ib2 = findViewById(R.id.ib_2)
        ib3 = findViewById(R.id.ib_3)
        ib4 = findViewById(R.id.ib_4)
        ib5 = findViewById(R.id.ib_5)
        ib6 = findViewById(R.id.ib_6)
        ib7 = findViewById(R.id.ib_7)
        ib8 = findViewById(R.id.ib_8)
        ib9 = findViewById(R.id.ib_9)
        ib10 = findViewById(R.id.ib_10)
        ib11 = findViewById(R.id.ib_11)
        ib12 = findViewById(R.id.ib_12)
        ib13 = findViewById(R.id.ib_13)
        ib14 = findViewById(R.id.ib_14)
        ib15 = findViewById(R.id.ib_15)
        ib16 = findViewById(R.id.ib_16)

        buttons.add(ib1)
        buttons.add(ib2)
        buttons.add(ib3)
        buttons.add(ib4)
        buttons.add(ib5)
        buttons.add(ib6)
        buttons.add(ib7)
        buttons.add(ib8)
        buttons.add(ib9)
        buttons.add(ib10)
        buttons.add(ib11)
        buttons.add(ib12)
        buttons.add(ib13)
        buttons.add(ib14)
        buttons.add(ib15)
        buttons.add(ib16)


        for (button in buttons) {
            button.setOnClickListener(this)
            button.setBackgroundColor(Color.BLUE)
            button.text = button.tag as String
        }
    }

}