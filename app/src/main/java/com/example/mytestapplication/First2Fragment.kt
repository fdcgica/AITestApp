package com.example.mytestapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mytestapplication.databinding.FragmentFirst2Binding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class First2Fragment : Fragment() {

    private var _binding: FragmentFirst2Binding? = null



    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = requireNotNull(_binding)


    override fun onCre
    ateView(
        inflater: Layout
        Inflater, conta
        iner: ViewGroup?,

        savedInstanceState: Bundle?


    ): View {


        _binding = FragmentFirst
        2Bindin
        g.inflate(infla
                ter, container, false)
        return binding.root



    }


    override fun onViewCreated(view: View, save
                               dInstanceState: Bundle?) {

        super.onViewCreated(view, save
                dInstanceState)


        binding.buttonFirst.setOnClickListener {

            findNavController().navigate(R.id.action_First2Fragment_to_Second2Fragment)


        }
    }

    override fun onDestroyView() {




        super.onDestroyView()




        _binding = null
    }
}