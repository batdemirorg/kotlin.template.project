package com.batdemir.template.data.entities

interface RecyclerItem {
    val id: Long
    var isSelected: Boolean
    override fun equals(other: Any?): Boolean
}