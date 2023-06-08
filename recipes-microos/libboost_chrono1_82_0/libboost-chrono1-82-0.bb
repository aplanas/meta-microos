SUMMARY = "The Boost::Chrono runtime library"
DESCRIPTION = "This package contains the Boost::Chrono runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_chrono1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "36f9944a903fbbae06a5bcc1b12594e1262c310b235c9721ac55e326ab9d2f3760fc1893cefb5d7c13389092b97a12769d3595f140157159e761e8a33b963501"

RPROVIDES:${PN} += "libboost_chrono.so.1.82.0()(64bit) libboost_chrono1_82_0 libboost_chrono1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
