SUMMARY = "Kea DHCP server asiolink abstraction layer library"
DESCRIPTION = "The asiodns library provides an abstraction layer between BIND10/Kea \
modules and the asiolink library."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "libkea-asiodns24-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "a4369587622c88a9267698ad50d738c29a850ac7193eacd54f3939d1fc7e2156591d5ec94259f77f20b4fe4c429ecdd7bcb6782c447e3e4ab52b2079fee42e74"

RPROVIDES:${PN} += "libkea-asiodns.so.24()(64bit) \
libkea-asiodns24 \
libkea-asiodns24(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-dns++.so.30()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-log.so.35()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
