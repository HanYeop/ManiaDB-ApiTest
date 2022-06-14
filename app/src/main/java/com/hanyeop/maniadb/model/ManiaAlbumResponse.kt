package com.hanyeop.maniadb.model

import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

@Root(name = "rss", strict = false)
data class ManiaAlbumResponse(
    @field:Element(name = "channel")
    var channel: Channel2? = null
)

@Root(name = "channel", strict = false)
data class Channel2 @JvmOverloads constructor(

    // 결과 없을 경우 고려 (required = false)
    @field:ElementList(inline = true, required = false)
    var itemList: List<Item2>? = null
)

@Root(name = "item", strict = false)
data class Item2 @JvmOverloads constructor(
    @field:Element(name = "title_short")
    var title: String = "",

    @field:Element(name = "albumtrack")
    var album: Album2? = null,

    @field:Element(name = "albumartists")
    var artist: String? = null,

    @field:Element(name = "image")
    var image: String = ""
)

@Root(name = "albumtrack", strict = false)
data class Album2 @JvmOverloads constructor(
    @field:Element(name = "tracklist")
    var trackList: String = ""
)
