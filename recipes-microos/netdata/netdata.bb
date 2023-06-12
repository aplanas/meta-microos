SUMMARY = "A system for distributed real-time performance and health monitoring"
DESCRIPTION = "netdata is a system for distributed real-time performance and health monitoring. \
It provides insights, in real-time, of everything happening on the system it \
runs on (including applications such as web and database servers), \
using interactive web dashboards."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & MIT & BSD-3-Clause & LGPL-2.1-or-later & OFL-1.1 & CC-BY-4.0 & WTFPL"

PV = "1.39.1"

RPM_NAME = "netdata-1.39.1-1.1.aarch64.rpm"
RPM_HASH = "0990760afcb791fa75a794eb727c05c95c7c2478c7482b8c20d4440bbd49a4e77e3f75f2f31f160bdd7bec3612474db4efc98d55e8b47cae1b8a433cb132876c"

RPROVIDES:${PN} += "config(netdata) netdata netdata(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcups.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmnl.so.0()(64bit) libmnl.so.0(LIBMNL_1.0)(64bit) libnetfilter_acct.so.1()(64bit) libnetfilter_acct.so.1(LIBNETFILTER_ACCT_1.0)(64bit) libprotobuf-3.21.12.so()(64bit) libsnappy.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libuv.so.1()(64bit) libxenlight.so.4.17()(64bit) libxenlight.so.4.17(VERS_4.17.0)(64bit) libxenstat.so.4.17()(64bit) libxenstat.so.4.17(VERS_4.17.0)(64bit) libz.so.1()(64bit) shadow"

inherit rpm
