package com.heeyjinny.widgetsradio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.heeyjinny.widgetsradio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //뷰바인딩 추가
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //뷰바인딩 추가
        setContentView(binding.root)

        //라디오그룹 연결
        //첫 번째 파라미터:변경된 라디오그룹 위젯, 두 번째 파라미터:라디오그룹 안에 클릭된 라디오버튼 id
        binding.radioGruop.setOnCheckedChangeListener { radioGroup, i ->
            // 라오버튼 id가 클릭 되었을때 발생하는 이벤트
            when(i){
                //R.id 접두어 : 안드로이드가 리소스를 관리하는 R클래스 생성 후 리소스를 관리하는 id클래스 추가
                R.id.radioApple -> Log.d("Radio","사과 선택")
                R.id.radioBanana -> Log.d("Radio","바나나 선택")
                R.id.radioOrange -> Log.d("Radio","오렌지 선택")
            }

        }

    }
}