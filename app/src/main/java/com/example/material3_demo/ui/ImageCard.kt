package com.example.material3_demo.ui

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ImageCard(
    title:String,
    description:String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(
             containerColor = MaterialTheme.colorScheme.surfaceVariant,

        ),
        shape = MaterialTheme.shapes.large
    ) {
        
    }
}