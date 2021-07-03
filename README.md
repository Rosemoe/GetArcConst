# GetArcConst
A library to get Arcaea constants for songId or song title   
Current version: Arcaea 3.6.4
## Usage
### Tip of Difficulties
There are several difficulties for every song.   
We follow Arcaea's way to present them in our project.   
|Difficulty|Difficulty Integer|
| --- | --- |
|Past|0|  
|Present|1|  
|Future|2|  
|Beyond|3|  
### Query code
* Query with songId   
Note: songId is case-sensitive
```Kotlin
val titles = ArcaeaTitles(getResource("songlist.json"))
val consts = ArcaeaConstants(getResource("constantsFromWiki.txt"))
println(consts.queryForTitle(titles.queryForId("melodyoflove"), 2))
```
* Query with song title   
Note: title is case-insensitive
```Kotlin
val consts = ArcaeaConstants(getResource("constantsFromWiki.txt"))
println(consts.queryForTitle("A wandering melody of love", 2))
```
## How to get updated `constantsFromWiki.txt`
Click [here](https://wiki.arcaea.cn/index.php?title=%E5%AE%9A%E6%95%B0%E8%AF%A6%E8%A1%A8&action=edit) and copy the shown **wiki source code**.   
Replace the content in `constantsFromWiki.txt` with your copied content.
## How to get updated `songlist.json`
* Download newest game installation package (.apk)
* Rename it with suffix '.zip'
* Open the package and turn to `assets/songs`
* Copy the content of the file named `songlist`
* Replace the content in `songlist.json` with your copied content
