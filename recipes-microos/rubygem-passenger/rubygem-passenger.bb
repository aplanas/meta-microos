SUMMARY = "A fast and robust web server and application server for Ruby, Python"
DESCRIPTION = "A modern web server and application server for Ruby, Python and Node.js, \
optimized for performance, low memory usage and ease of use."
LICENSE = "GPL-2.0-only & MIT"

PV = "6.0.17"

RPM_NAME = "rubygem-passenger-6.0.17-1.4.aarch64.rpm"
RPM_HASH = "2f84972671eda40e4fcf0947ecf364afe0c06b3d8106afce9ba78caf5d633644133784b78ed63df6ba45ad44d9ce86bdda8ac10ab6e5d4a16e2555a325a19838"

RPROVIDES:${PN} += "config(rubygem-passenger) rubygem-passenger rubygem-passenger(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/node /usr/bin/ruby libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) rubygem(passenger) update-alternatives"

inherit rpm
