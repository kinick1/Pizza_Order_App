package kr.ac.wku.pizza_order_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bumptech.glide.Glide
import kr.ac.wku.pizza_order_app.databinding.ActivityViewStoreDetailBinding
import kr.ac.wku.pizza_order_app.datas.StoreData

class ViewStoreDetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityViewStoreDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_view_store_detail)

//        (Serialzable로) 포장되어 넘어온 store 이름표가 붙은 객체 받자. => StoreData 형태로 원복 하면서 받자.
//        as : 우리가 임의로 만든 클래스로 캐스팅
        val storeData = intent.getSerializableExtra("store") as StoreData

        Glide.with(this).load(storeData.logoURL).into(binding.imgLogo)
        binding.txtStoreName.text = storeData.name
        binding.txtPhoneNum.text = storeData.phoneNum

    }
}