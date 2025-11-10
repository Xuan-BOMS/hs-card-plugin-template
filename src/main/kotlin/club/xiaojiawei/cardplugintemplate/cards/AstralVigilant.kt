package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [星域戒卫](https://hearthstone.huijiwiki.com/wiki/Card/105518)
 * 1费 1/2 随从
 * 战吼：如果你的手牌中有奥秘牌，获得+1攻击力
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%TOY_378",
)

class AstralVigilant : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return AstralVigilant()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
