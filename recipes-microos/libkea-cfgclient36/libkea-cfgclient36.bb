SUMMARY = "Kea DHCP server configuration client library"
DESCRIPTION = "The Kea DHCP server can be managed at runtime via the Control \
Channel. The CC allows an external entity (e.g. a tool run by a \
sysadmin or a script) to issue commands to the server which can \
influence its behavior or retreive information from it. Examples \
envisioned are: reconfiguration, statistics retrieval and \
manipulation, and shutdown. \
 \
Communication over the Control Channel is conducted using JSON \
structures."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-cfgclient36-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "73ec7ec73cd80ff8e70e18a6d3c68eb27809e5eabcdc13d00ec7f7950c51fd5bd0e45a8c015e8c93a51dd4e553314fae3badca4fae786483d775b8a7f65220d7"

RPROVIDES:${PN} += "libkea-cfgclient.so.36()(64bit) libkea-cfgclient36 libkea-cfgclient36(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkea-asiolink.so.40()(64bit) libkea-cc.so.39()(64bit) libkea-dhcp++.so.54()(64bit) libkea-exceptions.so.13()(64bit) libkea-hooks.so.57()(64bit) libkea-http.so.42()(64bit) libkea-log.so.35()(64bit) libkea-util.so.52()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.11)(64bit) libstdc++.so.6(CXXABI_1.3.13)(64bit) libstdc++.so.6(CXXABI_1.3.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
