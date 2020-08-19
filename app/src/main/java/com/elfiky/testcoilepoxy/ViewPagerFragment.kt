package com.elfiky.testcoilepoxy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.elfiky.testcoilepoxy.databinding.ViewPagerFragmentBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ViewPagerFragment : Fragment(R.layout.view_pager_fragment) {

    private var _binding: ViewPagerFragmentBinding? = null
    private val binding get() = _binding!!
    private val controller = EpoxyController()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ViewPagerFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.inboxTasksRv.setController(controller)

        lifecycleScope.launch {
            delay(2000)
            binding.loadingPb.visibility = View.GONE
            binding.successViewCl.visibility = View.VISIBLE
            controller.setData(newData)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}