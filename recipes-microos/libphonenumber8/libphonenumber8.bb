SUMMARY = "Library for parsing, formatting, and validating international phone numbers"
DESCRIPTION = "Google's common Java, C++ and JavaScript library for parsing, formatting, \
and validating international phone numbers. The Java version is optimized \
for running on smartphones, and is used by the Android framework since 4.0 \
(Ice Cream Sandwich)."
LICENSE = "Apache-2.0"

PV = "8.12.23"

RPM_NAME = "libphonenumber8-8.12.23-1.29.aarch64.rpm"
RPM_HASH = "53a86b8bd3e69bd887f04ce5a14664dfc90fb496796bf7fe19a0eea3ed36de76c06c030c0349c8d0b51faf6f58da6f944ba3d7f6ff1b47a3ad6b22b3338985a2"

RPROVIDES:${PN} += "libphonenumber.so.8()(64bit) libphonenumber8 libphonenumber8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_thread.so.1.82.0()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicui18n.so.72()(64bit) libicuuc.so.72()(64bit) libprotobuf-3.21.12.so()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.10)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
