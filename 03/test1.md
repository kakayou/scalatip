# 编写一段代码，将a设置为一个n个随机整数的数组，要求随机数介于0（包含）和n(不包含)之间

```
  def getArr(n:Int): Array[Int] = {
    val a = new Array[Int](n)
    val rand = new scala.util.Random()
    for(i <- a) yield rand.nextInt(n)
  }

```