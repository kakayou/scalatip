# 一个数字如果为正数，则它的signum为1;如果是负数,则signum为-1;如果为0,则signum为0.编写一个函数来计算这个值

```
def signum(num:Int)={
     var r=0
     if(num>0) r=1
     else if(num<0) r= -1
     else r=0
     r
}
```