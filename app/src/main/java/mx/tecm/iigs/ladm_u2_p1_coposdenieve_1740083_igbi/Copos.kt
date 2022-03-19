package mx.tecm.iigs.ladm_u2_p1_coposdenieve_1740083_igbi

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
class Copos(l:Lienzo){

    var l=l

    var x=0f
    var y=0f
    var tam=0f

    init {
        x=(Math.random()*2100).toFloat()
        y=((Math.random()*2000)*-1).toFloat()
        tam=((Math.random()*5)+5).toFloat()
    }

    fun movercopo(){
        y+=tam
        if (y>1000f)y=-100f
    }
    fun Pintarcopo(c:Canvas){
        val p=Paint()
        p.color=Color.WHITE
        c.drawCircle(x,y,tam,p)
    }
}