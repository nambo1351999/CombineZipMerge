package com.phanphuongnam.combinezipmerge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.lifecycle.viewmodel.compose.viewModel
import com.phanphuongnam.combinezipmerge.ui.theme.CombineZipMergeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CombineZipMergeTheme {
                val viewModel = viewModel<MainViewModel>()
                Text(text = viewModel.numberString)

            }
        }
    }
}