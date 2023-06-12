SUMMARY = "Boost.Container runtime library"
DESCRIPTION = "This package contains the Boost.Container runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_container1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "d8528365f529a485e76bb2c79674910299f31aaf2a4313b5f430a67615ca95f2ae03a19b29ccc332a4c2983851db17c2b8424597d52d49786d59d702ba83436e"

RPROVIDES:${PN} += "libboost_container.so.1.82.0()(64bit) libboost_container1_82_0 libboost_container1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
