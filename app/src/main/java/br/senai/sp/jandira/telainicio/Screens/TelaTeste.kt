package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import org.w3c.dom.Text
import kotlin.math.roundToInt

@Composable
fun TelaTeste(modifier: Modifier = Modifier) {
    var isScreenVisible by remember { mutableStateOf(false) }

    // Variável que rastreia o deslocamento vertical para o arraste
    var offsetY by remember { mutableStateOf(0f) }

    // Pega a altura total da tela
    val configuration = LocalConfiguration.current
    val screenHeightPx = configuration.screenHeightDp.dp

    // Define a altura da tela deslizante como 90% da tela
    val slidingScreenHeight by animateDpAsState(targetValue = if (isScreenVisible) screenHeightPx * 0.9f else 0.dp)

    // Muda a cor de fundo com base na visibilidade da tela deslizante
    val backgroundColor = if (isScreenVisible) Color.LightGray else Color.White

    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        // Tela de fundo que muda de cor dinamicamente
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(backgroundColor)
        )

        /*
        // Botão que abre a tela deslizante
        Button(
            onClick = {
                isScreenVisible = true
                offsetY = 0f  // Resetar o offset ao reabrir a tela
            },
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text("Abrir")
        }
        */

        // Tela deslizante com arraste
        /*
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(slidingScreenHeight)  // Usando altura animada com 90% da tela
                .offset { IntOffset(x = 0, y = offsetY.roundToInt()) }
                .align(Alignment.BottomCenter)
                .background(Color.White, RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                .draggable(
                    orientation = Orientation.Vertical,
                    state = rememberDraggableState { delta ->
                        offsetY = (offsetY + delta).coerceIn(0f, screenHeightPx.value * 0.9f)  // Controla o limite do arrasto
                        if (offsetY == screenHeightPx.value * 0.9f) {
                            isScreenVisible = false
                        }
                    }
                )
        ) {
        */
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            // Indicador visual para o usuário arrastar
            Box(
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(width = 40.dp, height = 4.dp)
                    .background(Color.Gray, RoundedCornerShape(2.dp))
            )
Column {
    Text(
        text = "Selecione um tipo de  ",
        modifier = Modifier
            .padding(top = 60.dp, start = 70.dp),
        fontSize = 22.sp
    )
    Text(
        text = "atividade para cria-la",
        modifier = Modifier
            .padding(start = 70.dp),
        fontSize = 22.sp
    )


    Column(
        modifier = Modifier
            .padding(top = 40.dp, start = 30.dp)
            .drawBehind {
                // Configurações da sombra
                val shadowColor = Color(0xE9CE03) // Cor da sombra sólida
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
            .height(150.dp) // Mantém a altura desejada
            .width(300.dp) // Mantém a largura desejada
            .background(
                Color.White,
                shape = RoundedCornerShape(10.dp)
            ) // Aplica o fundo com bordas arredondadas
            .border(
                1.dp,
                color = Color(0xffE9CE03),
                shape = RoundedCornerShape(10.dp) // Certifique-se de que a borda também tenha os mesmos cantos arredondados
            )
    ) {

        Row (modifier = Modifier.fillMaxSize()){

            Box(modifier = Modifier
                .padding(top = 20.dp)
                .wrapContentSize(align = Alignment.CenterStart)) {
                Image(
                    painter = painterResource(id = R.drawable.setas),
                    contentDescription = "atividades",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(start = 30.dp)
                        .width(20.dp),
                )
                Text(
                    text = "Múltipla\nescolha", modifier = Modifier.padding(start = 25.dp, top = 60.dp))

            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(
                modifier = Modifier
                    .height(100.dp)
                    .width(400.dp)
                    .background(Color.Gray)
                    .padding(start = 10.dp)
            ) {


            }
        }
    }

        }
        }
        /*
        }
        */
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaTestePreview() {
    TelaTeste()
}
