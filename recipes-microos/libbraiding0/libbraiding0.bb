SUMMARY = "Library for computations on braid groups"
DESCRIPTION = "CBraid is a C++ library for various computations on braid groups, \
such as normal forms."
LICENSE = "GPL-2.0-or-later"

PV = "1.2"

RPM_NAME = "libbraiding0-1.2-1.3.aarch64.rpm"
RPM_HASH = "0bbb14fdf68f9afcccd7d9866081d3c56ca73856d6d8bbd1fc63cf1d4a2431872fc3e793ead9d7a5d45318de24820bcef00b6df0fa0ce89d2c2bb888b7f7ed50"

RPROVIDES:${PN} += "libbraiding.so.0()(64bit) libbraiding0 libbraiding0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.5)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
