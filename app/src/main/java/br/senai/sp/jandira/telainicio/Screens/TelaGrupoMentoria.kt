package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Label
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telainicio.R

fun DropdownMenuItem(onClick: () -> Unit, interactionSource: @Composable () -> Unit) {

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaGrupoMentoria(controleDeNavegacao: NavHostController? = null) {

    var atividades = remember { mutableStateOf(false) }
    var membros = remember { mutableStateOf(false) }
    var duvidas = remember { mutableStateOf(false) }
    var selectedBox by remember { mutableStateOf(null) }

    var barraVisivel by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .height(802.dp)
                .padding(horizontal = 20.dp)
                .background(Color.White)
        ) {
            // Título
            Box(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .height(50.dp)
                    .width(200.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    color = Color(0xFF302F2F),
                    text = "Grupo de mentoria",
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .padding(bottom = 20.dp)
                )
            }

            Spacer(modifier = Modifier.height(50.dp))
            // Row com o card quadrado e descrição
            Row(
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xFFE9CE03) // Cor da sombra sólida
                            val offsetY = 15f // Deslocamento no eixo Y
                            val cornerRadius = 20f // Raio dos cantos arredondados

                            // Desenha a sombra sólida com cantos arredondados
                            drawRoundRect(
                                color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                topLeft = Offset(0f, offsetY), // Define o deslocamento da sombra
                                size = Size(
                                    size.width,
                                    size.height
                                ), // Tamanho da sombra igual ao da Column
                                cornerRadius = CornerRadius(
                                    cornerRadius,
                                    cornerRadius
                                ) // Define os cantos arredondados
                            )
                        }
                        .border(
                            width = 1.dp, // Largura da borda
                            color = Color(0xFFE9CE03), // Cor da borda
                            shape = RoundedCornerShape(10.dp) // O mesmo shape para a borda
                        )
                        .fillMaxHeight()
                        .width(130.dp)
                        .background(Color(0xFFFEE101), shape = RoundedCornerShape(10.dp))
                ) {
                    Image(
                        modifier = Modifier
                            .size(80.dp),
                        painter = painterResource(id = R.drawable.usuario),
                        contentDescription = "Mascote"
                    )
                    Text(
                        text = "membros 18/30",
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    ) // Mudando a cor do texto para branco
                }
                Column(
                    modifier = Modifier
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Descrição",
                        fontWeight = FontWeight.Bold
                    )
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .drawBehind {
                                // Configurações da sombra
                                val shadowColor = Color(0xFFD9D9D9) // Cor da sombra sólida
                                val offsetY = 15f // Deslocamento no eixo Y
                                val cornerRadius = 20f // Raio dos cantos arredondados

                                // Desenha a sombra sólida com cantos arredondados
                                drawRoundRect(
                                    color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                    topLeft = Offset(
                                        0f,
                                        offsetY
                                    ), // Define o deslocamento da sombra
                                    size = Size(
                                        size.width,
                                        size.height
                                    ), // Tamanho da sombra igual ao da Column
                                    cornerRadius = CornerRadius(
                                        cornerRadius,
                                        cornerRadius
                                    ) // Define os cantos arredondados
                                )
                            }
                            .height(120.dp)
                            .background(Color.White, shape = RoundedCornerShape(10.dp))
                            .border(
                                1.dp,
                                color = Color(0xFFD9D9D9),
                                shape = RoundedCornerShape(5.dp)
                            )

                    ) {
                        Text(
                            "wsdsd sds dewfefnj fnierf uhfhef efeufhuefe \nfheufh  sjds hsdhsjd \njhjfsjf sfhsjhfj h jshf jsh djs\n jh sh jhshd jshdjsh d ",
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 10.dp, top = 10.dp)
                        )
                    }

                }
            }

            Row(
                modifier = Modifier
                    .align(alignment = Alignment.Start)
                    .padding(top = 30.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.iconementoria),
                    contentDescription = "Mentor Image",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Mentor do grupo", fontWeight = FontWeight.Bold, fontSize = 15.sp)

            }
            Spacer(modifier = Modifier.height(10.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween

            ) {


            }
            Column(
                modifier = Modifier
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

                    Box(modifier = Modifier.size(60.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.usuario),
                            contentDescription = "usuario",
                            modifier = Modifier
                                .size(60.dp)
                                .padding(start = 15.dp)
                                .width(20.dp)
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Box() {
                        Text(
                            text = "Nome do mentor",
                            modifier = Modifier
                                .padding(start = 10.dp, top = 10.dp),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = ("20 pessoas"),
                            modifier = Modifier
                                .padding(top = 24.dp, start = 10.dp),
                            fontSize = 14.sp
                        )

                    }

                    Box(


                        modifier = Modifier
                            .size(160.dp)
                            .padding(start = 20.dp)
                    ) {


                        Image(
                            painter = painterResource(id = R.drawable.linha),
                            contentDescription = "linha",
                            modifier = Modifier
                                .height(60.dp)
                                .width(80.dp)
                                .padding(start = 2.dp, top = 10.dp, bottom = 10.dp),
                        )
                        Text(
                            "4.5",
                            modifier = Modifier
                                .padding(top = 20.dp)
                                .align(Alignment.TopStart),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            "(254 avaliações)",
                            modifier = Modifier
                                .padding(top = 30.dp, start = 50.dp)
                                .align(Alignment.TopStart),
                            fontSize = 10.sp
                        )
                        Image(
                            painter = painterResource(id = R.drawable.estrelas),
                            contentDescription = "teste",
                            modifier = Modifier
                                .size(90.dp) // Ajuste o tamanho conforme necessário
                                .align(Alignment.Center)
                                .padding(
                                    bottom = 20.dp,
                                    start = 30.dp
                                ) // Tente alinhar ao centro para ver se é exibido corretamente
                        )
                    }


                }
            }
            Spacer(modifier = Modifier.height(30.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(25.dp) // Ajuste o valor para aumentar ou diminuir o espaço
            ) {
                Box(
                    modifier = Modifier
//                        .background(Color(0xffFFF28A))
                        .height(46.dp)
                        .background(
                            if (selectedBox == "membros") Color(0xffFFF28A) else Color(
                                0xfffE9CE03
                            ), shape = RoundedCornerShape(10.dp)
                        )
                        .width(100.dp)
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xfFFF28A) // Cor da sombra sólida
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
                            Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp)
                        ) // Aplica o fundo com bordas arredondadas
                        .border(
                            1.dp,
                            color = Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                        )
                        .clickable {
                            atividades.value = false
                            duvidas.value = false
                            membros.value = true
                            selectedBox = null
                        },
                    contentAlignment = Alignment.Center


                ) {
                    Text(text = "MEMBROS", fontWeight = FontWeight.ExtraBold)
                }

                Box(
                    modifier = Modifier
//                        .background(Color(0xFFFEE101))
                        .background(
                            if (selectedBox == "Atividades") Color(0xffFFF28A) else Color(
                                0xfffE9CE03
                            ), shape = RoundedCornerShape(10.dp)
                        )
                        .height(46.dp)
                        .width(100.dp)
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xfffE9CE03) // Cor da sombra sólida
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
                            Color(0xFFFEE101),
                            shape = RoundedCornerShape(10.dp)
                        ) // Aplica o fundo com bordas arredondadas
                        .border(
                            1.dp,
                            color = Color(0xFFFEE101),
                            shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                        )
                        .clickable {
                            atividades.value = true
                            duvidas.value = false
                            membros.value = false
                            selectedBox = null
                        },

                    contentAlignment = Alignment.Center
                ) {
                    Text(text = "ATIVIDADES", fontWeight = FontWeight.ExtraBold)
                }

                Box(
                    modifier = Modifier
//                        .background(Color(0xffFFF28A), shape = RoundedCornerShape(10.dp))
                        .background(
                            if (selectedBox == "Outra") Color(0xffFFF28A) else Color(
                                0xfffE9CE03
                            ), shape = RoundedCornerShape(10.dp)
                        )
                        .height(46.dp)
                        .width(100.dp)
                        .drawBehind {
                            // Configurações da sombra
                            val shadowColor = Color(0xfFFF28A) // Cor da sombra sólida
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
                            Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp)
                        ) // Aplica o fundo com bordas arredondadas
                        .border(
                            1.dp,
                            color = Color(0xffFFF28A),
                            shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
                        )
                        .clickable {
                            atividades.value = false
                            duvidas.value = true
                            membros.value = false
                            selectedBox = null

                        },
                    contentAlignment = Alignment.Center


                ) {
                    Text(text = "DUVIDA", fontWeight = FontWeight.ExtraBold)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Column(
                modifier = Modifier
                    .background(Color.White)
                    .heightIn(min = 230.dp, max = 315.dp)  // Define a altura mínima
                    .fillMaxWidth()
                    .border(BorderStroke(1.dp, Color(0xffD9D9D9)))
            ) {
                if (atividades.value == true) {

                    Row(
                        modifier = Modifier
                            .background(Color(0xFFFFFFFF))
                            .height(60.dp)
                            .width(400.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .width(220.dp)
                                .background(Color.White, RoundedCornerShape(10.dp))
                                .drawBehind {
                                    // Configurações da sombra
                                    val shadowColor = Color(0xFFD9D9D9) // Cor da sombra
                                    val offsetX = 5f // Deslocamento horizontal da sombra
                                    val offsetY = 5f // Deslocamento vertical da sombra
                                    val cornerRadius = 30f // Raio dos cantos arredondados

                                    // Desenha a sombra com cantos arredondados
                                    drawRoundRect(
                                        color = shadowColor.copy(alpha = 0.8f), // Define a cor e transparência da sombra
                                        topLeft = Offset(
                                            -offsetX,
                                            -offsetY
                                        ), // Desloca a sombra para cima e para os lados
                                        size = Size(
                                            size.width + offsetX * 2, // Aumenta a largura da sombra
                                            size.height + offsetY * 2 // Aumenta a altura para cobrir tanto em cima quanto embaixo
                                        ),
                                        cornerRadius = CornerRadius(
                                            cornerRadius,
                                            cornerRadius
                                        ) // Define os cantos arredondados
                                    )
                                }
                                .height(40.dp)
                                .background(Color.White, shape = RoundedCornerShape(10.dp))
                                .padding(horizontal = 10.dp)
                                .border(
                                    1.dp,
                                    color = Color.Transparent, // Mantém a borda transparente
                                    shape = RoundedCornerShape(10.dp)
                                ),
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.pesquisa),
                                contentDescription = "Lupa",
                                modifier = Modifier
                                    .size(24.dp) // Define o tamanho da imagem, ajuste conforme necessário
                            )
                        }
                        Image(
                            painter = painterResource(id = R.drawable.lupa),
                            contentDescription = "Lupa",
                            modifier = Modifier
                                .size(24.dp) // Define o tamanho da imagem, ajuste conforme necessário
                        )
                    }

                    Spacer(modifier = Modifier.height(40.dp))

                    Column(
                        modifier = Modifier
                            .background(Color(0xfffffffff))
                            .heightIn(min = 100.dp)
                            .width(400.dp),
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(110.dp)
                        ) {
                            Column(
                                verticalArrangement = Arrangement.SpaceAround,
                                modifier = Modifier
                                    .background(Color.White)
                                    .border(
                                        shape = RoundedCornerShape(10.dp),
                                        border = BorderStroke(1.dp, Color(0xFFFEE101))
                                    )
                                    .fillMaxHeight()
                                    .width(150.dp)

                                    .drawBehind {
                                        // Configurações da sombra
                                        val shadowColor = Color(0xFFFEE101) // Cor da sombra sólida
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
                                        Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp)
                                    ) // Aplica o fundo com bordas arredondadas
                                    .border(
                                        1.dp,
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados

                                    )
//
                            ) {
                                Text(
                                    text = "atividade complementar de equações fwdwfe...",
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp
                                )
                                Row(
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.livro),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            text = "10 questões",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.pessoas),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            modifier = Modifier.width(60.dp),
                                            text = "12 membros já fizeram",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.width(30.dp))
                            Column(
                                verticalArrangement = Arrangement.SpaceAround,
                                modifier = Modifier
                                    .background(Color.White)
                                    .border(
                                        shape = RoundedCornerShape(10.dp),
                                        border = BorderStroke(1.dp, Color(0xFFFEE101))
                                    )
                                    .fillMaxHeight()
                                    .width(150.dp)

                                    .drawBehind {
                                        // Configurações da sombra
                                        val shadowColor = Color(0xFFFEE101) // Cor da sombra sólida
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
                                        Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp)
                                    ) // Aplica o fundo com bordas arredondadas
                                    .border(
                                        1.dp,
                                        color = Color(0xFFFFFFFF),
                                        shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados

                                    )
