SUMMARY = "Library for accessing AKAI disk images"
DESCRIPTION = "C++ library for accessing AKAI disk images"
LICENSE = "GPL-2.0-or-later"

PV = "4.3.0"

RPM_NAME = "libakai0-4.3.0-1.9.aarch64.rpm"
RPM_HASH = "5c531b0cfdb8524e81169f12f3c355edd20da1bb07cc4d5fb32a2f9e63bf734b7a38f4cdaed4f519eb32e3ca2cbe132e3e0f2542d3d2026873aae2e2e833cab1"

RPROVIDES:${PN} += "config(libakai0) \
libakai.so.0()(64bit) \
libakai0 \
libakai0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
