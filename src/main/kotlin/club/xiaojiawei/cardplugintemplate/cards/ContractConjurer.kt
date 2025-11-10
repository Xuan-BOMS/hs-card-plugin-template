package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [契约咒术师](https://hearthstone.huijiwiki.com/wiki/Card/52610)
 * 6费 6/6 随从
 * 如果你控制一个奥秘，召唤一个此随从的复制
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%DAL_603",
)

class ContractConjurer : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return ContractConjurer()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
