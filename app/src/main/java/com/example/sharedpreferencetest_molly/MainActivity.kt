package com.example.sharedpreferencetest_molly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreferencetest_molly.utils.ContextUtil
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        autoLoginCheckBox.setOnCheckedChangeListener { buttonView, isChecked ->
//            체크된 상황을 ContextUtil을 이용해 자동로그인 여부로 저장
            ContextUtil.setAutoLogin(this,isChecked)

//            화면이 만들어진 후 저장된 자동로그인 여부 값을 체크박스에 반영
            autoLoginCheckBox.isChecked = ContextUtil.getAutoLogin(this)
        }
    }
}