# 递归实现

```
def product(s:String):Long={
     if(s.length == 1) return s.charAt(0).toLong
     else s.take(1).charAt(0).toLong * product(s.drop(1))
 }
```