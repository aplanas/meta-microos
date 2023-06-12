SUMMARY = "Convergent calculator"
DESCRIPTION = "Kalk is a convergent calculator application built with the Kirigami framework. \
Although it is mainly targeted for mobile platforms, it can also be used on the \
desktop."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalk-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "8a40fd9bb5ce32a9c63e4fbd2f5e63b0f9fddaf390c343ddc2f05b9d0d604420aada03e47ce6f7994f795ec5042292407308438f86e78abaef722d2ffc328c08"

RPROVIDES:${PN} += "application() \
application(org.kde.kalk.desktop) \
kalk \
kalk(aarch-64) \
metainfo() \
metainfo(org.kde.kalk.appdata.xml)"
RDEPENDS:${PN} += "kirigami2 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5UnitConversion.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QuickControls2.so.5()(64bit) \
libQt5QuickControls2.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgmp.so.10()(64bit) \
libmpfr.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