//
                            ) {
                                Text(
                                    text = "atividade complementar de equações fwdwfe...",
                                    textAlign = TextAlign.Center,
                                    fontSize = 12.sp
                                )
                                Row(
                                    horizontalArrangement = Arrangement.SpaceEvenly,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.livro),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            text = "10 questões",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                    Column(
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            painter = painterResource(id = R.drawable.pessoas),
                                            contentDescription = "Lupa",
                                            modifier = Modifier
                                                .size(20.dp) // Define o tamanho da imagem, ajuste conforme necessário
                                        )
                                        Text(
                                            modifier = Modifier.width(60.dp),
                                            text = "12 membros já fizeram",
                                            textAlign = TextAlign.Center,
                                            fontSize = 8.sp
                                        )
                                    }
                                }
                            }
                        }
                    }
                } else if (membros.value == true) {

                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }

                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }
                    Row(
                        modifier = Modifier
                            .background(Color.White)
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()
                            .border(BorderStroke(1.dp, Color(0xffD9D9D9)))

                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }
                    Row(
                        modifier = Modifier
                            .background(Color(0xffD9D9D9))
                            .height(60.dp)  // Define a altura mínima
                            .fillMaxWidth()


                    ) {
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color(0xffD9D9D9))
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color(0xffD9D9D9))
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                        Box {
                            Image(
                                painter = painterResource(id = R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(60.dp)
                                    .padding(start = 15.dp)

                            )
                        }
                        Spacer(modifier = Modifier.width(20.dp))
                        Box(
                            modifier = Modifier
                                .background(Color.White)
                                .height(80.dp)
                                .width(165.dp)
                        ) {
                            Text(
                                text = "Matheus Noronha",
                                modifier = Modifier
                                    .padding(start = 4.dp, top = 5.dp),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = ("Estudando: \n" +
                                        "Matemática e português"),
                                modifier = Modifier
                                    .padding(top = 28.dp, start = 6.dp),
                                fontSize = 11.sp
                            )


                        }
                        Box(
                            modifier = Modifier
                                .background(color = Color.White)
                                .height(60.dp)
                                .width(165.dp)
                        )

                        {

                            Text(
                                text = (
                                        "Sub-assunto: "
                                        ),
                                modifier = Modifier
                                    .padding(top = 24.dp),
                                fontSize = 10.sp,
                                fontWeight = FontWeight.Bold
                            )

                            Text(
                                text = ("Soma"),
                                modifier = Modifier
                                    .padding(top = 24.dp, start = 60.dp),
                                fontSize = 10.sp
                            )

                            Text(
                                text = (
                                        "Série:"
                                        ),
                                modifier = Modifier
                                    .padding(top = 34.dp),
                                fontSize = 10.sp, fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "2º fundamental 1",
                                modifier = Modifier.padding(top = 35.dp, start = 28.dp),
                                fontSize = 9.sp
                            )


                        }
                    }
                }

            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color(0xff302F2F))

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
                    .size(110.dp)
                    .padding(start = 80.dp)
                    .clickable {
                        barraVisivel = !barraVisivel // Alterna a visibilidade da barra ao clicar
                    }
            )

            // Se a barra estiver visível, exibe uma barra vertical com ícones
            if (barraVisivel) {
                Spacer(modifier = Modifier.width(16.dp)) // Espaçamento entre a imagem e a barra

                // Barra de navegação vertical com ícones
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .width(56.dp)
                        .background(Color.LightGray),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                }
            }
        }
    }
        }



        @Preview(showBackground = true, showSystemUi = false)
@Composable
fun TelaGrupoMentoriaPreview() {
    TelaGrupoMentoria()
}
