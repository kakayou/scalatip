package eight
/**
  * 主构造器与类定义交织在一起
  *
  * */
class Person(val name:String) {
  private var privateAge = 0
  def age =privateAge
  def age_=(newValue: Int): Unit ={
    if (newValue > privateAge) privateAge=newValue
  }
  override def toString: String = getClass.getName + "[name="+name+"]"
}
