SUMMARY = "Boost.TypeErasure runtime library"
DESCRIPTION = "This package contains Boost::TypeErasure runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_type_erasure1_82_0-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "bef130ade36d8de1c1ac1155f522cec425fa823567a9fe328607b0e8b20e9d202ac6bc61d04472b56b2fdfe5d5d03c89aca08b77691aa736673834100212b46a"

RPROVIDES:${PN} += "libboost_type_erasure.so.1.82.0()(64bit) libboost_type_erasure1_82_0 libboost_type_erasure1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig boost-license1_82_0 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
