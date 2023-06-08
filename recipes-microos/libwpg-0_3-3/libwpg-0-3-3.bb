SUMMARY = "Library to read and parse graphics in WordPerfect Graphics format"
DESCRIPTION = "libwpg is a C++ library to read and parse graphics in WPG (WordPerfect \
Graphics) format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.3.4"

RPM_NAME = "libwpg-0_3-3-0.3.4-2.1.aarch64.rpm"
RPM_HASH = "e04f2f3e2022716eed95b925e66666026e791b003085369e5a09f8551399f18b478cabe22b25d1a6d64525cfa15455c9753c83867ec90944d5af124b3287c835"

RPROVIDES:${PN} += "libwpg-0.3.so.3()(64bit) libwpg-0_3-3 libwpg-0_3-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) librevenge-0.0.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwpd-0.10.so.10()(64bit)"

inherit rpm
