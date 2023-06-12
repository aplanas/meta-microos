SUMMARY = "Library for the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.13"

RPM_NAME = "libwps-0_4-4-0.4.13-1.3.aarch64.rpm"
RPM_HASH = "31fae8b783fc30f3f1bfce796f76c81721c452a120d0dcfc1ce6d815152b0b79b80d71f3be4d3992d047428ce5558495e0fdc2c0412559e74e9927a589e4e37e"

RPROVIDES:${PN} += "libwps-0.4.so.4()(64bit) \
libwps-0_4-4 \
libwps-0_4-4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
librevenge-0.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
