package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [暗金教水晶侍女](https://hearthstone.huijiwiki.com/wiki/Card/104592)
 * 6费 6/6 随从
 * 战吼：如果你控制一个奥秘，发现一张法术牌。重复此操作
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%MIS_104",
)

class CrystalSmith : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return CrystalSmith()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
