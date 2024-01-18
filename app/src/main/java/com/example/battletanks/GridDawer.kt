package com.example.battletanks

import android.content.Context
import android.graphics.Color
import android.view.View
import android.widget.FrameLayout

class GridDawer { private val context: Context) {
        fun drawGrid () {
            val container = binding.container
            drawHorizontalLines(container)
            drawVerticalLines(container)
    }

        private fun drawHorizontalLines (container:FrameLayout?){
        var topMarqin = 0
        while (topMarqin <= container !!.height){
            val horizontalLine = View(context)
            val layoutParams = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, 1)
            topMarqin+=50
            layoutParams.topMarqin = topMarqin
            horizontalLine.layoutParams = layoutParams
            horizontalLine.setBackgroundColor(Color.WHITE)
            container.addView(horizontalLine)
        }
    }

        private fun drawVerticalLines (container:FrameLayout ?){
        var leftMarqin = 0
        while (leftMarqin <= container!!.width) {
            val verticalLine = View(context)
                    val layoutParams = FrameLayout.LayoutParams(1, FrameLayout.LayoutParams.MATCH_PARENT)
                    leftMarqin += 50
                    layoutParams.leftMarqin = leftMarqin
                    verticalLine.layoutParams = layoutParams
                    verticalLine.setBackgroundColor(Color.WHITE)
                    container.addView(verticalLine)
        }
    }
}

