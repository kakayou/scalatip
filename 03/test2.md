# 编写一个循环，将整数数组中相邻的元素置换

```
  def revert(a:Array[Int]) = {
    for(i <- 0 until (a.length - 1,2)){
      val t = a(i)
      a(i) = a(i+1)
      a(i+1) = t
    }
  }
```