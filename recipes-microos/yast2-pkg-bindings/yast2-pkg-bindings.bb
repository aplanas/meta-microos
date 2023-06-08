SUMMARY = "YaST2 - Package Manager Access"
DESCRIPTION = "This package contains a name space for accessing the package manager \
library in YaST2."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-pkg-bindings-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "73cc22dbc13e37d34316efeee2f24c0d5b69c0c57136ec991636d529767b5ff30fedc5127b7bdf28e37d3e99592bf1872778baa3a6d3182449e793314a9ed11a"

RPROVIDES:${PN} += "libpy2Pkg.so.2()(64bit) yast2-pkg-bindings yast2-pkg-bindings(aarch-64)"
RDEPENDS:${PN} += "grep iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) liby2.so.4()(64bit) liby2util.so.5()(64bit) libycp.so.5()(64bit) libycpvalues.so.6()(64bit) libzypp.so.1722()(64bit) libzypp.so.1722(ZYPP_plain)(64bit)"

inherit rpm
