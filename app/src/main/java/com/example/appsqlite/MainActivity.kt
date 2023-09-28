package com.example.appsqlite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appsqlite.ui.theme.APPSQLiteTheme

class MainActivity : ComponentActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContent {

                }
            }
        }

        @Composable
        fun App(){
            APPSQLiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Row(Modifier.height(80.dp)) {
                            MenuTopBar()

                        }

                        Divider(
                            color = Color.Transparent,
                            modifier = Modifier.height(20.dp)
                        )

                        SimpleTextFieldSample("Nome")

                        Divider(
                            color = Color.Transparent,
                            modifier = Modifier.height(20.dp)
                        )
                        SimpleTextFieldSample("Endereço")
                        Divider(
                            color = Color.Transparent,
                            modifier = Modifier.height(20.dp)
                        )
                        SimpleTextFieldSample("Bairro")
                        Divider(
                            color = Color.Transparent,
                            modifier = Modifier.height(20.dp)
                        )
                        SimpleTextFieldSample("CEP")
                        Divider(
                            color = Color.Transparent,
                            modifier = Modifier.height(20.dp)
                        )
                        Divider(
                            color = Color.Transparent,
                            modifier = Modifier.height(20.dp)
                        )

                        ButtonSimple()

                    }
                }
            }
        }

        @Preview(showBackground = true, widthDp = 350, heightDp = 500)
        @Composable
        fun AppPreview(){
            App()


        }

        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun MenuTopBar(){
            Scaffold (
                topBar = {
                    CenterAlignedTopAppBar(
                        colors = TopAppBarDefaults.smallTopAppBarColors(
                            containerColor = Color.Red
                        ),
                        title = {
                            Column {
                                Text(text = "JetPack Composable", color = Color.White)
                                Text(text = "SQLite", color = Color.White, style = MaterialTheme.typography.labelSmall)
                            }
                        },
                        navigationIcon = {
                            IconButton(onClick = { /*TODO*/ }) {

                                Icon(Icons.Filled.ArrowBack, tint = Color.White, contentDescription = " ")

                            }
                        },
                        actions = {
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Filled.MoreVert, tint = Color.White, contentDescription = " ")

                            }

                        }
                    )
                }
            )
            {
                Box(modifier = Modifier.padding(it)){

                }

            }

        }


        @Preview(showBackground = true, widthDp = 330, heightDp = 400)
        @Composable
        fun PreviewMenuTopBar(){
            MenuTopBar()
        }

        @OptIn(ExperimentalMaterial3Api::class)
        @Composable
        fun SimpleTextFieldSample(label: String) {
            var text by rememberSaveable { mutableStateOf("") }

            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(label) },
                singleLine = true
            )
        }

        @Composable
        fun ButtonSimple(){
            Button(onClick = { /*TODO*/ },) {
                Text("Cadastrar" )

            }
        }


        @Preview(showBackground = true, widthDp = 400, heightDp = 200)
        @Composable
        fun TextField() {
            SimpleTextFieldSample("")

        }

