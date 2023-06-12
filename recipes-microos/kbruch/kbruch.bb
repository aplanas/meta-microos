SUMMARY = "Application to excercise fractions"
DESCRIPTION = "KBruch is an application to learn calculating with fractions."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kbruch-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "210587dcfed30c251bc7dd8a20b4daf17f5110a824ebfbe2e359319a4887844e5ed2eb72b50187d0996b921b8a64cb2161a53837003c36e2ed765e493c7481bd"

RPROVIDES:${PN} += "application() \
application(org.kde.kbruch.desktop) \
kbruch \
kbruch(aarch-64) \
kbruch5 \
metainfo() \
metainfo(org.kde.kbruch.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigGui.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5Crash.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
