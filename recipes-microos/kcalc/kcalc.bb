SUMMARY = "Scientific Calculator"
DESCRIPTION = "KCalc is the KDE calculator tool."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kcalc-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "dad71ee7d812a0f85a41584aa73c5c0cb3c7cee8e2752161bf55e6895021a074cab1ad3601e69c789405886811074c3c051ccdec2e28fe0e0a0a248cd9816649"

RPROVIDES:${PN} += "application() application(org.kde.kcalc.desktop) kcalc kcalc(aarch-64) kcalc5 metainfo() metainfo(org.kde.kcalc.appdata.xml)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigGui.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5GuiAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5Notifications.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgmp.so.10()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libmpfr.so.6()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
