SUMMARY = "Implementation of Hypertext Transfer Protocol version 2 in C"
DESCRIPTION = "This is an implementation of Hypertext Transfer Protocol version 2. \
 \
The framing layer of HTTP/2 is implemented as a form of reusable C library. \
On top of that, we have implemented HTTP/2 client, server and proxy. We \
have also developed load test and benchmarking tool for HTTP/2. \
 \
HPACK encoder and decoder are available as public API."
LICENSE = "MIT"

PV = "1.52.0"

RPM_NAME = "nghttp2-1.52.0-1.1.aarch64.rpm"
RPM_HASH = "24fe650ea6133bf7fff2e5908191437e8811acb00adcbe2939b41f53eedd141548c575b99e1d4742087be4e04e8c1c32383ca1beb0fb944b4a85c9d7b193de3f"

RPROVIDES:${PN} += "nghttp2 nghttp2(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcares.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libev.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libnghttp2.so.14()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libz.so.1()(64bit)"

inherit rpm
