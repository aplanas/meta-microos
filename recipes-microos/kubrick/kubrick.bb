SUMMARY = "Game based on Rubik's Cube"
DESCRIPTION = "This package contains the KDE game Kubrick which is based on Rubik's \
Cube."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kubrick-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "28f031e74e0bce14c0d6f9f730aa5e39cf276354d309d7623a2537e31c02a2521a4b207ce9b1af6e4fcb6c25d657c3aa81b713e9000b9702622e5091f5374770"

RPROVIDES:${PN} += "application() application(org.kde.kubrick.desktop) kubrick kubrick(aarch-64) kubrick5 metainfo() metainfo(org.kde.kubrick.appdata.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGLU.so.1()(64bit) libKF5ConfigCore.so.5()(64bit) libKF5ConfigWidgets.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Crash.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KDEGames.so.7()(64bit) libKF5WidgetsAddons.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libOpenGL.so.0()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5OpenGL.so.5()(64bit) libQt5OpenGL.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
