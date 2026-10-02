package com.example.sharedapp.screens

import androidx.compose.foundation.layout.* // Importe Spacer, Row, Column, etc.
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MaPageTest() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(25.dp),
        // On centre tous les éléments de la colonne horizontalement par défaut
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Test de text",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.DarkGray,
            modifier = Modifier.padding(top = 20.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { /* action click */ }) {
                Text("Teeest !!!")
            }

            // Petit espace fixe entre les deux boutons
            Spacer(modifier = Modifier.width(16.dp))

            OutlinedButton(onClick = { /* action annuler */ }) {
                Text("Annuler")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Voir plus",

            modifier = Modifier.align(Alignment.End)
        )
    }
}