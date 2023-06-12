SUMMARY = "Thrift non-blocking server library"
DESCRIPTION = "Shared library providing the non-blocking server component of the \
Thrift software framework."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "libthriftnb-0_17_0-0.17.0-1.6.aarch64.rpm"
RPM_HASH = "a37b8184a1616d2751952b02459d545e1e39cd5e0a25dba207f0621945536a4abf0b2b362bb7d004a6125733fa37bb2f4bfbb31bdff8e3d9f43e582296e23889"

RPROVIDES:${PN} += "libthriftnb-0.17.0.so()(64bit) \
libthriftnb-0_17_0 \
libthriftnb-0_17_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
