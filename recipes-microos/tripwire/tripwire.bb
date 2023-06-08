SUMMARY = "A tool to observe the filesystem"
DESCRIPTION = "By using tripwire, it is possible to observe the filesystem. tripwire \
generates a database, controlled by a configuration file, of all \
files, their checksums, etc. and it reports changes."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3.7"

RPM_NAME = "tripwire-2.4.3.7-1.8.aarch64.rpm"
RPM_HASH = "df19b4c9275424ad15b44844a61d01696c71480e4f589797ca236b93f635ed00e5d977698a469c08e188580d089e6241902b8b347b63920953b945785d3dbada"

RPROVIDES:${PN} += "Tripwire config(tripwire) tripwire tripwire(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
