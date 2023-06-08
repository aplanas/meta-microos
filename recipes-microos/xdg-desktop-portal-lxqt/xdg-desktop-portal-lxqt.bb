SUMMARY = "A backend implementation for xdg-desktop-portal"
DESCRIPTION = "A backend implementation for xdg-desktop-portal that is using Qt/KF5/libfm-qt. \
functionality needed by nearly all of its components."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.0"

RPM_NAME = "xdg-desktop-portal-lxqt-0.4.0-1.2.aarch64.rpm"
RPM_HASH = "26ba7ad5cc1b17e4c30502dc1e5001502efe0fe5b6badb42df98f89aa0bfb57cce33bf6dbd24205ab249ed3230e4bdeb71adf973fce56e74958a3bb45a3f964b"

RPROVIDES:${PN} += "application() application(org.freedesktop.impl.portal.desktop.lxqt.desktop) xdg-desktop-portal-lxqt xdg-desktop-portal-lxqt(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5WindowSystem.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfm-qt.so.13()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
