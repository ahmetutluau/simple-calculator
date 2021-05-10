package com.ahmetutlu.basiccalculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number1:Int?=null
    var number2:Int?=null
    var result:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sum (view: View){
         number1 = editText1.text.toString().toIntOrNull()
         number2 = editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            resultText.text="Error!"
        }else{ result= number1!! + number2!!

            resultText.text="Result:${result}"
        }




    }
    fun sub(view: View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            resultText.text="Error!"
        }else{ result= number1!! - number2!!

            resultText.text="Result:${result}"
        }

    }
    fun multiply(view: View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            resultText.text="Error!"
        }else{ result= number1!! * number2!!

            resultText.text="Result:${result}"
        }

    }
    fun div(view: View){
        number1 = editText1.text.toString().toIntOrNull()
        number2 = editText2.text.toString().toIntOrNull()
        if(number1== null || number2==null){
            resultText.text="Error!"
        }else if (number1==0 || number2 ==0){
            resultText.text="∞"
        }
        else{ result= number1!! / number2!!

            resultText.text="Result:${result}"
        }

    }
}