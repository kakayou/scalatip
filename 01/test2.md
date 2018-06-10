#计算3的平方根，再求平方，计算这个值离3差多少?

```
scala> scala.math.sqrt(3)
res0: Double = 1.7320508075688772

scala> res0 * res0
res1: Double = 2.9999999999999996

scala> 3-res1
res2: Double = 4.440892098500626E-16
```