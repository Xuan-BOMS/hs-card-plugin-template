package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [对空奥术法师](https://hearthstone.huijiwiki.com/wiki/Card/53978)
 * 2费 2/3 随从
 * 每当一个奥秘在你的回合被触发后，对所有敌方随从造成2点伤害
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%ULD_238",
)

class ArcaneFlakmage : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return ArcaneFlakmage()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
