# GetArcConst
* 获取Arcaea谱面定数的工具
* Lxns Bot Guessn 猜歌辅助工具(guess.kt)
现在的版本: Arcaea 3.7.0
## 用法
### 难度说明 
使用了Arcaea的方式表示难度   
|难度|数值|
| --- | --- |
|Past|0|  
|Present|1|  
|Future|2|  
|Beyond|3|  
### 查询代码
* 使用songId查询      
注意：区分大小写
```Kotlin
val titles = ArcaeaTitles(getResource("songlist.json"))
val consts = ArcaeaConstants(getResource("constantsFromWiki.txt"))
println(consts.queryForTitle(titles.queryForId("melodyoflove"), 2))
```
* 使用title查询     
注意：不区分大小写
```Kotlin
val consts = ArcaeaConstants(getResource("constantsFromWiki.txt"))
println(consts.queryForTitle("A wandering melody of love", 2))
```
## 升级 `constantsFromWiki.txt`
* 点 [这里](https://wiki.arcaea.cn/index.php?title=%E5%AE%9A%E6%95%B0%E8%AF%A6%E8%A1%A8&action=edit) 并且复制显示的 **wiki源代码**.   
* 覆盖`constantsFromWiki.txt`的内容
## 升级 `songlist.json`
* 下载最新的Arcaea
* 以zip方式打开
* 转到 `assets/songs`
* 复制文件 `songlist`
* 覆盖 `songlist.json` 的内容
