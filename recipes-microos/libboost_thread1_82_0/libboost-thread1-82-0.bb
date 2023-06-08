SUMMARY = "Boost.Thread runtime libraries"
DESCRIPTION = "This package contains the Boost.Thread runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_thread1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "27cccea7f5a2098d196afdf4caec15aac0e27549b62b342d499988ff572c5ed75bd98fd9788d3d781b8423a34335ce12ec2119372b549e8c7522a5b86bc57945"

RPROVIDES:${PN} += "libboost_thread.so.1.82.0()(64bit) libboost_thread1_82_0 libboost_thread1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
