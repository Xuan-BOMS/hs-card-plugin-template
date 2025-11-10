package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [寒冰屏障](https://hearthstone.huijiwiki.com/wiki/Card/278)
 * 3费 法术 - 奥秘
 * 当你的英雄受到攻击时，获得8点护甲
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%EX1_289",
)

class IceBarrier : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return IceBarrier()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
