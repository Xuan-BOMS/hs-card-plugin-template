package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [乐队经理精英牛头人酋长](https://hearthstone.huijiwiki.com/wiki/Card/104525)
 * 4费 2/2 传说随从
 * 战吼：双方各获得三张随机传说随从牌
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%MIS_709",
)

class EliteTaurenChieftain : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return EliteTaurenChieftain()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
