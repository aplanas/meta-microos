SUMMARY = "C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "libquazip1-qt6-1_4_0-1.4-2.3.aarch64.rpm"
RPM_HASH = "d35b06b8027cce638fcf1ce33068f927d74fafd44867f9fa013967427d04c77be07d53567d98a5c0d8edfaf12f29cd93bb74e87fb0980383e218431763022c95"

RPROVIDES:${PN} += "libquazip1-qt6-1_4_0 \
libquazip1-qt6-1_4_0(aarch-64) \
libquazip1-qt6.so.1.4.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.4)(64bit) \
libQt6Core5Compat.so.6()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libz.so.1()(64bit)"

inherit rpm
