SUMMARY = "'Dots and boxes' board game"
DESCRIPTION = "KSquares is an implementation of the popular paper-based game \
squares, better known as 'La Pipopipette' in its original French \
form, or 'Dots and Boxes' in English. One must draw lines to complete \
squares, and the player with the most squares wins. This \
implementation can be played with up to 4 players, any number of \
which may be controlled by the computer."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "ksquares-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "f67c5992fd2d86a45e87c56fa941fb8afcde57211b871de6f842c9a30f9f623c92bc98aee9254779d51fb5e352fad5bc384dd47a288cdf48484c9d86f08ad6bb"

RPROVIDES:${PN} += "application() application(org.kde.ksquares.desktop) ksquares ksquares(aarch-64) ksquares5 metainfo() metainfo(org.kde.ksquares.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Completion.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5DBusAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
