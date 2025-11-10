package club.xiaojiawei.cardplugintemplate.cards

import club.xiaojiawei.hsscriptcardsdk.CardAction
import club.xiaojiawei.hsscriptcardsdk.bean.War

/**
 * [盛装歌手](https://hearthstone.huijiwiki.com/wiki/Card/90653)
 * 1费 1/1 随从
 * 战吼：每有一张奥秘牌，获得+1/+1
 * @author 玄
 * @date 2025/11/10
 */
private val cardIds = arrayOf(
    "%REV_514",
)

class GrandFinale : CardAction.DefaultCardAction() {

    override fun createNewInstance(): CardAction {
        return GrandFinale()
    }

    override fun getCardId(): Array<String> {
        return cardIds
    }
}
