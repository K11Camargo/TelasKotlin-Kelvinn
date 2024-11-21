package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SuporteProblema(modifier: Modifier = Modifier) {

    var text by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))

        Row {
            Text(
                text = "Central de ajuda",
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
            fontWeight = FontWeight.Medium,
            fontSize = 17.sp
        )

        Spacer(modifier = Modifier.height(125.dp))

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("descreva o problema") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color(0xFFFD9D9D9)
            ),
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(325.dp)
        )
        Spacer(modifier = Modifier.height(60.dp))

        Text(text = "*Agradescemos pelo seu feedback!",
            color = Color.Red,
            fontSize = 15.sp
            )

        Spacer(modifier = Modifier.height(125.dp))

        Button(
            onClick = { /**/ },
            modifier = Modifier
                .width(151.dp)
                .height(49.dp)
                .align(Alignment.End)
                .padding(end = 20.dp),
            colors = ButtonDefaults.buttonColors( containerColor =  Color(0xFFFD9D9D9)),
            shape = RoundedCornerShape(10.dp),

        ) {
                Text("Avançar",
                    fontSize = 15.sp,
                    fontFamily = poppinsFontFamily,
                    color = Color.Black,
                )

        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun SuporteProblemaPreview() {
    SuporteProblema()
}