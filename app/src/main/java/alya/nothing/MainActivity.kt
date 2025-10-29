package alya.nothing

import android.os.Bundle
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Instantly close
        finish()
        // No animation
        overridePendingTransition(0, 0)
    }
}
