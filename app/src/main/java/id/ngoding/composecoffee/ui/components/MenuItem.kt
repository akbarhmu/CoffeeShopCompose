package id.ngoding.composecoffee.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.ngoding.composecoffee.model.Menu
import id.ngoding.composecoffee.model.dummyMenu
import id.ngoding.composecoffee.ui.theme.ComposeCoffeeTheme

@Composable
fun MenuItem(
    menu: Menu,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.width(140.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column {
            Image(
                painter = painterResource(id = menu.image),
                contentDescription = menu.title,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(120.dp)
                    .clip(
                        RoundedCornerShape(8.dp)
                    )
                    .fillMaxWidth()
            )
            Column(
                modifier = Modifier
                    .padding(8.dp),
                horizontalAlignment = Alignment.Start
            ) {
                Text(
                    text = menu.title,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.ExtraBold)
                )
                Text(
                    text = menu.price,
                    style = MaterialTheme.typography.subtitle2.copy(fontWeight = FontWeight.ExtraBold)
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenuItemPreview() {
    ComposeCoffeeTheme {
        MenuItem(menu = dummyMenu.first(), modifier = Modifier.padding(8.dp))
    }
}