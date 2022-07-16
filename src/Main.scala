
import math.Pi
object Main {
  def area(r:Int) =Pi *r*r

  def tempconv(t:Double)=(t* 1.8000 )+ 32.00

  def volume(a:Int)=(4*Pi*a*a*a)/3

  def discount(p:Double)=p*0.4
  def shippingCost(copies: Int)=if(copies<=50) 3*copies else (0.75*(copies-50))+(3*50)
  def bookPrice(copies:Int)=(24.95-discount(24.95))*copies+shippingCost(copies)

  def runtime(easyPace:Int,Tempo:Int)=easyPace*8+Tempo*7

  def main(args: Array[String]): Unit = {
    println("Area: "+area(5))
    println("Temperature in Fahrenheit: "+tempconv(35))
    println("Volume: "+volume(5))
    println("Total wholesale cost for 60 copies: "+bookPrice(60))
    var totRuntime:Int=runtime(2,0)+runtime(0,3)+runtime(2,0)
    println("Total running time = "+totRuntime+" minutes")
  }
}