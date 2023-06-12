SUMMARY = "Image Scanner Application"
DESCRIPTION = "Skanlite is an image scanner application by KDE."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "skanlite-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "50d26a498f293ff9ccca8b975960ef28db9ea6e39042a78e78b079a385095670b0843274a8af4d545cf923d680103e09f11cbd801b0850f21c2117ba265fd48d"

RPROVIDES:${PN} += "application() application(org.kde.skanlite.desktop) metainfo() metainfo(org.kde.skanlite.appdata.xml) skanlite skanlite(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5JobWidgets.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libKF5KIOWidgets.so.5()(64bit) libKF5Sane.so.5()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
