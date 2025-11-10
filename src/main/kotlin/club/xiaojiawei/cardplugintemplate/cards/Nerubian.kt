package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [尼鲁巴蛛网领主](https://hearthstone.huijiwiki.com/wiki/Card/42783)
 * 2费 2/4 随从
 * 需要弃牌才能打出此牌
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%KAR_026",
)

class Nerubian : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return Nerubian()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
