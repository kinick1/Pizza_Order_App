package kr.ac.wku.pizza_order_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.ac.wku.pizza_order_app.datas.StoreData

class ViewStoreDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_store_detail)
//        (Serialzable로) 포장되어 넘어온 store 이름표가 붙은 객체 받자. => StoreData형태로 원복하면서 받자
        val storeData=intent.getSerializableExtra("store")as StoreData
    }
}