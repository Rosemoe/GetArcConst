import io.github.Rosemoe.arcConsts.ArcaeaConstants
import io.github.Rosemoe.arcConsts.ArcaeaTitles
import io.github.Rosemoe.arcConsts.getResource

fun main() {
    val titles = ArcaeaTitles(getResource("songlist.json"))
    val consts = ArcaeaConstants(getResource("constantsFromWiki.txt"))
    println(consts.queryForTitle(titles.queryForId("melodyoflove"), 2))
}