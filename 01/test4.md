#Scala允许你用数字去乘字符串——试一下“crazy”*3。在Scaladoc中如何找到这个操作？
```
scala> "crazy"*3
res3: String = crazycrazycrazy
“*”是字符串的一个方法，首先是一个String，所以直接查找StringOps类，然后搜索“*”
```
