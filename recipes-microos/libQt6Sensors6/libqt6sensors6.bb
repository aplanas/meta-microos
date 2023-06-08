SUMMARY = "Qt 6 Sensors library"
DESCRIPTION = "The Qt 6 Sensors library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6Sensors6-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "092c08d49edfb0df3ac4cae7b36fbd06a81017b8988dd82ce9162a94dcd55999ed1da87b58f1f00e3e9ba0777c886da3ecd4845f7cf8b29e29f2d0cc6fd1f9dd"

RPROVIDES:${PN} += "libQt6Sensors.so.6()(64bit) libQt6Sensors.so.6(Qt_6)(64bit) libQt6Sensors.so.6(Qt_6.0)(64bit) libQt6Sensors.so.6(Qt_6.1)(64bit) libQt6Sensors.so.6(Qt_6.2)(64bit) libQt6Sensors.so.6(Qt_6.3)(64bit) libQt6Sensors.so.6(Qt_6.4)(64bit) libQt6Sensors.so.6(Qt_6.5)(64bit) libQt6Sensors.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6Sensors6 libQt6Sensors6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Core.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
