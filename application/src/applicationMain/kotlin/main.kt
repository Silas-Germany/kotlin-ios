//
//  main.kt
//  application
//
//  Created by user156129 on 2019-08-01.
//  Copyright © 2019 user156129. All rights reserved.
//

import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*

fun main(args: Array<String>) {
    memScoped {
        val argc = args.size + 1
        val argv = (arrayOf("konan") + args).map { it.cstr.ptr }.toCValues()

        autoreleasepool {
            UIApplicationMain(argc, argv, null, NSStringFromClass(AppDelegate))
        }
    }
}
