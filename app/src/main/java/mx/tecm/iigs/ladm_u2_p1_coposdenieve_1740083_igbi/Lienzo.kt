package mx.tecm.iigs.ladm_u2_p1_coposdenieve_1740083_igbi

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.os.CountDownTimer
import android.view.MotionEvent
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class Lienzo(este:MainActivity): View(este) {
    val este = este
    val copos = Array<Copos>(2500,{ Copos(this)})


    val corrutina = GlobalScope.launch {
        var tiempo=0


        while (true){
            este.runOnUiThread {
                invalidate()
            }
            tiempo+=20

            if(tiempo <= 5000){
                delay(40)
                    }else
                delay(5)

        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        c.drawColor(Color.rgb(37,40,80))

        (0..500).forEach {
            copos[it].movercopo()
            copos[it].Pintarcopo(c)
        }

        //IZQ
        p.color = Color.rgb(194,155,97)
        c.drawOval(-100f, 600f, 1600f, 1300f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 4.0f

        p.color = Color.rgb(180, 114, 20)
        c.drawOval(-100f, 600f, 1600f, 1300f, p)


        p.color = Color.rgb(194,155,97)
        p.style = Paint.Style.FILL
        c.drawOval(900f, 500f, 2500f, 1300f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 4.0f

        p.color = Color.rgb(194,155,97)
        p.style = Paint.Style.FILL
        c.drawOval(1500f, 350f, 2500f, 1300f, p)
        p.style = Paint.Style.STROKE
        p.strokeWidth = 4.0f

        p.color = Color.rgb(180, 114, 20)
        c.drawOval(900f, 500f, 2500f, 1300f, p)


        p.color = Color.rgb(180, 114, 20)
        p.style = Paint.Style.FILL
        c.drawRect(500f, 700f, 550f, 800f, p)
        p.color = Color.rgb(32,218,84)
        c.drawOval(450f, 630f, 600f, 720f, p)
        c.drawOval(450f, 560f, 600f, 650f, p)
        c.drawOval(450f, 490f, 600f, 580f, p)

        p.color=Color.rgb(180,114,20)
        p.style=Paint.Style.FILL
        c.drawRect(850f,400f,900f,650f,p)
        p.color = Color.rgb(32,218,84)
        c.drawOval(750f,330f,1010f,470f,p)
        c.drawOval(750f,270f,1010f,410f,p)
        c.drawOval(750f,210f,1010f,350f,p)

        //arbol2
        p.color = Color.rgb(180, 114, 20)
        p.style = Paint.Style.FILL
        c.drawRect(1300f, 600f, 1400f, 750f, p)
        p.color = Color.rgb(32,218,84)
        c.drawOval(1250f, 480f, 1450f, 650f, p)
        c.drawOval(1250f, 380f, 1450f, 570f, p)
        c.drawOval(1250f, 280f, 1450f, 490f, p)

        //casita
        p.color = Color.rgb(238, 97, 123)
        c.drawRect(1650f, 400f, 1950f, 550f, p)
        p.color = Color.BLACK
        c.drawRect(1700f, 470f, 1750f, 550f, p)
        p.color=Color.GRAY
        c.drawRect(1800f, 470f, 1920f, 520f, p)
        p.color = Color.rgb(228,97,238)

        var path= Path()
        path.moveTo(1700f,350f)
        path.lineTo(1900f,350f)
        path.lineTo(2000f,430f)
        path.lineTo(1600f,430f)
        path.lineTo(1700f,350f)
        c.drawPath(path,p)

    }

    /*override fun onTouchEvent(event: MotionEvent): Boolean {
        event.y
        when(event.action){
            MotionEvent.ACTION_UP->{
                if (event.y<1500){
                    (0..copos.size-1).forEach {

                }


            }
        }


        return true
    }*/
}