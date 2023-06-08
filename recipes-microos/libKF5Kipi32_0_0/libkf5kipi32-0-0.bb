SUMMARY = "KDE Image Plug-In Interface"
DESCRIPTION = "This package provides a generic KDE image plug-in interface used by \
some KDE image applications. Plug-ins for this interface are in the \
kipi-plugins package."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & LGPL-2.1-or-later & MIT"

PV = "23.04.0"

RPM_NAME = "libKF5Kipi32_0_0-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "974c054bdbfa2c615f3df40785a0d938c74ab01bf2c7728eb0b2a6fd9fd1026c54597bcce31b01a5fb107ec226a4c1f228c359eb4bb5bac2a01126e0200aa55e"

RPROVIDES:${PN} += "libKF5Kipi.so.32.0.0()(64bit) libKF5Kipi32_0_0 libKF5Kipi32_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5ConfigCore.so.5()(64bit) libKF5CoreAddons.so.5()(64bit) libKF5Service.so.5()(64bit) libKF5XmlGui.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libkipi-data libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
