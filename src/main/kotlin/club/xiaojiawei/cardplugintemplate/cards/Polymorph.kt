package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [变形药水](https://hearthstone.huijiwiki.com/wiki/Card/64884)
 * 3费 法术
 * 将所有随从变形成1/1的绵羊
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%BAR_545",
)

class Polymorph : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return Polymorph()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
