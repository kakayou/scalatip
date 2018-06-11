# 计算字符串中所有字母的Unicode代码的乘积。举列来说，“Hello”中所有字符的乘积为9415087488L。

```

"Hello".foreach(ch => {t*=ch.toLong})
```