SUMMARY = "Automatic proxy configuration management for applications"
DESCRIPTION = "libproxy is a library that provides automatic proxy configuration \
management. \
 \
Proxy autoconfiguration (PAC) requires JavaScript (which most \
applications do not have), and determing the PAC script location \
requires a WPAD protocol implementation, which complicate proxy \
support. libproxy exists to abstract this issue and provides \
an answer how to reach a certain network resource."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.4.18"

RPM_NAME = "libproxy1-0.4.18-2.1.aarch64.rpm"
RPM_HASH = "651afa2ca6c230b445b4aa3e90e71cbb925c075ed966145f43b5f03675aff266064e60f2341d0589988ab63436ebe15e4aa8c8a487c9f5dc277c39f46bae07f4"

RPROVIDES:${PN} += "libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libproxy1 libproxy1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.1)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
