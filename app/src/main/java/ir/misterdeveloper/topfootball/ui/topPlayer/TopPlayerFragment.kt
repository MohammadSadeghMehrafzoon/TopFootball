package ir.misterdeveloper.topfootball.ui.topPlayer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ir.misterdeveloper.topfootball.R
import ir.misterdeveloper.topfootball.databinding.FragmentTopPlayerBinding


class TopPlayerFragment : Fragment() {

    lateinit var binding: FragmentTopPlayerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTopPlayerBinding.inflate(layoutInflater)

        binding.lionelMessi.setOnClickListener(View.OnClickListener {
            findNavController().navigate(
                TopPlayerFragmentDirections.actionTopPlayerFragmentToPlayerInformationFragment()
                    .setPlayerName("Messi")
            )
        })

        binding.cristianoRonaldo.setOnClickListener(View.OnClickListener {
            findNavController().navigate(
                TopPlayerFragmentDirections.actionTopPlayerFragmentToPlayerInformationFragment()
                    .setPlayerName("Ronaldo")
            )
        })

        binding.neymar.setOnClickListener(View.OnClickListener {
            findNavController().navigate(
                TopPlayerFragmentDirections.actionTopPlayerFragmentToPlayerInformationFragment()
                    .setPlayerName("Neymar")
            )
        })


        binding.robertLewandowski.setOnClickListener(View.OnClickListener {
            findNavController().navigate(
                TopPlayerFragmentDirections.actionTopPlayerFragmentToPlayerInformationFragment()
                    .setPlayerName("Lewandowski")
            )
        })



        binding.karimBenzema.setOnClickListener(View.OnClickListener {
            findNavController().navigate(
                TopPlayerFragmentDirections.actionTopPlayerFragmentToPlayerInformationFragment()
                    .setPlayerName("Benzema")
            )
        })


        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}