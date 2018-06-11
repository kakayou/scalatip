# 指出在Scala中何种情况下赋值语句x=y=1是合法的。

```
scala> var x = {}
x: Unit = ()

scala> var y = 4
y: Int = 4

scala> x=y=1
x: Unit = ()

赋值语句的值为Unit类型的，也就是为空，所以直接让x的值为Unit类型的
```
