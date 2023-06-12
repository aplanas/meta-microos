SUMMARY = "Qt5 bindings for AppStream"
DESCRIPTION = "The Qt5 bindings for AppStream."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.16.1"

RPM_NAME = "libAppStreamQt2-0.16.1-3.1.aarch64.rpm"
RPM_HASH = "417b2cd3f43574f6a26089ac3d2e64216c9e0aba5b0bec35b3d6d0fc90d7bb9c923d9f785ccfc33a6222adc5481d4e962dabf05acb1f8178f0ec6b01cfe13440"

RPROVIDES:${PN} += "libAppStreamQt.so.2()(64bit) libAppStreamQt2 libAppStreamQt2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libappstream.so.4()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
