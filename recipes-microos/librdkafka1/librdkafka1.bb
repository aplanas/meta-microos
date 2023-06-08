SUMMARY = "A library for changing configuration files"
DESCRIPTION = "librdkafka is a C library implementation of the Apache Kafka protocol, \
containing both Producer and Consumer support."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "librdkafka1-2.1.0-1.1.aarch64.rpm"
RPM_HASH = "e37d63b261575bac8522e8e71a0e28995067d38f0904840efa860c21575f2ad3c9dad00a7979f5c9fd0ca445377fd65024f2119fbe0d5a6327d0aa02fdbea30e"

RPROVIDES:${PN} += "librdkafka++.so.1()(64bit) librdkafka.so.1()(64bit) librdkafka1 librdkafka1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) liblz4.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsasl2.so.3()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit) libzstd.so.1()(64bit)"

inherit rpm
