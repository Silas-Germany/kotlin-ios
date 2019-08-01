//
//  ViewController.kt
//  application
//
//  Created by user156129 on 2019-08-01.
//  Copyright © 2019 user156129. All rights reserved.
//

import kotlinx.cinterop.*
import platform.Foundation.*
import platform.UIKit.*

@ExportObjCClass
class ViewController @OverrideInit constructor(coder: NSCoder) : UIViewController(coder) {
    @ObjCOutlet
    lateinit var label: UILabel

    @ObjCOutlet
    lateinit var textField: UITextField

    @ObjCOutlet
    lateinit var button: UIButton

    @ObjCAction
    fun buttonPressed() {
        label.text = "Konan says: 'Hello, ${textField.text}!'"
    }
}
