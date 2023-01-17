package ir.misterdeveloper.topfootball.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.databinding.ActivityMainBinding
import ir.misterdeveloper.topfootball.model.Response.Match

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val navController = findNavController(R.id.fragmentContainerView)
        activityMainBinding.bottomNavigationView.setupWithNavController(navController)

        navController.addOnDestinationChangedListener { _, destination, _ ->
            if (destination.id == R.id.matchesFragment || destination.id == R.id.viewAllStandingFragment) {
                activityMainBinding.bottomNavigationView.visibility = View.GONE
            } else {
                activityMainBinding.bottomNavigationView.visibility = View.VISIBLE
            }

            if (destination.id == R.id.playerInformationFragment) {
                activityMainBinding.bottomNavigationView.visibility = View.GONE
            } else {
                activityMainBinding.bottomNavigationView.visibility = View.VISIBLE
            }
        }


    }

}