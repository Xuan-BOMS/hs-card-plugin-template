package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [焚火林地](https://hearthstone.huijiwiki.com/wiki/Card/102616)
 * 2费 法术
 * 对一个随从造成2点伤害。如果其死亡，抽两张牌
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%DEEP_022",
)

class WildfireWoodlands : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return WildfireWoodlands()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
