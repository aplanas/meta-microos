SUMMARY = "Qt 6 Scxml library"
DESCRIPTION = "The Qt 6 Scxml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Scxml6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "d995912ce21219880ccb0df773c3edf1c5ef65eab5b9457395110d56b84952851341cd030a00449e36df708ea55396afe2462c88e48856c253d87f0a0c62af66"

RPROVIDES:${PN} += "libQt6Scxml.so.6()(64bit) libQt6Scxml.so.6(Qt_6)(64bit) libQt6Scxml.so.6(Qt_6.0)(64bit) libQt6Scxml.so.6(Qt_6.1)(64bit) libQt6Scxml.so.6(Qt_6.2)(64bit) libQt6Scxml.so.6(Qt_6.3)(64bit) libQt6Scxml.so.6(Qt_6.4)(64bit) libQt6Scxml.so.6(Qt_6.5)(64bit) libQt6Scxml.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Scxml6 libQt6Scxml6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
