package com.dawnling.beaconaar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.keytop.arfindcar.ktui.KTMainActivity;

/**
 * 科拓蓝牙找车aar包调用demo
 * 具体文档在简书草稿
 * create by dawnling in 2019/04/22.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**
                 * 启动sdk首页  必须传入以下参数
                 *
                 * @param context  对象
                 * @param baseUrl  基础请求url：必须以/结尾，sdk固定拼接app-api/…，
                    例如传入https://ts.keytop.cn/fc_test/
                    则SDK内部请求的url为：https://ts.keytop.cn/fc_test/app-api/…
                 * @param lotId  车场id
                 * @param carPlateNum  车牌号
                 */
                KTMainActivity.launch(MainActivity.this, "https://cloud.keytop.cn/fc/", "2513", "闽D9K532");
            }
        });
    }
}
