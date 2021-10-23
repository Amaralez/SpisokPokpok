package com.example.myapplicationspisokpokpok.domain

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getshoplist(): List<ShopItem>{
      return  shopListRepository.getshoplist()

    }
}