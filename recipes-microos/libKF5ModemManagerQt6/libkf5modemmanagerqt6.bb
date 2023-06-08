SUMMARY = "Qt wrapper around the ModemManager libraries"
DESCRIPTION = "Qt5 wrapper for ModemManager DBus API."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "5.105.0"

RPM_NAME = "libKF5ModemManagerQt6-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "51dcc60bcd40f5e17ac34f28ab6b722932ba64c355b1f182cacdc4a7c71fbeaa336c1294d3001fdf8e8dd70ef68861f5008db886a15c6e77f0e4f7be1c2f7bec"

RPROVIDES:${PN} += "libKF5ModemManagerQt.so.6()(64bit) libKF5ModemManagerQt6 libKF5ModemManagerQt6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
