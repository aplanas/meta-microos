SUMMARY = "Passenger apache module"
DESCRIPTION = " \
A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use. \
 \
This package holds the apache2 sub package for passenger"
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-apache2-6.0.17-1.4.aarch64.rpm"
RPM_HASH = "15df3323739edb176da759e6f8f99d214d50ac5aa92586bce9438462796081966d4c645012aa844bd74519080f4012ce3aeb66c6570254f08f04a0c9a61529b5"

RPROVIDES:${PN} += "config(rubygem-passenger-apache2) rubygem-passenger-apache2 rubygem-passenger-apache2(aarch-64)"
RDEPENDS:${PN} += "apache2 apache_mmn_20120211 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libapr-1.so.0()(64bit) libaprutil-1.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) rubygem-passenger"

inherit rpm
