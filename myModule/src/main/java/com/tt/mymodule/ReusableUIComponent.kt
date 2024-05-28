package com.tt.mymodule

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.tt.mymodule.presentation.viewModel.ProductViewModel

@Composable
fun ProductScreen(viewModel: ProductViewModel = hiltViewModel()) {

    val context = LocalContext.current
    val products by viewModel.products.collectAsState()

    Column(modifier = Modifier.background(color = Color.Black).statusBarsPadding()) {

        LazyColumn {
            items(products) { product ->
                LabelView(product.title) {
                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}

@Composable
fun LabelView(param: String, onClick: (param: String) -> Unit) {
    Button(colors = ButtonDefaults.buttonColors(
        backgroundColor = Color.DarkGray
    ), modifier = Modifier
        .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
        .fillMaxWidth(), onClick = { onClick(param) }) {
        Text(
            text = param,
            style = MaterialTheme.typography.body1,
            maxLines = 1,
            color = Color.White,
            fontSize = 14.sp
        )
    }
}
