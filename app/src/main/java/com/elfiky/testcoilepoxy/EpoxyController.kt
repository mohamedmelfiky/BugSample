package com.elfiky.testcoilepoxy

import com.airbnb.epoxy.TypedEpoxyController

class EpoxyController : TypedEpoxyController<List<Data>>() {

    override fun buildModels(data: List<Data>?) {
        data?.forEach { item ->
            customView {
                id(item.id)
                data(item.image)
            }
        }
    }
}