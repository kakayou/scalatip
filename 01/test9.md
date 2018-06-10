#在Scala中如何获取字符串的首字符和尾字符？
```
scala> "Scala"(0)
res15: Char = S
scala> "Scala".take(1)
res16: String = S
scala> "Scala".reverse(0)
res17: Char = a
scala> "Scala".takeRight(1)
res18: String = a
```