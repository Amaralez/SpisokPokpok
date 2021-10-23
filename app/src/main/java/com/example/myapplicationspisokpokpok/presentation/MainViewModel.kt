package com.example.myapplicationspisokpokpok.presentation

import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplicationspisokpokpok.data.ShopListRepositoryImpl
import com.example.myapplicationspisokpokpok.domain.DeleteShopItemUseCase
import com.example.myapplicationspisokpokpok.domain.EditShopItemUseCase
import com.example.myapplicationspisokpokpok.domain.GetShopListUseCase
import com.example.myapplicationspisokpokpok.domain.ShopItem

class MainViewModel: ViewModel() {

    private  val  repository =ShopListRepositoryImpl

   private val getShopListUseCase = GetShopListUseCase(repository)
    private val deleteShopItemUseCase = DeleteShopItemUseCase(repository)
    private val editShopItemUseCase = EditShopItemUseCase(repository)

    val shopList = getShopListUseCase.getshoplist()

//fun getShoplist(){
 //   val list = getShopListUseCase.getshoplist()
  //  shopList.value = list
//}

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopItemUseCase.deleteShopItem(shopItem)
       // getShoplist()
    }
fun changeEnableState(shopItem: ShopItem){

    val newItem = shopItem.copy(enabled = !shopItem.enabled)
editShopItemUseCase.editShopItem(newItem)
    //getShoplist()

}
}