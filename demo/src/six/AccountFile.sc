/***
  * 1.类和伴生对象可以相互访问私有属性，必须在同一个文件中
  *
  *
  *
  *
  */


class Account {
  val id = Account.newUniqueNumber()

}
object Account {
  private var lastNumber =0
  def newUniqueNumber() = {lastNumber+=1;lastNumber}

}
