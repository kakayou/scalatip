# 重复前一个练习，不过这一次生成一个新的值交换过的数组。用for/yield

```
  def revert(a:Array[Int]) = {

    (for(i <- 0 until (a.length - 1,2)){
      yield if(i + 1 < arr.length) Array(a(i + 1),a(i)) else Array(a(i))
    }).flatten.toArray
  }
 ```