SUMMARY = "KDE's screen management library"
DESCRIPTION = "Shared library for dynamic display management in KDE"
LICENSE = "GPL-2.0-or-later"

PV = "5.27.4"

RPM_NAME = "libKF5Screen8-5.27.4-1.1.aarch64.rpm"
RPM_HASH = "9f40ec1c170342a55e0a7338c2716d27a47b9cbee17e40695410d5d7ed7aa57b10f2d94f11861ce5d482f2f75188937dac9f5b938a57c65a1b1bcacc82986547"

RPROVIDES:${PN} += "libKF5Screen.so.8()(64bit) libKF5Screen8 libKF5Screen8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
