SUMMARY = "Alphabet Learning Game"
DESCRIPTION = "Helps to learn the alphabet and read some syllables."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "klettres-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "539e02be744a31fde04833b846a86ba9b7891fa409e5f91b7cb99a6a951431b296f087e802ce79f6869cf300ac2eab2d7fe3bf8ac99e7ff54fd4269e3703484b"

RPROVIDES:${PN} += "application() application(org.kde.klettres.desktop) klettres klettres(aarch-64) klettres5 metainfo() metainfo(org.kde.klettres.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5NewStuff.so.5()(64bit) libKF5NewStuffCore.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libphonon4qt5.so.4()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
