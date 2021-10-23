package com.example.myapplicationspisokpokpok.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getshopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getshopItem(shopItemId)
    }


}