SUMMARY = "Image Scanner Application"
DESCRIPTION = "Skanlite is an image scanner application by KDE."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "skanlite-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "d7adb7cc4dc14d262dff4e3e81f7434a2d6c36793c25ba90be75551e28e64cd090b6ab42cca4fd5608850caa6df1fadfb8078aebb8df9639e9320ec04a8f338a"

RPROVIDES:${PN} += "application() application(org.kde.skanlite.desktop) metainfo() metainfo(org.kde.skanlite.appdata.xml) skanlite skanlite(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Sane.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
