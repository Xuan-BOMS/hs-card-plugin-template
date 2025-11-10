package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [远古谜团](https://hearthstone.huijiwiki.com/wiki/Card/54772)
 * 2费 法术
 * 从你的牌库中抽一张奥秘牌，其法力值消耗减少（2）点
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%ULD_216",
)

class AncientMysteries : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return AncientMysteries()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
