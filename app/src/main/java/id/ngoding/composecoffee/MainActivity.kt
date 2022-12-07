package id.ngoding.composecoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import id.ngoding.composecoffee.model.dummyCategory
import id.ngoding.composecoffee.ui.components.CategoryItem
import id.ngoding.composecoffee.ui.components.SearchBar
import id.ngoding.composecoffee.ui.components.SectionText
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
    Column {
        Banner()
        SectionText(title = stringResource(id = R.string.section_category))
        CategoryRow()
    }
}

@Composable
fun Banner(
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(id = R.drawable.banner),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(160.dp)
        )
        SearchBar()
    }
}

@Composable
fun CategoryRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(dummyCategory, key = { it.textCategory }) { category ->
            CategoryItem(category = category)
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4)
@Composable
fun ComposeCoffeeAppPreview() {
    ComposeCoffeeTheme {
        ComposeCoffeeApp()
    }
}

@Preview(showBackground = true)
@Composable
fun CategoryRowPreview() {
    ComposeCoffeeTheme {
        CategoryRow()
    }
}