package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [哈斯·石酒](https://hearthstone.huijiwiki.com/wiki/Card/104582)
 * 6费 5/4 传说随从
 * 战吼：发现一张奥秘牌。如果你控制一个奥秘，则改为发现两张并置入战场
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%MIS_912",
)

class HasStonebrew : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return HasStonebrew()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
