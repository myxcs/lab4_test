package com.ph36461.lab4_test

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ph36461.lab4_test.ui.theme.Orange

@Composable
fun LoginScreen() {

    val context = LocalContext.current

    var username by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }
  

    Column (
        modifier = Modifier.fillMaxSize(),
       // verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Spacer(modifier = Modifier.height(100.dp))
        Image(
            painter = painterResource(id = R.drawable.download),
            contentDescription = "",
            modifier = Modifier.size(150.dp)
            )
        Spacer(
            modifier = Modifier
                .height(10.dp)
        )
        Text(
            text = "Welcome Back",
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Bold
            )
        Spacer(
            modifier = Modifier
                .height(4.dp)
        )
        Text(
            text = "Login to your account",
            fontSize = 18.sp,
            fontFamily = FontFamily.SansSerif,
            fontWeight = FontWeight.Light,
            fontStyle = FontStyle.Italic
        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        OutlinedTextField(
            value = username,
            onValueChange = {
                username = it
            },
            label = {
                Text("Username")
            }

        )
        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            },
            label = {
                Text("Password")
            },
            visualTransformation = PasswordVisualTransformation()
       )
       Spacer(
           modifier = Modifier
               .height(30.dp)
       )
       Button(
           onClick = {
                     if(username.isNotBlank() && password.isNotBlank()){

                         Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                     }
                     else{
                         Toast.makeText(context, "Please enter username and password", Toast.LENGTH_SHORT).show()
                     }
           },
           modifier = Modifier
               .size(200.dp, 50.dp),
           shape = RoundedCornerShape(10.dp),
           colors = ButtonDefaults.buttonColors(
               containerColor = Orange,
               contentColor = White
           )
           ) {
           Text(
               text = "Login",
               fontSize = 20.sp,
               fontWeight = FontWeight.Bold,
               color = White
               )
       }
//       TextButton(
//           onClick = {
//           /*TODO*/
//
//           }) {
//           Text(
//               text = "Forgot Password?",
//               color = Black,
//               fontSize = 16.sp,
//               fontStyle = FontStyle.Italic
//           )
//       }

        Spacer(
            modifier = Modifier
                .height(20.dp)
        )
        Text(
            text = "Forgot Password?",
            color = Orange,
            fontSize = 16.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.clickable { /*TODO*/ },
        )

    }
}

