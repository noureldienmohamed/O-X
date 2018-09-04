package com.example.nour.xando

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }var cellID =0
    fun bucselect(view: View) {
        val buchoise = view as Button
        when (buchoise.id) {
            R.id.bt1 -> cellID = 1
            R.id.bt2 -> cellID = 2
            R.id.bt3 -> cellID = 3
            R.id.bt4 -> cellID = 4
            R.id.bt5 -> cellID = 5
            R.id.bt6 -> cellID = 6
            R.id.bt7 -> cellID = 7
            R.id.bt8 -> cellID = 8
            R.id.bt9 -> cellID = 9

        }
        Log.d("cellId:", cellID.toString())
        PlayGame(cellID, buchoise)
    }

        var player1 = ArrayList<Int>()
        var player2 = ArrayList<Int>()
        var activePlayer = 1
        fun PlayGame(cellID: Int, buchoise: Button) {
            if (activePlayer == 1) {
                buchoise.text = "X"
                buchoise.setBackgroundResource(R.color.blue)
                player1.add(cellID)
                activePlayer = 2
                //AutoPlay()
            } else {
                buchoise.text = "O"
                buchoise.setBackgroundResource(R.color.darkgreen)
                player2.add(cellID)
                activePlayer = 1
            }
            buchoise.isEnabled = false
            CheckWinner()
        }

        fun CheckWinner() {
            var winner = -1
            //row1
            if (player1.contains(1) && player1.contains(2) && player1.contains(3) ) {
                winner = 1
            }

            if (player2.contains(1) && player2.contains(2) && player2.contains(3) ) {
                winner = 2
            }
            //row2
            if (player1.contains(4) && player1.contains(5) && player1.contains(6) ) {
                winner = 1
            }
            if (player2.contains(4) && player2.contains(5) && player2.contains(6) ) {
                winner = 2
            }  //row3
            if (player1.contains(7) && player1.contains(8) && player1.contains(9) ) {
                winner = 1
            }
            if (player2.contains(7) && player2.contains(8) && player2.contains(9) ) {
                winner = 2
            }
            //col1
            if (player1.contains(1) && player1.contains(4) && player1.contains(7) ) {
                winner = 1
            }
            if (player2.contains(1) && player2.contains(4) && player2.contains(7) ) {
                winner = 2
            }  //col2
            if (player1.contains(2) && player1.contains(5) && player1.contains(8) ) {
                winner = 1
            }
            if (player2.contains(2) && player2.contains(5) && player2.contains(8) ) {
                winner = 2
            }
            //col3
            if (player1.contains(3) && player1.contains(6) && player1.contains(9) ) {
                winner = 1
            }
            if (player2.contains(3) && player2.contains(6) && player2.contains(9) ) {
                winner = 2
            }
            //cro1
            if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
                winner = 1
            }
            if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
                winner = 2
            }
            //cro2
            if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
                winner = 1
            }
            if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
                winner = 2
            }
            if (winner != -1) {
                if (winner == 1) {
                    Toast.makeText(this, "Player 1 Win the Game", Toast.LENGTH_LONG).show()
                } else {
                    Toast.makeText(this, "Player 2 Win the Game", Toast.LENGTH_LONG).show()

                }

                }

            }
            }



        /*fun AutoPlay() {
            //scan empty cells
            val emtCells = ArrayList<Int>()
            for (CellID in 1..9) {

                if (!(player1.contains(cellID) || player2.contains(cellID))){
                 emtCells.add(cellID)
            }
        }
            //select rand index
            val r =Random()
            val randIndex = r.nextInt(emtCells.size-0)+0
            val cellID = emtCells[randIndex]
            //interpeter index to button
            var buSelect:Button?
            buSelect = when (cellID){
                1 -> bt1
                2 -> bt2
                3 -> bt3
                4 -> bt4
                5 -> bt5
                6 -> bt6
                7 -> bt7
                8 -> bt8
                9 -> bt9
                else->{
                    bt1
                }
            }
            PlayGame(cellID,buSelect)


    }
*/





