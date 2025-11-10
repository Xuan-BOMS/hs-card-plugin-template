package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [法术反制](https://hearthstone.huijiwiki.com/wiki/Card/EX1_287)
 * 3费 法术 - 奥秘
 * 当对手打出一张法术时，抵消其效果
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%EX1_287",
)

class Counterspell : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return Counterspell()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
