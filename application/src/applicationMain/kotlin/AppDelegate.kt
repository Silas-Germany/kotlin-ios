//
//  AppDelegate.kt
//  application
//
//  Created by user156129 on 2019-08-01.
//  Copyright © 2019 user156129. All rights reserved.
//

import platform.UIKit.*

class AppDelegate @OverrideInit constructor() : UIResponder(), UIApplicationDelegateProtocol {
    companion object : UIResponderMeta(), UIApplicationDelegateProtocolMeta

    private var _window: UIWindow? = null
    override fun window() = _window
    override fun setWindow(window: UIWindow?) { _window = window }
}
