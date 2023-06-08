SUMMARY = "Boost.Container runtime library"
DESCRIPTION = "This package contains the Boost.Container runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_container1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "5e40bdaf1f59a7796c5e27543bb09c2aa8cb9d294a55908ac9ffb979ade5639bb0da25a5d2d6ad126d9b2e6a4cdd3cfae5820579eb7d18bfa846d4916a472128"

RPROVIDES:${PN} += "libboost_container.so.1.82.0()(64bit) libboost_container1_82_0 libboost_container1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
