SUMMARY = "Qt 6 OpcUa Client Library"
DESCRIPTION = "Qt 6 OpcUa Client Library."
LICENSE = "GPL-3.0-or-later & (LGPL-3.0-only | GPL-2.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6OpcUa6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "3db691c6d32d151231b7a7585dc3ef410326e0d092ea6ea62638e43c93b2d17e88a0d9b331804c53add9a2d5a1108ea028d91f387ba73309409dd578450d4a48"

RPROVIDES:${PN} += "libQt6OpcUa.so.6()(64bit) libQt6OpcUa.so.6(Qt_6)(64bit) libQt6OpcUa.so.6(Qt_6.0)(64bit) libQt6OpcUa.so.6(Qt_6.1)(64bit) libQt6OpcUa.so.6(Qt_6.2)(64bit) libQt6OpcUa.so.6(Qt_6.3)(64bit) libQt6OpcUa.so.6(Qt_6.4)(64bit) libQt6OpcUa.so.6(Qt_6.5)(64bit) libQt6OpcUa.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6OpcUa6 libQt6OpcUa6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Network.so.6()(64bit) libQt6Network.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit)"

inherit rpm
