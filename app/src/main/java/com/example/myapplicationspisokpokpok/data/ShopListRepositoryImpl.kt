package com.example.myapplicationspisokpokpok.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.myapplicationspisokpokpok.domain.ShopItem
import com.example.myapplicationspisokpokpok.domain.ShopListRepository
import java.lang.RuntimeException

object ShopListRepositoryImpl: ShopListRepository {

    private val shopListLD = MutableLiveData<List<ShopItem>>()
    private val shopList = mutableListOf<ShopItem>()
    private var autoIncrementId = 0
    init {
        for (i in 0 until 10){
       val item = ShopItem("Name $i",i,true)
        addShopItem(item)
        }
    }


    override fun addShopItem(shopItem: ShopItem) {
        if(shopItem.id== ShopItem.UNDEFINED_ID){
            shopItem.id = autoIncrementId++
updateList()
        }


        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
        updateList()
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getshopItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getshopItem(shopItemId: Int): ShopItem {
        return  shopList.find { it.id==shopItemId
        }?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getshoplist(): LiveData<List<ShopItem>> {
        return shopListLD
    }
    private fun updateList(){
     shopListLD.value = shopList.toList()
    }
}