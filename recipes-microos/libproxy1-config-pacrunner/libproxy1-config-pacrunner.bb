SUMMARY = "Libproxy module for PacRunner configuration"
DESCRIPTION = " \
A module to extend libproxy with capabilities to query PacRunner about \
proxy settings."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-config-pacrunner-0.4.18-1.6.aarch64.rpm"
RPM_HASH = "43097734b026cd7723d54117a9a311e52ac2b11552346d45872886307f4fcd0ce70c21e90065a21a4f874ff084417a51c0f60047a24c789534d14178a7a65e43"

RPROVIDES:${PN} += "libproxy1-config-pacrunner libproxy1-config-pacrunner(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libproxy.so.1()(64bit) libproxy1 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
