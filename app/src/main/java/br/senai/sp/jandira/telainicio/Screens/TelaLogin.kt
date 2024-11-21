package br.senai.sp.jandira.telainicio.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import androidx.navigation.NavHostController
import br.senai.sp.jandira.telainicio.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaLogin(controleDeNavegacao: NavHostController?= null) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(color = Color(0xFFFEE101))
    ) {
        Box(
            modifier = Modifier
                .padding(top = 35.dp)
                .align(Alignment.CenterHorizontally)
                .height(200.dp)
                .width(100.dp)
        ) {
            Image(
                modifier = Modifier
                    .size(140.dp)
                    .height(150.dp)
                    .width(150.dp),
                painter = painterResource(id = R.drawable.calabreso2),
                contentDescription = "Mascote"
            )
            Text(
                fontWeight = FontWeight.ExtraBold,
                fontSize = 30.sp,
                color = Color(0xFF302F2F),
                text = "Login",
                modifier = Modifier
                    .offset(x = 10.dp, y = 130.dp)
            )
        }
        Box(
            modifier = Modifier
                .offset(x = 0.dp, y = 280.dp)
                .fillMaxHeight()
                .fillMaxWidth()
                .background(color = Color(0xFFEEEEEE))
                .align(Alignment.CenterHorizontally)
        )
    }
    Box(
        modifier = Modifier
            .offset(x = 20.dp, y = 250.dp)
            .background(Color.White)
            .height(500.dp)
            .width(350.dp)
            .zIndex(1f)
    ) {
        Column(
            modifier = Modifier
                .padding(start = 20.dp, top = 30.dp)
                .height(430.dp)
                .width(310.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Text(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black,
                text = "Por favor, faça login para continuar"
            )

            Box() {
                OutlinedTextField(
                    trailingIcon = {
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.Email,
                                contentDescription = "Caixa",
                                tint = Color(0xFFFEE101)
                            )
                        }
                    },
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(top = 30.dp)
                        .width(350.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color.White, // Define a cor de fundo dentro do OutlinedTextField
                        focusedBorderColor = Color(0xFFFEE101),
                        unfocusedBorderColor = Color(0xFFFEE101),
                        focusedLabelColor = Color(0xFFFEE101),
                        unfocusedLabelColor = Color(0xFFFEE101)
                    ),
                    placeholder = {
                        Text(
                            text = "E-mail",
                            color = Color.Black
                        )
                    }
                )
            }
            Box() {
                OutlinedTextField(
                    trailingIcon = {
                        IconButton(onClick = {}) {
                            Icon(
                                imageVector = Icons.Default.Lock,
                                contentDescription = "Caixa",
                                tint = Color(0xFFFEE101)
                            )
                        }
                    },
                    value = "",
                    onValueChange = {},
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .width(350.dp),
                    shape = RoundedCornerShape(10.dp),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        containerColor = Color.White, // Define a cor de fundo dentro do OutlinedTextField
                        focusedBorderColor = Color(0xFFFEE101),
                        unfocusedBorderColor = Color(0xFFFEE101),
                        focusedLabelColor = Color(0xFFFEE101),
                        unfocusedLabelColor = Color(0xFFFEE101)
                    ),
                    placeholder = {
                        Text(
                            text = "Senha",
                            color = Color.Black
                        )
                    }
                )
            }
            Text(
                modifier = Modifier.padding(top = 10.dp),
                fontWeight = FontWeight.Light,
                text = "Esqueceu a senha?"
            )
            Spacer(modifier = Modifier.height(30.dp))

            Row {
                Text(
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    text = "Ou cadastre-se com:"
                )
                Image(
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .height(20.dp)
                        .width(20.dp),
                    painter = painterResource(id = R.drawable.googleimg),
                    contentDescription = "Google logo"
                )
            }
            Column(
                horizontalAlignment = AbsoluteAlignment.Right,
                verticalArrangement = Arrangement.Bottom,
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .align(alignment = Alignment.End)
            ) {
                Button(
                    onClick = {  },
                    modifier = Modifier
                        .width(150.dp)
                        .height(35.dp),
                    colors = ButtonDefaults.buttonColors(Color(0xFFFEE101))
                ) {
                    Text(
                        text = "Logar",
                        color = Color.Black,
                        letterSpacing = 1.sp
                    )
                    Icon(
                        modifier = Modifier.padding(start = 20.dp),
                        imageVector = Icons.Filled.ArrowForward,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    Text(
                        fontSize = 15.sp,
                        text = "Não tem uma conta?"
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        modifier = Modifier
                            .clickable { controleDeNavegacao?.navigate("inicio2") },
                        color = Color(0xFFFEE101),
                        fontSize = 15.sp,
                        text = "Cadastre-se"
                    )
                }

            }
            }
        }
    }




@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaLoginPreview() {
    TelaLogin()
}
