SUMMARY = "KDE Character Selector"
DESCRIPTION = "KCharSelect is the KDE character selector tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kcharselect-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "555375d7a45c429cf4122dd3d1c6e09d02b95d129604dfc523c2e6a7ef31192ed4ce6da36e38711c781adb3c9d808f47de8cdc3b5e1701c152dc4d4610c9183b"

RPROVIDES:${PN} += "application() application(org.kde.kcharselect.desktop) kcharselect kcharselect(aarch-64) kcharselect5 metainfo() metainfo(org.kde.kcharselect.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5Bookmarks.so.5()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
