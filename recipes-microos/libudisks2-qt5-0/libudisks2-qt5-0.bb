SUMMARY = "Development tools for Deepin Anything"
DESCRIPTION = "UDisks2 library with Qt5 \
 \
UDisks2 DBus interfaces binding of Qt5."
LICENSE = "LGPL-3.0+"

PV = "5.0.6"

RPM_NAME = "libudisks2-qt5-0-5.0.6-1.8.aarch64.rpm"
RPM_HASH = "d1366304fe73d4c6545cc59fefa7d554b2a2a6b13b38c6fbab94882ed69c298b47e31bc33b1dd088d6bcb13d6ff3b9425c85c02fe4238aef9213654fb6b64f41"

RPROVIDES:${PN} += "libudisks2-qt5-0 libudisks2-qt5-0(aarch-64) libudisks2-qt5.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
