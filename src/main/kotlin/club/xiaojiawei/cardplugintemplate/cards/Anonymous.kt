package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [匿名线人](https://hearthstone.huijiwiki.com/wiki/Card/90834)
 * 2费 2/1 随从
 * 战吼：下一张奥秘牌费用为0
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%REV_937",
)

class Anonymous : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return Anonymous()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
