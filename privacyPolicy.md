## PolishingM: Privacy policy

Welcome to the PolishingM app for Android!

This is an open source Android app developed by Dmytro Kmetsynskyi. The source code is available on GitHub under the GNU GPL license

As an Android user myself, I take privacy very seriously. I know how irritating it is when apps collect your data without your knowledge.

I hereby declare to the best of my knowledge and belief that I have not programmed this application to collect any personal information. All data (app settings) created by you (the user) is stored only on your device and can be easily erased by clearing the app data or uninstalling it.

### Explanation of permissions requested in the app

The list of permissions required by the app can be found in the `AndroidManifest.xml` file:

https://github.com/DmytroKmetsynskyi/PolishingM/blob/main/app/src/main/AndroidManifest.xml

<br/>

| Permission | Why it is required |
| :---: | --- |
| `android.permission.BLUETOOTH`/`android.permission.BLUETOOTH_ADMIN` | Used to connect to CNC machine |
| `android.permission.READ_EXTERNAL_STORAGE`/`android.permission.WRITE_EXTERNAL_STORAGE` | Used to read `gcode` files |
| `android.permission.INTERNET` | Used by the Firebase platform |
| `android.permission.WAKE_LOCK` | Used to keep the CPU running in order to complete some work before the device goes to sleep |
| `android.permission.FOREGROUND_SERVICE` | It is used so that the machine can continue working in the background |

 <hr style="border:1px solid gray">

If you find any security vulnerability that has been inadvertently caused by me, or have any question regarding how the app protectes your privacy, please send me an email or post a discussion on GitHub, and I will surely try to fix it/help you.

Yours sincerely,  
Dmytro Kmetsynskyi.  
Lutsk, Ukraine.  
dimakmentsynskyi@gmail.com
