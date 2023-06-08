SUMMARY = "Application to excercise fractions"
DESCRIPTION = "KBruch is an application to learn calculating with fractions."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kbruch-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "fbe529530f69af34d6f0a28e386c8dc8b9fe4a6970f69168096e7351988fd475c3de07b25317c75298bdeb92c7f5c3307012105f206343da55824f819ca7fb9f"

RPROVIDES:${PN} += "application() application(org.kde.kbruch.desktop) kbruch kbruch(aarch-64) kbruch5 metainfo() metainfo(org.kde.kbruch.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
