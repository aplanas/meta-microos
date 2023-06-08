SUMMARY = "Kea DHCP http communication library"
DESCRIPTION = "This library is used by Control Agent to establish HTTP connections, \
receive messages and send responses over HTTP. This library uses \
boost ASIO for creating TCP connections and asynchronously receive \
and send the data over the sockets."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-http42-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "3705ddede484843dc957570b868eab8999c397c988803506cb30306faf986bd69d35b0840831aa1de7ee3332b9bffe015aafb3342a06209765179df6fe54d25b"

RPROVIDES:${PN} += "libkea-http.so.42()(64bit) libkea-http42 libkea-http42(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkea-asiolink.so.40()(64bit) libkea-cc.so.39()(64bit) libkea-exceptions.so.13()(64bit) libkea-hooks.so.57()(64bit) libkea-log.so.35()(64bit) libkea-util.so.52()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
