package flutter.moum.hardware_buttons

import android.app.Activity
import android.app.Application
import android.os.Bundle


open class EmptyActivityLifecycleCallbacks: Application.ActivityLifecycleCallbacks {
    override fun onActivityPaused(p0: Activity?) { }

    override fun onActivityResumed(p0: Activity?) { }

    override fun onActivityStarted(p0: Activity?) { }

    override fun onActivityDestroyed(p0: Activity?) { }

    override fun onActivitySaveInstanceState(p0: Activity?, outState: Bundle?) { }

    override fun onActivityStopped(p0: Activity?) { }

    override fun onActivityCreated(p0: Activity?, savedInstanceState: Bundle?) { }
}
