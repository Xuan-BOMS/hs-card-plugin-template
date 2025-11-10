package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [火焰结界](https://hearthstone.huijiwiki.com/wiki/Card/53946)
 * 3费 法术 - 奥秘
 * 在对手回合结束后，对所有敌方随从造成3点伤害
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%ULD_433",
)

class FlameWard : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return FlameWard()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
