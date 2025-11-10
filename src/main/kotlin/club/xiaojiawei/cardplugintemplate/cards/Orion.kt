package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [豪宅管家俄里翁](https://hearthstone.huijiwiki.com/wiki/Card/90641)
 * 4费 2/6 传说随从
 * 战吼：抽牌，直到你的手牌中有一张奥秘牌
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%REV_839",
)

class Orion : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return Orion()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
