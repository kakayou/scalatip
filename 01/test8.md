#创建随机文件的方式之一是生成一个随机的BigInt,然后将他转换成三十六进制，输出类似“qsnvbevtomcj38o06kul”这样的字符串，查阅scaladoc，找到实现该逻辑的办法。（首先要导入BigInt和Random）

```
scala> BigInt(Random.nextInt).toString(36)
res7: String = z6gtom
```