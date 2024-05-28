package com.tt.presidio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.tt.mymodule.ProductScreen
import com.tt.mymodule.presentation.viewModel.ProductViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyScreenContent()
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    MaterialTheme {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            content()
        }
    }
}

@Composable
fun MyScreenContent(viewModel: ProductViewModel = hiltViewModel()) {
    Column {
        ProductScreen(viewModel)
    }
}

//@Composable
//fun ProductScreen(viewModel: ProductViewModel = hiltViewModel()) {
//
//    val context = LocalContext.current
//    val products by viewModel.products.collectAsState()
//
//    Column(modifier = Modifier.background(color = Color.Black).statusBarsPadding()) {
//
//        LazyColumn {
//            items(products) { product ->
//                LabelView(product.title) {
//                    Toast.makeText(context, it, Toast.LENGTH_SHORT).show()
//                }
//            }
//        }
//    }
//
//}


//@Composable
//fun LabelView(param: String, onClick: (param: String) -> Unit) {
//    Button(colors = ButtonDefaults.buttonColors(
//        containerColor = Color.DarkGray), modifier = Modifier
//        .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
//        .fillMaxWidth(), onClick = { onClick(param) }) {
//        Text(
//            text = param,
//            style = MaterialTheme.typography.titleLarge,
//            maxLines = 1,
//            color = Color.White,
//            fontSize = 14.sp
//        )
//    }
//}