package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [活化龙息](https://hearthstone.huijiwiki.com/wiki/Card/55418)
 * 3费 法术
 * 对所有敌方随从造成1点伤害，你的手牌中每有一张奥秘牌，伤害值+1
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%MIS_918",
)

class AnimatedAvalanche : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return AnimatedAvalanche()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
