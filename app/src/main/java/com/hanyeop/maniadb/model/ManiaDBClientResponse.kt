package com.hanyeop.maniadb.model

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "rss")
data class ManiaDBClientResponse(

    @Element(name = "channel")
    val maniaDbData: ManiaDbData?
)

@Xml(name = "channel")
data class ManiaDbData(

    @PropertyElement(name = "title")
    val title: String
//    @Element(name = "item")
//    val tracks: List<ManiaDbTrackData>
)
//
//@Xml(name = "item")
//data class ManiaDbTrackData(
//
//    @PropertyElement(name = "title")
//    val title: String,
//    @Element(name = "maniadb:album")
//    val album: ManiaDbAlbum
//)
//
//@Xml(name = "maniadb:album")
//data class ManiaDbAlbum(
//
//    @PropertyElement(name = "image")
//    val imageUrl: String
//)
