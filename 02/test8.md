# 编写一个函数product(s:String)，计算前面练习中提到的乘积

```
def product(s:String) = {
     var t:Long = 1
     for(i <- s){
     t *= i.toLong
     }
     t
     }
```