package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telainicio.R
import br.senai.sp.jandira.telainicio.ui.theme.poppinsFontFamily


@Composable
fun TelaRankeamento(modifier: Modifier = Modifier) {

    val scrollState = rememberScrollState()

    Column(modifier = Modifier.verticalScroll(scrollState)){

       Row{
           Text(
               text = "Ranking",
               fontSize = 20.sp,
               modifier = Modifier
                   .weight(0.2f),
               textAlign = TextAlign.Center
               )

           Image(
               painter = painterResource(R.drawable.duvida),
               contentDescription = "divida",
               modifier = Modifier
                   .size(30.dp)
           )
       }
        Spacer(modifier = Modifier.height(50.dp))

        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Seu rank",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
                )

            Box(
                modifier = Modifier
                    .height(11.dp)
                    .width(160.dp)
                    .background(Color(0xFFFE9CE03),
                        shape = RoundedCornerShape(10.dp))
                    .clip(RoundedCornerShape(10.dp))

            )

            Image(
                painter = painterResource(R.drawable.rank),
                contentDescription = "trofeu",
                modifier = Modifier
                    .size(150.dp)
            )

            Text(text = "Bronze II",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color(0xFFFCDA572)
                )

            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = "A temporada encerrará daqui a:",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium
                )
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "7 Dias",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Box(
                modifier = Modifier
                    .height(440.dp)
                    .width(300.dp)
                    .border(BorderStroke(1.dp, Color.Gray))
            ){
                Column {

                        Row(modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp)
                            .border(BorderStroke(1.dp, Color.Gray)) ,
                        ){
                            Box(
                                contentAlignment = Alignment.Center,
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(40.dp)
                                    .background(Color.Green)
                            ){
                                Text(
                                    text = "#5",
                                    textAlign = TextAlign.Center,
                                    fontWeight = FontWeight.Bold,
                                )
                            }
                            Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                                modifier = Modifier.padding(15.dp)
                            ) {
                                Image(
                                    painter = painterResource(R.drawable.usuario),
                                    contentDescription = "usuario",
                                    modifier = Modifier
                                        .size(40.dp)

                                )
                                Text(
                                    text = "grande eweww...",
                                    fontSize = 15.sp
                                    )

                                Text(
                                    text = "271pts",
                                    fontWeight = FontWeight.ExtraBold,
                                    fontSize = 12.sp
                                )
                            }
                        }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray))
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "subir de nivel",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center,
                                color = Color.Green
                                )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Text(
                                text = "#6",
                                textAlign = TextAlign.Center,
                                fontFamily = poppinsFontFamily,
                                fontWeight = FontWeight.Thin

                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#7",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#8",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#9",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray))
                    ){
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Spacer(modifier = Modifier.height(10.dp))

                            Text(
                                text = "descer de nivel",
                                fontSize = 20.sp,
                                fontWeight = FontWeight.ExtraBold,
                                textAlign = TextAlign.Center,
                                color = Color.Red
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                                .background(Color.Red)

                        ){
                            Text(
                                text = "#10",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)


                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                }
            }
            Spacer(modifier = Modifier.height(35.dp))
        }

        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Rank de mentores",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )
            Box(
                modifier = Modifier
                    .height(11.dp)
                    .width(200.dp)
                    .background(Color(0xFFFE9CE03),
                        shape = RoundedCornerShape(10.dp)
                    )
                    .clip(RoundedCornerShape(10.dp))

            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Mentores que mais ajudam",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(25.dp))

            Box(
                modifier = Modifier
                    .height(320.dp)
                    .width(300.dp)
                    .border(BorderStroke(1.dp, Color.Gray))
            ){
                Column {

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.primeirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.segundolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Image(
                                painter = painterResource(R.drawable.terceirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#4",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#5",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "271pts",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(45.dp)
                            .border(BorderStroke(1.dp, Color.Gray))
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(painter = painterResource(id = R.drawable.anteriorduplo),
                                contentDescription = "anterior duplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.anterior),
                                contentDescription = "anterior",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                            Text(text = "1/100")

                            Image(painter = painterResource(id = R.drawable.proximo),
                                contentDescription = "proximo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.proximoduplo),
                                contentDescription = "proximoduplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                        }


                    }

                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "Mentores com melhores avaliações",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(20.dp))
            Box(
                modifier = Modifier
                    .height(320.dp)
                    .width(300.dp)
                    .border(BorderStroke(1.dp, Color.Gray))
            ){
                Column {

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.primeirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "4,5",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)
                        ){
                            Image(
                                painter = painterResource(R.drawable.segundolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "4,2",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Image(
                                painter = painterResource(R.drawable.terceirolugar) ,
                                contentDescription = "dd",
                                modifier = Modifier.size(30.dp)
                            )
                        }

                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "4,1",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#4",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "3",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp)
                        .border(BorderStroke(1.dp, Color.Gray)) ,
                    ){
                        Box(
                            contentAlignment = Alignment.Center,
                            modifier = Modifier
                                .fillMaxHeight()
                                .width(40.dp)

                        ){
                            Text(
                                text = "#5",
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Bold,
                            )
                        }
                        Row(horizontalArrangement = Arrangement.spacedBy(20.dp),
                            modifier = Modifier.padding(15.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.usuario),
                                contentDescription = "usuario",
                                modifier = Modifier
                                    .size(40.dp)

                            )
                            Text(
                                text = "grande eweww...",
                                fontSize = 15.sp
                            )

                            Text(
                                text = "1",
                                fontWeight = FontWeight.ExtraBold,
                                fontSize = 12.sp
                            )
                        }
                    }

                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(45.dp)
                            .border(BorderStroke(1.dp, Color.Gray))
                    ){
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceEvenly,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Image(painter = painterResource(id = R.drawable.anteriorduplo),
                                contentDescription = "anterior duplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.anterior),
                                contentDescription = "anterior",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                            Text(text = "1/100")

                            Image(painter = painterResource(id = R.drawable.proximo),
                                contentDescription = "proximo",
                                modifier = Modifier
                                    .size(25.dp)
                            )

                            Image(painter = painterResource(id = R.drawable.proximoduplo),
                                contentDescription = "proximoduplo",
                                modifier = Modifier
                                    .size(25.dp)
                            )
                        }


                    }

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TelaRankeamentopreview() {
    TelaRankeamento()
}