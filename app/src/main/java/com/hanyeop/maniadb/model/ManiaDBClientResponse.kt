package com.hanyeop.maniadb.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "rss", strict = false)
data class ManiaDBClientResponse(
    @field:Element(name = "channel")
    var channel: Channel? = null
)

@Root(name = "channel", strict = false)
data class Channel @JvmOverloads constructor(
    @field:ElementList(inline = true)
    var itemList: List<Item>? = null
)

@Root(name = "item", strict = false)
class Item @JvmOverloads constructor(
    @field:Element(name = "title")
    var title: String = "",

    @field:Element(name = "description", required = false)
    var description: String = ""


) {
    override fun toString(): String {
        return "$title"
    }
}

