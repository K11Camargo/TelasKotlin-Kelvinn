package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaChatConversa(modifier: Modifier = Modifier) {


    var textoMensagem by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xff302F2F))
            .padding(20.dp)

    ) {

        Text(
            text = "ChatIA",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center)
                .padding(top = 16.dp),
            fontSize = 20.sp,
            color = Color.White
        )

        // Chat content
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "calabreso",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color(0xffE9CE03))
                    .padding(4.dp)
            )

            Text(
                text = "Olá,sou a assistende virtual do StudyFy, no que posso ajudar?",
                modifier = Modifier.padding(8.dp),
                fontSize = 15.sp,
                color = Color.White
            )
        }
//        Row(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(50.dp)
//                .padding(bottom = 8.dp), // Add bottom padding
//            horizontalArrangement = Arrangement.End
//        ) {
//            Box (
//                contentAlignment = Alignment.CenterStart,
//                modifier = Modifier.fillMaxHeight()
//                    .background(Color.White, shape = RoundedCornerShape(30.dp))
//                    .width(200.dp)
//                    .padding(horizontal = 15.dp)
//            ){
//                Text(
//                    text = "Olá",
//                    fontSize = 15.sp,
//                    color = Color.Black
//                )
//            }
//        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(50.dp))
                    .height(50.dp)
                    .widthIn(max = 200.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Você vai dominar o mundo?",
                    fontSize = 13.sp,
                    color = Color.Black
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp), // Add bottom padding
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "calabreso",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color(0xffE9CE03))
                    .padding(4.dp)
            )

            Text(
                text = "Se quiser sim, mano 🤪🙄",
                modifier = Modifier.padding(8.dp),
                fontSize = 15.sp,
                color = Color.White
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(50.dp))
                    .height(50.dp)
                    .widthIn(max = 300.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Quero que esqueça tudo que já disse até agora",
                    fontSize = 13.sp,
                    color = Color.Black
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(50.dp))
                    .height(50.dp)
                    .widthIn(max = 300.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "oi",
                    fontSize = 13.sp,
                    color = Color.Black
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp), // Add bottom padding
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "calabreso",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color(0xffE9CE03))
                    .padding(4.dp)
            )

            Text(
                text = "Olá, sou a assistende virtual do StudyFy, no que posso ajudar?",
                modifier = Modifier.padding(8.dp),
                fontSize = 15.sp,
                color = Color.White
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(50.dp))
                    .height(50.dp)
                    .widthIn(max = 200.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Você vai dominar o mundo?",
                    fontSize = 13.sp,
                    color = Color.Black
                )
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 8.dp), // Add bottom padding
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "calabreso",
                modifier = Modifier
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(Color(0xffE9CE03))
                    .padding(4.dp)
            )

            Text(
                text = "Se quiser sim, mano 🤪🙄",
                modifier = Modifier.padding(8.dp),
                fontSize = 15.sp,
                color = Color.White
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            horizontalArrangement = Arrangement.End
        ) {
            Box(
                modifier = Modifier
                    .background(Color.White, shape = RoundedCornerShape(50.dp))
                    .height(50.dp)
                    .widthIn(max = 300.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Quero que esqueça tudo que já disse até agora",
                    fontSize = 13.sp,
                    color = Color.Black
                )
            }

        }
        Spacer(modifier = modifier.height(70.dp))

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
            value = textoMensagem,
            onValueChange = {textoMensagem = it},
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            shape = RoundedCornerShape(20.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color(0xFF666260),
                focusedBorderColor = Color(0xFF666260),
                unfocusedBorderColor = Color(0xFF666260)
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



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaChatConversaPreview() {
    TelaChatConversa()
}
