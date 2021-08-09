object Cipher extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def encrypt=(c:Char,key:Int,a:String)=>
      a((a.indexOf(c.toUpper)+key)%a.size)
  
    def decrypt=(c:Char,key:Int,a:String)=>
      a((if(((a.indexOf(c.toUpper)-key)%a.size)>0) ((a.indexOf(c.toUpper)-key)%a.size) else ((a.size)+(a.indexOf(c.toUpper)-key))))
  
    def cipher=(algo:(Char,Int,String)=>
      Char,s:String,key:Int,a:String)=>
      s.map(algo(_,key,a))
  
}

