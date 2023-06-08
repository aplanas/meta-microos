SUMMARY = "Boost.Graph runtime library"
DESCRIPTION = "This package contains the Boost.Graph runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_graph1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "7e1882815700d4f39961d916a92d4a37c6fe44d011f511e63ddd8efce72a58bab66be602a645ba15414a03d089aa7305c757b65da5588cd5979cbff4c23951f1"

RPROVIDES:${PN} += "libboost_graph.so.1.82.0()(64bit) libboost_graph1_82_0 libboost_graph1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
