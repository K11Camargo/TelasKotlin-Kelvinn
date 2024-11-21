package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable

fun telaChatCMentor(modifier: Modifier = Modifier) {
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
                    .align(alignment = Alignment.CenterHorizontally)
                    .padding(top = 20.dp),
                fontSize = 20.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(100.dp))

        Column(
            modifier = Modifier
                .background(Color(0xff302F2F))
                .height(450.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(100.dp)
//                    .padding(top = 150.dp)
                    .align(alignment = Alignment.CenterHorizontally),
                painter = painterResource(id = R.drawable.usuario),
                contentDescription = "Calabreso"
            )
            Text(
                "Matheus aceitou seu pedido de ajuda, mande mensagem para começar a conversa",
                modifier = Modifier
                    .padding(start = 80.dp),
                color = Color.White,
                fontSize = 15.sp
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(80.dp)
                .background(Color(0xff302F2F))
                .padding(horizontal = 25.dp)
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
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
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
        Column (
            verticalArrangement = Arrangement.Bottom,
            modifier = Modifier
                .fillMaxHeight()
                .padding(bottom = 80.dp),
        ){

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .background(Color(0xff302F2F))
                    .padding(top = 10.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.livro),
                    contentDescription = "livros",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 20.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.caderno),
                    contentDescription = "caderno",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.trofeu),
                    contentDescription = "caderno",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.duvida),
                    contentDescription = "caderno",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 20.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.sinos),
                    contentDescription = "caderno",
                    modifier = Modifier
                        .size(50.dp)
                        .padding(start = 20.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.pontos),
                    contentDescription = "pontos",
                    modifier = Modifier
                        .size(100.dp)
                        .height(100.dp)
                        .padding(start = 60.dp)

                )

            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
private fun telaChatCmentorPreview() {
    telaChatCMentor()
}