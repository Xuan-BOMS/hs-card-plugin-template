package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [海中向导芬利爵士](https://hearthstone.huijiwiki.com/wiki/Card/27215)
 * 1费 1/3 传说随从
 * 战吼：发现一张基础英雄技能
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%LOE_076",
)

class SirFinleyMrrgglton : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return SirFinleyMrrgglton()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
