package com.elfiky.testcoilepoxy

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import androidx.constraintlayout.widget.ConstraintLayout
import coil.load
import com.airbnb.epoxy.ModelProp
import com.airbnb.epoxy.ModelView
import com.airbnb.epoxy.OnViewRecycled
import com.elfiky.testcoilepoxy.databinding.CustomViewBinding

@ModelView(autoLayout = ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
class CustomView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    private val binding: CustomViewBinding

    init {
        val view = inflate(context, R.layout.custom_view, this)
        binding = CustomViewBinding.bind(view)
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.d("Test", "onDetachedFromWindow")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d("Test", "onAttachedToWindow")
    }

    @OnViewRecycled
    fun clear() {
        Log.d("Test", "OnViewRecycled")
    }

    @ModelProp
    fun setData(data: String?) {
        binding.newTaskOwnerProfilePicImgV.load(data)
    }

}