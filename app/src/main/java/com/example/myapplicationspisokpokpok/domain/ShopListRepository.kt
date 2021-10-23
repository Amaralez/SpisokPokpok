package com.example.myapplicationspisokpokpok.domain

import android.os.Parcel
import android.os.Parcelable

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem)
    fun getshopItem(shopItemId: Int): ShopItem
    fun getshoplist(): List<ShopItem>
}