package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [异议](https://hearthstone.huijiwiki.com/wiki/Card/90579)
 * 3费 法术 - 奥秘
 * 当对手打出一张法术时，抵消其效果。抽一张牌
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%REV_937",
)

class Objection : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return Objection()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
