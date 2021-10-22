package app.lawnchair.overview

import android.content.Context
import android.util.AttributeSet
import android.widget.Button
import android.widget.Space
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible
import com.android.launcher3.R
import com.android.quickstep.views.OverviewActionsView

class LawnchairOverviewActionsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : OverviewActionsView<TaskOverlayFactoryImpl.OverlayUICallbacks>(context, attrs, defStyleAttr) {

    override fun onFinishInflate() {
        super.onFinishInflate()

        val lensIntent = context.packageManager.getLaunchIntentForPackage("com.google.ar.lens")
        val lensAvailable = lensIntent != null

        val lensButton = ViewCompat.requireViewById<Button>(this, R.id.action_lens)
        lensButton.setOnClickListener {
            mCallbacks?.onLens()
        }
        lensButton.isVisible = lensAvailable

        val lensSpace = ViewCompat.requireViewById<Space>(this, R.id.lens_space)
        lensSpace.isVisible = lensAvailable
    }
}