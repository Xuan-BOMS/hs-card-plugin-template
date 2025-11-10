package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [困窘的机械师](https://hearthstone.huijiwiki.com/wiki/Card/105607)
 * 2费 2/3 随从
 * 战吼：发现一张奥秘牌，将其置入战场
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%TOY_378t6",
)

class FlustemechanicRatchet : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return FlustemechanicRatchet()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
