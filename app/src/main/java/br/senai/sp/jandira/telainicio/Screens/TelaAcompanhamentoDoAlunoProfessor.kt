package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun acompanhamentoProfessor(modifier: Modifier = Modifier) {
    Column {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Acompanhamento",
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 15.dp)
            )
            Text(
                text = "Insira o código de um aluno para começar a acompanhá-lo",
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraLight,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(40.dp)
            )

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
                onValueChange = { },
                modifier = Modifier
                    .width(330.dp)
                    .height(50.dp),
                shape = RoundedCornerShape(20.dp),
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.Transparent,
                    focusedBorderColor = Color(0xFF666260),
                    unfocusedBorderColor = Color(0xFF666260),
                ),
                placeholder = {
                    Text(
                        text = "XXX-XXX",
                        color = Color.Black,
                        fontSize = 20.sp
                    )
                }
            )

        }
        Spacer(modifier = Modifier.height(20.dp))
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .height(110.dp)
                    .width(340.dp)
                    .drawBehind {
                        // Configurações da sombra
                        val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                        val offsetX = 5f // Deslocamento horizontal da sombra
                        val offsetY = 10f // Deslocamento vertical da sombra
                        val cornerRadius = 30f // Raio dos cantos arredondados

                        // Desenha a sombra sólida com cantos arredondados
                        drawRoundRect(
                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                            topLeft = Offset(
                                -offsetX,
                                offsetY
                            ), // Define o deslocamento da sombra (lateral e para baixo)
                            size = Size(
                                size.width + offsetX * 2, // Aumenta a largura da sombra
                                size.height + offsetY // Aumenta a altura da sombra
                            ), // Tamanho da sombra ajustado
                            cornerRadius = CornerRadius(
                                cornerRadius,
                                cornerRadius
                            ) // Define os cantos arredondados
                        )
                    }
                    .height(60.dp) // Mantém a altura desejada
                    .width(400.dp) // Mantém a largura desejada
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(10.dp)
                    ) // Aplica o fundo com bordas arredondadas
                    .border(
                        1.dp,
                        color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                    )
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 10.dp)
                            .size(60.dp)
                    )
                    Column(
                        modifier = Modifier
                            .height(200.dp)
                            .width(300.dp).padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Suzane Dahora",
                            textAlign = TextAlign.Center, fontSize = 18.sp,
                            modifier = Modifier.padding(top = 10.dp, start = 50.dp)
                        )
                        Text(
                            text = "3º fund2",
                            textAlign = TextAlign.Center, fontSize = 12.sp,
                            modifier = Modifier.padding(start = 90.dp)
                        )
                        Row(
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(135.dp)
                            ) {
                                Text(
                                    text = "Assunto:",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier
                                        .padding(top = 12.dp, start = 46.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.livros),
                                    contentDescription = "",
                                    modifier = Modifier.size(55.dp).padding(top = 30.dp)
                                )

                                Text(
                                    text = "Soma e subtração de números primos",
                                    fontSize = 9.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 45.dp, top = 30.dp)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(125.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.relogio),
                                    contentDescription = "",
                                    modifier = Modifier.size(50.dp).padding(top = 25.dp)
                                )

                                Text(
                                    text = "Última atividade feita há", fontSize = 10.sp,
                                    modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                                )
                                Text(
                                    text = "12 Horas",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 30.dp, start = 40.dp)
                                )
                            }


                        }
                    }
                }


            }

            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .height(110.dp)
                    .width(340.dp)
                    .drawBehind {
                        // Configurações da sombra
                        val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                        val offsetX = 5f // Deslocamento horizontal da sombra
                        val offsetY = 10f // Deslocamento vertical da sombra
                        val cornerRadius = 30f // Raio dos cantos arredondados

                        // Desenha a sombra sólida com cantos arredondados
                        drawRoundRect(
                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                            topLeft = Offset(
                                -offsetX,
                                offsetY
                            ), // Define o deslocamento da sombra (lateral e para baixo)
                            size = Size(
                                size.width + offsetX * 2, // Aumenta a largura da sombra
                                size.height + offsetY // Aumenta a altura da sombra
                            ), // Tamanho da sombra ajustado
                            cornerRadius = CornerRadius(
                                cornerRadius,
                                cornerRadius
                            ) // Define os cantos arredondados
                        )
                    }
                    .height(60.dp) // Mantém a altura desejada
                    .width(400.dp) // Mantém a largura desejada
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(10.dp)
                    ) // Aplica o fundo com bordas arredondadas
                    .border(
                        1.dp,
                        color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                    )
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 10.dp)
                            .size(60.dp)
                    )
                    Column(
                        modifier = Modifier
                            .height(200.dp)
                            .width(300.dp).padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Suzane Dahora",
                            textAlign = TextAlign.Center, fontSize = 18.sp,
                            modifier = Modifier.padding(top = 10.dp, start = 50.dp)
                        )
                        Text(
                            text = "3º fund2",
                            textAlign = TextAlign.Center, fontSize = 12.sp,
                            modifier = Modifier.padding(start = 90.dp)
                        )
                        Row(
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(135.dp)
                            ) {
                                Text(
                                    text = "Assunto:",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier
                                        .padding(top = 12.dp, start = 46.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.livros),
                                    contentDescription = "",
                                    modifier = Modifier.size(55.dp).padding(top = 30.dp)
                                )

                                Text(
                                    text = "Soma e subtração de números primos",
                                    fontSize = 9.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 45.dp, top = 30.dp)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(125.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.relogio),
                                    contentDescription = "",
                                    modifier = Modifier.size(50.dp).padding(top = 25.dp)
                                )

                                Text(
                                    text = "Última atividade feita há", fontSize = 10.sp,
                                    modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                                )
                                Text(
                                    text = "12 Horas",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 30.dp, start = 40.dp)
                                )
                            }


                        }
                    }
                }


            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .height(110.dp)
                    .width(340.dp)
                    .drawBehind {
                        // Configurações da sombra
                        val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                        val offsetX = 5f // Deslocamento horizontal da sombra
                        val offsetY = 10f // Deslocamento vertical da sombra
                        val cornerRadius = 30f // Raio dos cantos arredondados

                        // Desenha a sombra sólida com cantos arredondados
                        drawRoundRect(
                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                            topLeft = Offset(
                                -offsetX,
                                offsetY
                            ), // Define o deslocamento da sombra (lateral e para baixo)
                            size = Size(
                                size.width + offsetX * 2, // Aumenta a largura da sombra
                                size.height + offsetY // Aumenta a altura da sombra
                            ), // Tamanho da sombra ajustado
                            cornerRadius = CornerRadius(
                                cornerRadius,
                                cornerRadius
                            ) // Define os cantos arredondados
                        )
                    }
                    .height(60.dp) // Mantém a altura desejada
                    .width(400.dp) // Mantém a largura desejada
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(10.dp)
                    ) // Aplica o fundo com bordas arredondadas
                    .border(
                        1.dp,
                        color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                    )
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 10.dp)
                            .size(60.dp)
                    )
                    Column(
                        modifier = Modifier
                            .height(200.dp)
                            .width(300.dp).padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Suzane Dahora",
                            textAlign = TextAlign.Center, fontSize = 18.sp,
                            modifier = Modifier.padding(top = 10.dp, start = 50.dp)
                        )
                        Text(
                            text = "3º fund2",
                            textAlign = TextAlign.Center, fontSize = 12.sp,
                            modifier = Modifier.padding(start = 90.dp)
                        )
                        Row(
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(135.dp)
                            ) {
                                Text(
                                    text = "Assunto:",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier
                                        .padding(top = 12.dp, start = 46.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.livros),
                                    contentDescription = "",
                                    modifier = Modifier.size(55.dp).padding(top = 30.dp)
                                )

                                Text(
                                    text = "Soma e subtração de números primos",
                                    fontSize = 9.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 45.dp, top = 30.dp)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(125.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.relogio),
                                    contentDescription = "",
                                    modifier = Modifier.size(50.dp).padding(top = 25.dp)
                                )

                                Text(
                                    text = "Última atividade feita há", fontSize = 10.sp,
                                    modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                                )
                                Text(
                                    text = "12 Horas",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 30.dp, start = 40.dp)
                                )
                            }


                        }
                    }
                }


            }
            Spacer(modifier = Modifier.height(10.dp))
            Box(
                modifier = Modifier
                    .height(110.dp)
                    .width(340.dp)
                    .drawBehind {
                        // Configurações da sombra
                        val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                        val offsetX = 5f // Deslocamento horizontal da sombra
                        val offsetY = 10f // Deslocamento vertical da sombra
                        val cornerRadius = 30f // Raio dos cantos arredondados

                        // Desenha a sombra sólida com cantos arredondados
                        drawRoundRect(
                            color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                            topLeft = Offset(
                                -offsetX,
                                offsetY
                            ), // Define o deslocamento da sombra (lateral e para baixo)
                            size = Size(
                                size.width + offsetX * 2, // Aumenta a largura da sombra
                                size.height + offsetY // Aumenta a altura da sombra
                            ), // Tamanho da sombra ajustado
                            cornerRadius = CornerRadius(
                                cornerRadius,
                                cornerRadius
                            ) // Define os cantos arredondados
                        )
                    }
                    .height(60.dp) // Mantém a altura desejada
                    .width(400.dp) // Mantém a largura desejada
                    .background(
                        Color.White,
                        shape = RoundedCornerShape(10.dp)
                    ) // Aplica o fundo com bordas arredondadas
                    .border(
                        1.dp,
                        color = Color(0xFFD9D9D9),
                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                    )
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "",
                        modifier = Modifier
                            .padding(top = 25.dp, start = 10.dp)
                            .size(60.dp)
                    )
                    Column(
                        modifier = Modifier
                            .height(200.dp)
                            .width(300.dp).padding(start = 10.dp)
                    ) {
                        Text(
                            text = "Suzane Dahora",
                            textAlign = TextAlign.Center, fontSize = 18.sp,
                            modifier = Modifier.padding(top = 10.dp, start = 50.dp)
                        )
                        Text(
                            text = "3º fund2",
                            textAlign = TextAlign.Center, fontSize = 12.sp,
                            modifier = Modifier.padding(start = 90.dp)
                        )
                        Row(
                            modifier = Modifier
                                .height(200.dp)
                                .width(300.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(135.dp)
                            ) {
                                Text(
                                    text = "Assunto:",
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier
                                        .padding(top = 12.dp, start = 46.dp)
                                )
                                Image(
                                    painter = painterResource(id = R.drawable.livros),
                                    contentDescription = "",
                                    modifier = Modifier.size(55.dp).padding(top = 30.dp)
                                )

                                Text(
                                    text = "Soma e subtração de números primos",
                                    fontSize = 9.5.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(start = 45.dp, top = 30.dp)
                                )
                            }
                            Box(
                                modifier = Modifier
                                    .height(100.dp)
                                    .width(125.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.relogio),
                                    contentDescription = "",
                                    modifier = Modifier.size(50.dp).padding(top = 25.dp)
                                )

                                Text(
                                    text = "Última atividade feita há", fontSize = 10.sp,
                                    modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                                )
                                Text(
                                    text = "12 Horas",
                                    fontSize = 12.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(top = 30.dp, start = 40.dp)
                                )
                            }


                        }
                    }
                }


            }

        }

    }
       }




@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun acompanhamentoProfessorPreview() {
    acompanhamentoProfessor()
}