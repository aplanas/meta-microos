SUMMARY = "Server application for the Neo-Modus DC++ sharing network"
DESCRIPTION = "PtokaX Direct Connect Hub is a server application for Neo-Modus \
Direct Connect Peer-To-Peer sharing network. \
 \
PtokaX has a comprehensive user interface, tuned built-in features, \
scripting-based extendability."
LICENSE = "GPL-3.0-only"

PV = "0.5.2.2"

RPM_NAME = "ptokax-0.5.2.2-5.10.aarch64.rpm"
RPM_HASH = "b9fe9c9c1f01e737027ed09fb9d875d1fe521a101dd21ebf5d738e1964622ee8f5f92b964a8a89231d3ae136b2b5390b8d3c991c03c7e50a281439b56ffe47cc"

RPROVIDES:${PN} += "config(ptokax) ptokax ptokax(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.2.0)(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libtinyxml.so.0()(64bit) libz.so.1()(64bit) shadow"

inherit rpm
