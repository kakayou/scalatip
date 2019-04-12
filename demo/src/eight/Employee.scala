package eight

/*
 * super.toString 会调用超类Person 的 toString 方法
 */
class Employee extends Person{
  override def toString: String = super.toString + "[salary"+ salary +"]"
}
