SUMMARY = "Boost.URL runtime library"
DESCRIPTION = "This package contains the Boost::URL runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_url1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "004d5f389aed58952399a788572aa0fe1c4022ae3417a6589233bf4343e0b71002feba4c95724e60541ac695f04a212ce64762e5f1daac4de590c0f1e2f710af"

RPROVIDES:${PN} += "libboost_url.so.1.82.0()(64bit) libboost_url1_82_0 libboost_url1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
