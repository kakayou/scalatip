# 映射和元祖
## 映射
映射是键值对偶的集合

---
### 映射迭代

```
for(k,v <- 映射) 处理 k 和 v

```

### 和java互操作

* java 转 scala
```
import scala.collection.JavaConversions.mapAsScalaMap

val scores  scala.collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]
```

* scala 转 java
```

import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._

val attrs = Map(FAMILY -> "Serif", SIZE -> 12)
val font = new java.awt.Font(attrs)
```

## 元祖
元祖是n个对象的集合，并且对象类型可以不同

---

### 元祖访问

```
val t = (1,3.14,"hello")
t._1 //访问第一个元素
```

### zip 操作

