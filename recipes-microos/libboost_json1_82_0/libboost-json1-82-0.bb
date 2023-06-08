SUMMARY = "Boost.JSON runtime library"
DESCRIPTION = "This package contains Boost::JSON runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_json1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "8d434f1315487ae72e787db7e7f17a02f063dd0d44171e5a5a0cf5bc2f414a5fcf60f00dec3e21699a7b23637a6f51f3682932c2853fd9373e28b6f3cfd52cc7"

RPROVIDES:${PN} += "libboost_json.so.1.82.0()(64bit) libboost_json1_82_0 libboost_json1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
