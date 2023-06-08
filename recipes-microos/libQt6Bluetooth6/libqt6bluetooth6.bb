SUMMARY = "Qt 6 bluetooth library"
DESCRIPTION = "Provides access to Bluetooth hardware."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Bluetooth6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "84150aa7528eb17fbbf69fcc8cfa9c45d90c0de4dea873a6ba151c5224524a99ed1aafb1126e8374a3da8821b17c2b2cd65e849235a3b2045f09e280730fa429"

RPROVIDES:${PN} += "libQt6Bluetooth.so.6()(64bit) libQt6Bluetooth.so.6(Qt_6)(64bit) libQt6Bluetooth.so.6(Qt_6.0)(64bit) libQt6Bluetooth.so.6(Qt_6.1)(64bit) libQt6Bluetooth.so.6(Qt_6.2)(64bit) libQt6Bluetooth.so.6(Qt_6.3)(64bit) libQt6Bluetooth.so.6(Qt_6.4)(64bit) libQt6Bluetooth.so.6(Qt_6.5)(64bit) libQt6Bluetooth.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Bluetooth6 libQt6Bluetooth6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.32)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
