# Overview

RPG Dice Roller is an Android app created with Kotlin that allows the user to roll each of these standard tabletop RPG dice:

* 20 sided
* 12 sided
* 10 sided
* Percentile
* 8 sided
* 6 sided
* 4 sided
* 2 sided (flip a coin)

Additionally, the user may input a modifier, which will be automatically added or subtracted from the number rolled. Leaving the modifier field empty or filling it with a non-integer will give the user an "Invalid Modifier" warning. The app has both dark and light mode support. Dark mode will only display if "Dark theme" is selected in your Android devices settings.

To run RPG Dice Maker, you can download the entire repository, open it in Android Studio, and run the app using Android Studio's built in emulator. Any other method of emulating android may also be used with the debug build APK. To create the debug build APK in your Android Studio Project, select Build / Build Bundle(s) / APK(s) / Build APK(s).

When the app opens, clicking any of the buttons will result in an "Invalid Modifier" warning. To roll the dice with no modifier, input 0 into the modifier field and click any of the buttons. Your randomly generated dice roll will take the place of the "Roll" text. To add a modifier to your dice roll, input any integer into the modifier field. That integer will be automatically added to your next roll.

I created this app to learn the basics of Android Development with Kotlin, as well as to be a useful tool to use for playing some of my favorite tabletop roleplaying games, such as Dungeons and Dragons and Call of Cthulhu. I hope you gain the same amount of enjoyment from it as I will!

[Software Demo Video](https://youtu.be/atSrlEba4PU)

# Development Environment

* KDE Plasma 5.23.5
* Android Studio Dolphin | 2021.3.1 Patch 1
* Kotlin plugin version: 213-1.7.20-release-for-android-studio-AS6777.52

# Useful Websites

* [Android Developers](https://developer.android.com/)
* [Kotlin Documentation](https://kotlinlang.org/docs/home.html)
* [findicons](https://findicons.com/)
* [Simple Image Resizer](https://www.simpleimageresizer.com/upload)
* [Color Tool](https://m2.material.io/resources/color/#!/?view.left=0&view.right=0)

# Future Work

- [ ] Automatically roll with modifier "0" when modifier field is empty.
- [ ] Add dice roll sounds.
- [ ] Display number rolled + modifier equation above Roll when die is rolled.

# Credits

The Icons used in RPG Dice Roller were provided by IconCubic and VisualPharma (Ivan Boyko) via [findicons](https://findicons.com/).
