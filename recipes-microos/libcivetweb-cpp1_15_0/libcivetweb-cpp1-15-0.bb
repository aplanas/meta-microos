SUMMARY = "Shared Object for applications that use civetweb embedded"
DESCRIPTION = "This package contains the shared library required by applications that \
are using civetweb's embeddable API to provide web services."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libcivetweb-cpp1_15_0-1.15-2.8.aarch64.rpm"
RPM_HASH = "d4a1dc43158e57e56a396d7da8d4fe01f60824f72ff972d1c3f97eacf046c040d5e30fc2061f224297ff979fe186211bd16f22308371a145d73ced9c48e8d640"

RPROVIDES:${PN} += "libcivetweb-cpp.so.1.15.0()(64bit) libcivetweb-cpp1_15_0 libcivetweb-cpp1_15_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcivetweb.so.1.15.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
