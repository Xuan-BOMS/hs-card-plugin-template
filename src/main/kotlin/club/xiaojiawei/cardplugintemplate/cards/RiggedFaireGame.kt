package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [非公平游戏](https://hearthstone.huijiwiki.com/wiki/Card/59578)
 * 3费 法术 - 奥秘
 * 当你的对手打出的随从法力值消耗不少于3时，获得该随从的一个复制
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%SCH_622",
)

class RiggedFaireGame : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return RiggedFaireGame()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
