package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun TeladeAtividade(controleDeNavegacao: NavHostController?= null){
    Column (modifier = Modifier
        .fillMaxSize()) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)

            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text(
                        text = "Matemática 4º - Fund1",
                        fontSize = 20.sp,
                    )
                }
            }
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(Color(0xFF1AD3FB)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Assunto 1 - Soma e subtração",
                fontSize = 20.sp,
            )}
        Column (modifier = Modifier
            .padding(start = 40.dp,top = 40.dp, bottom = 20.dp, end = 40.dp)
            .fillMaxWidth()
            .height(480.dp)
        ) {
            Row (modifier = Modifier
                .fillMaxWidth()
                .height(60.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Soma simples",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                )}

        Row (modifier = Modifier.fillMaxWidth()
            .height(80.dp)){
            Card (modifier = Modifier
                .height(80.dp)
                .width(80.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
            ) {
            }

        }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.fillMaxWidth()
                .height(80.dp),
                horizontalArrangement = Arrangement.End
            ){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.fillMaxWidth()
                .height(80.dp)){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row (modifier = Modifier.fillMaxWidth()
                .height(80.dp),
                horizontalArrangement = Arrangement.End
            ){
                Card (modifier = Modifier
                    .height(80.dp)
                    .width(80.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFF1AD3FB))
                ) {
                }
            }


        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .background(Color(0xFFE9CE03)),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Assunto 2 - Soma e subtração",
                fontSize = 20.sp,
            )}

        BarradeNavegacao()

    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun TeladeAtividadePreview() {
    TeladeAtividade()
}
