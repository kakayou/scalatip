#模式匹配


##模式变量可能与常量冲突
变量一般小写开头，常量一般大写开头，如果有小写开头的常量，要把它包在反引号中
```
import java.io.File._
str match {
    case `pathSeparator` => ...
    ...
}
```
