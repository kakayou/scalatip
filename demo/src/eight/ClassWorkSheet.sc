/*
/1. Unit  类型表示该类型只有一个值，就是()，编译器允许任何值被替换成()
/2. Nothing 类型没有实例，如空列表Nil 类型就是List[Nothing]
 */
def printAny(x: Any) { println(x)}
def printUnit(x: Unit) { println(x)}
printAny("hello")
printUnit("hello")