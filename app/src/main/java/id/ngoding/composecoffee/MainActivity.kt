package id.ngoding.composecoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import id.ngoding.composecoffee.ui.theme.ComposeCoffeeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCoffeeTheme {
                ComposeCoffeeApp()
            }
        }
    }
}

@Composable
fun ComposeCoffeeApp() {

}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun ComposeCoffeeAppPreview() {
    ComposeCoffeeTheme {
        ComposeCoffeeApp()
    }
}