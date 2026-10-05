package com.example.myprofile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    MaterialTheme {
        ProfileScreen()
    }
}

@Composable
fun ProfileScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF7F5F2))
            .padding(horizontal = 24.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Profile Header
        ProfileHeader()

        Spacer(
            modifier = Modifier.height(20.dp)
        )

        // Bio
        ProfileBio()

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        // Information Card
        ProfileCard()

        Spacer(
            modifier = Modifier.height(24.dp)
        )

        // Follow Button
        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF7B5E57)
            )
        ) {
            Text(
                text = "Follow",
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
fun ProfileHeader() {

    Box(
        modifier = Modifier
            .size(120.dp)
            .clip(CircleShape)
            .background(Color(0xFFE8D5C4)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "TM",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF6D4C41)
        )
    }

    Spacer(
        modifier = Modifier.height(16.dp)
    )

    Text(
        text = "TARISA MENOVA",
        style = MaterialTheme.typography.headlineMedium,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )

    Spacer(
        modifier = Modifier.height(4.dp)
    )

    Text(
        text = "Teknik Informatika",
        style = MaterialTheme.typography.bodyLarge,
        color = Color(0xFF6D6D6D)
    )
}

@Composable
fun ProfileBio() {

    Text(
        text = "Halo! Saya Tarisa, mahasiswa Teknik Informatika yang sedang mempelajari Pengembangan Aplikasi Mobile.",
        style = MaterialTheme.typography.bodyMedium,
        textAlign = TextAlign.Center,
        color = Color(0xFF555555),
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ProfileCard() {

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        )
    ) {

        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {

            InfoItem(
                icon = "🎓",
                title = "NIM",
                value = "124140039"
            )

            InfoItem(
                icon = "✉️",
                title = "Email",
                value = "tarisamenova@gmail.com"
            )

            InfoItem(
                icon = "📱",
                title = "Phone",
                value = "082289677534"
            )

            InfoItem(
                icon = "📍",
                title = "Location",
                value = "Padang Panjang, Sumatera Barat, Indonesia"
            )
        }
    }
}

@Composable
fun InfoItem(
    icon: String,
    title: String,
    value: String
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(
            modifier = Modifier
                .size(44.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFF0E7E2)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = icon,
                style = MaterialTheme.typography.titleMedium
            )
        }

        Spacer(
            modifier = Modifier.width(14.dp)
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {

            Text(
                text = title,
                style = MaterialTheme.typography.labelLarge,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7B5E57)
            )

            Spacer(
                modifier = Modifier.height(2.dp)
            )

            Text(
                text = value,
                style = MaterialTheme.typography.bodyMedium,
                color = Color(0xFF333333)
            )
        }
    }
}