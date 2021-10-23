package com.example.myapplicationspisokpokpok.domain

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {
    fun getshoplist(): LiveData<List<ShopItem>>{
      return  shopListRepository.getshoplist()

    }
}