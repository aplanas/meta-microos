SUMMARY = "Microsoft Azure Storage Client SDK for C++"
DESCRIPTION = "A client library for working with Microsoft Azure storage services including blobs, files, tables, and queues. \
This client library enables working with the Microsoft Azure storage services which include the blob service for storing binary and text data, the file service for storing binary and text data, the table service for storing structured non-relational data, and the queue service for storing messages that may be accessed by a client."
LICENSE = "Apache-2.0"

PV = "7.5.0"

RPM_NAME = "libazurestorage7-7.5.0-1.16.aarch64.rpm"
RPM_HASH = "0cbcf6c579dda70bc52c571f324ac3bf10cbd35970195111e02b33a7eef4b923319ee027736a792cb235e0afa070d51960c2cde0376905ccc368d2ecd25582a1"

RPROVIDES:${PN} += "libazurestorage.so.7()(64bit) libazurestorage7 libazurestorage7(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libboost_log.so.1.82.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcpprest.so.2.10()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.19)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_1.0)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.5.0)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
