package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily

@Composable
fun Suporte(modifier: Modifier = Modifier) {

    Column(modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(text = "Central de ajuda",
                fontFamily = poppinsFontFamily,
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(60.dp))


            Image(painter = painterResource(R.drawable.calabreso2),
                contentDescription = "calabreso",
                modifier = Modifier
                    .size(120.dp)
                )

        Text(text = "Como podemos ajudar?",
            fontFamily = poppinsFontFamily,
            fontWeight = FontWeight.Medium
            )

        Spacer(modifier = Modifier.height(30.dp))

        Column {
            
            Box(modifier = Modifier
                .width(312.dp)
                .height(48.dp)
                .background(
                    color = Color(0xFFFD9D9D9),
                    shape = RoundedCornerShape(20.dp)
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            Box(modifier = Modifier
                .width(312.dp)
                .height(48.dp)
                .background(
                    color = Color(0xFFFD9D9D9),
                    shape = RoundedCornerShape(20.dp)
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            Box(modifier = Modifier
                .width(312.dp)
                .height(48.dp)
                .background(
                    color = Color(0xFFFD9D9D9),
                    shape = RoundedCornerShape(20.dp)
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            Box(modifier = Modifier
                .width(312.dp)
                .height(48.dp)
                .background(
                    color = Color(0xFFFD9D9D9),
                    shape = RoundedCornerShape(20.dp)
                )
            )
        }

        Spacer(modifier = Modifier.height(60.dp))

        Button(
            onClick = { /**/ },
            modifier = Modifier
                .width(151.dp)
                .height(49.dp),
            colors = ButtonDefaults.buttonColors( containerColor =  Color(0xFFFD9D9D9)),
            shape = RoundedCornerShape(15.dp)
        ) {
            Row {
                Image(painter = painterResource(R.drawable.faleconosco),
                    contentDescription = "fale conosco",
                    modifier = Modifier
                        .size(20.dp)
                    )
                Text("Fale conosco",
                    fontSize = 10.sp,
                    fontFamily = poppinsFontFamily,
                    color = Color.Black,
                    )
            }

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SuportePreview() {
    Suporte()
}