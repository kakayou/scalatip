#扩展类
## 语法
```
class Employee extends Persosn {
       override def toString = getClass.getName + "[name="+ name +"]"   
}

```
## 类型转换

```scala
obj.isInstanceOf[C]
obj.isInstanceOf[C]
classOf[C]
```

## 字段重写
def只能重写另一个def
val 只能重写val 或不带参数的def
var 只能重写一个抽象的var
