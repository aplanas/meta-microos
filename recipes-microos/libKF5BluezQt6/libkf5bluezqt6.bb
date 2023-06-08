SUMMARY = "Async Bluez wrapper library - development files"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "libKF5BluezQt6-5.105.0-1.1.aarch64.rpm"
RPM_HASH = "743df7cfc72844faa4d62a802ad5af787fd18701d4ef6dbc5284cb34aec7c919986940c923e7b497a0f75afa645deca62f44ba6f3071c545f9bdc8603d0e3850"

RPROVIDES:${PN} += "libKF5BluezQt.so.6()(64bit) libKF5BluezQt6 libKF5BluezQt6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
