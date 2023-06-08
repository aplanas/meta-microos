SUMMARY = "Contrast checker"
DESCRIPTION = "Kontrast allows choosing background and text color that are easy to read when \
used together."
LICENSE = "GPL-3.0-or-later & CC0-1.0"

PV = "23.04.0"

RPM_NAME = "kontrast-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "b1fe069d7c03f5dade7fdacf40d020832e2ba1750b6751c1f38faee530a9cb893b6b43b42f6e5f5d39f103f0becb4d277bc2a28f593e4ffe89581f8590b10e06"

RPROVIDES:${PN} += "application() application(org.kde.kontrast.desktop) kontrast kontrast(aarch-64) metainfo() metainfo(org.kde.kontrast.appdata.xml)"
RDEPENDS:${PN} += "kirigami2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Sql.so.5()(64bit) libQt5Sql.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libqt5-qtquickcontrols libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
