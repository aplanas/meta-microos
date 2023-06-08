SUMMARY = "Libproxy module to support WPAD/PAC parsing via the WebKit JavaScript Engine"
DESCRIPTION = "A module to extend libproxy with capabilities to pass addresses to a \
WPAD/PAC script and have it find the correct proxy."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-pacrunner-webkit-0.4.18-1.6.aarch64.rpm"
RPM_HASH = "38d86270566e03194a85f4a2078e64b98f6760c0bfbe95f999fdbf906bb57e75c155e1af60f33cbfe250682f65ad90052f8832a5886269a7a93bdda4607157dc"

RPROVIDES:${PN} += "libproxy1-pacrunner libproxy1-pacrunner-webkit libproxy1-pacrunner-webkit(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjavascriptcoregtk-4.0.so.18()(64bit) libproxy.so.1()(64bit) libproxy1 libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
