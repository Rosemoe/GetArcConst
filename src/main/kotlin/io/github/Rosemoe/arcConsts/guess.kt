package io.github.Rosemoe.arcConsts

import java.util.*


fun main(args: Array<String>) {
    val titles = ArcaeaTitles(getResource("songlist.json"))
    println("""
        Arcaea猜歌辅助器-Lxns Bot Guessn
        用法：依次输入已经猜得得几个字符（用空格隔开）然后再输入任意长度不为1的文本
        比如：
        l m o exit
        并回车。
        本工具将会输出可能的歌名
    """.trimIndent())
    val i = Scanner(System.`in`)
    var char: String = i.next()
    val list = mutableListOf<String>()
    do {
        if (char.length == 1) {
            list.add(char)
        }
        char = i.next()
    } while (char.length == 1)
    titles.mapping.values.forEach {
        for (ch in list) {
            if (!it.lowercase().contains(ch))
                return@forEach
        }
        println(it)
    }
}
