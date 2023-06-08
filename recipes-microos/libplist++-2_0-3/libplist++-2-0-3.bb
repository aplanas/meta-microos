SUMMARY = "Library for handling Apple Binary and XML Property Lists"
DESCRIPTION = "libplist is a library for handling Apple Binary and XML Property Lists."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "2.2.0"

RPM_NAME = "libplist++-2_0-3-2.2.0-4.7.aarch64.rpm"
RPM_HASH = "3762585bc520cb342b061666e78341918bccee57ed16bcc65ecad2cfc628c22d6384c14ee3b78f7ff1eadc15e6565dde0b10d31c6fc5cf778b92cac5ea24d4a2"

RPROVIDES:${PN} += "libplist++-2.0.so.3()(64bit) libplist++-2_0-3 libplist++-2_0-3(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libplist-2.0.so.3()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
