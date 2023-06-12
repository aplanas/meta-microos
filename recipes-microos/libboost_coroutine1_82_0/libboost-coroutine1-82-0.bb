SUMMARY = "Boost::Coroutine runtime library"
DESCRIPTION = "This package contains the Boost Coroutine runtime library."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_coroutine1_82_0-1.82.0-1.2.aarch64.rpm"
RPM_HASH = "94a435bdc017afff027bb16ef0d8b2769db490e0d0526afe1ec0fff7779703b659609f5a20a2c00714c3576970399720d55e869ded805fff52b9985acd3f6695"

RPROVIDES:${PN} += "libboost_coroutine.so.1.82.0()(64bit) \
libboost_coroutine1_82_0 \
libboost_coroutine1_82_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1_82_0 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libboost_context.so.1.82.0()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
