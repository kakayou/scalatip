# 编写一段代码，产出数组中的所有值，去掉重复项。(提示：查看Scaladoc)

```
def distinctArray(arr:Array[Int]):Array[Int]={
  val t = arr.toBuffer
  t.distinct.toArray
}
```