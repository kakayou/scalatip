# 给定一个整数数组，产生一个新的数组，包含元数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列
```
 def reorderArray(arr:Array[Int]):Array[Int]={
     val a = ArrayBuffer[Int]()
     val b = ArrayBuffer[Int]()
     arr.foreach(arg => if(arg > 0) a += arg else b += arg)
     a ++= b
     a.toArray
 }
```