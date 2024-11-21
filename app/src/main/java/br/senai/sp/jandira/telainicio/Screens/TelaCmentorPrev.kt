package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun chatMentorPrev(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xff302F2F))
    ) {
        Column(
            modifier = Modifier
                .height(60.dp)
                .background(color = Color(0xff302F2F))
                .fillMaxWidth() // Preenche a largura da tela
        ) {
            Text(
                "Chat",
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally),
                fontSize = 20.sp,
                color = Color.White
            )
        }
        Column(
            modifier = Modifier
                .height(400.dp)
                .padding(top = 300.dp)
                .background(Color(0xff302F2F))
                .align(alignment = Alignment.CenterHorizontally)
        ) {
            Text(
                "Converse com nosso\n" +
                        "calabreso para " +
                        "tirar dúvidas superficiais",
                color = Color.White,
                fontSize = 20.sp,
                textAlign = TextAlign.Center
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .background(Color(0xff302F2F))
                .padding(top = 200.dp)
        ) {
            OutlinedTextField(
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "entrar",
                            tint = Color(0xff302F2F)
                        )
                    }
                },
                value = "",
                onValueChange = {},
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color(0xFF666260),
                    focusedBorderColor = Color(0xFF666260),
                    unfocusedBorderColor = Color(0xFF666260),
                ),
                placeholder = {
                    Text(
                        text = "Escreva uma mensagem",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                }
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun chatMentorPreview() {
    chatMentorPrev()
}
